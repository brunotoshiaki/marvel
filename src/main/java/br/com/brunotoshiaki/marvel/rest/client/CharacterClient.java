package br.com.brunotoshiaki.marvel.rest.client;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.brunotoshiaki.marvel.utils.Utils;

@Service
public class CharacterClient {

    @Autowired
    WebClient webClient;

    public String getCharacters() {

        try {
            String[] key = Utils.getKey().split(";");

            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.path("/v1/public/characters").queryParam("ts", 1)
                            .queryParam("apikey", key[0]).queryParam("hash", key[1]).build())
                    .retrieve().bodyToMono(String.class).block();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return "";
    }
}
