package br.com.brunotoshiaki.marvel.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import br.com.brunotoshiaki.marvel.exeption.MarvelApiExeption;
import br.com.brunotoshiaki.marvel.utils.Utils;

@Controller
public class RestApiClientController {

    @Autowired
    WebClient webClient;

    public RestApiClientController(WebClient.Builder builder, String usersBaseUrl) {
        this.webClient = builder.baseUrl(usersBaseUrl).build();
    }

    public String restExecute(String path) {
        var key = Utils.getKey();
        try {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path(path)
                            .queryParam("ts", key.getTs())
                            .queryParam("apikey", key.getApikey())
                            .queryParam("hash", key.getHash()).build())
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

        } catch (WebClientResponseException we) {
            throw new MarvelApiExeption(we.getMessage(), we.getRawStatusCode());
        }

    }

}
