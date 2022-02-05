package br.com.brunotoshiaki.marvel.rest.client;

import br.com.brunotoshiaki.marvel.exeption.MarvelApiExeption;
import br.com.brunotoshiaki.marvel.utils.Utils;
import javax.validation.constraints.NotNull;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

public class RestApiClientController {

  private final WebClient webClient;

  public RestApiClientController(WebClient.@NotNull Builder builder, String usersBaseUrl) {
    this.webClient = builder.baseUrl(usersBaseUrl).build();
  }

  public String restExecute(String path) {
    var key = Utils.getKey();
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
