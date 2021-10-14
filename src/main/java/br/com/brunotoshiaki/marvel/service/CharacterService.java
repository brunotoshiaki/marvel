package br.com.brunotoshiaki.marvel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunotoshiaki.marvel.rest.client.RestApiClientController;

@Service
public class CharacterService {

    @Autowired
    private RestApiClientController restService;

    public String getCharacters() {
        return restService.restExecute("v1/public/characters");
    }

}
