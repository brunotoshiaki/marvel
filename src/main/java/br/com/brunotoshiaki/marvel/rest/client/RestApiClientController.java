package br.com.brunotoshiaki.marvel.rest.client;


import br.com.brunotoshiaki.marvel.exeption.MarvelApiExeption;
import br.com.brunotoshiaki.marvel.model.data.KeyTO;
import br.com.brunotoshiaki.marvel.utils.Utils;
import java.io.IOException;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Slf4j
public class RestApiClientController {

  private final WebClient webClient;


  public RestApiClientController(WebClient.@NotNull Builder builder, String usersBaseUrl) {
    this.webClient = builder.baseUrl(usersBaseUrl).build();
  }

  private KeyTO getKey() {
    try {
      var obj = Utils.readFile("src/main/resources/key.bc").split(";");
      return new KeyTO(1, obj[0], obj[1]);
    } catch (IOException e) {

      log.error(e.getMessage());
    }
    return new KeyTO();
  }

  public String restExecute(String path) {
    var key = this.getKey();
    try {
      return webClient
          .get()
          .uri(
              uriBuilder ->
                  uriBuilder
                      .path(path)
                      .queryParam("ts", key.getTs())
                      .queryParam("apikey", key.getApikey())
                      .queryParam("hash", key.getHash())
                      .build())
          .retrieve()
          .bodyToMono(String.class)
          .block();

    } catch (WebClientResponseException we) {
      throw new MarvelApiExeption(we.getMessage(), we.getRawStatusCode());
    }
  }
}
