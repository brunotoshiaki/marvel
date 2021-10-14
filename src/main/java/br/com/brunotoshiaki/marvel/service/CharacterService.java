package br.com.brunotoshiaki.marvel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunotoshiaki.marvel.rest.client.CharacterClient;

@Service
public class CharacterService {

    @Autowired
    CharacterClient cliente;

    public String getCharacter() {
        return cliente.getCharacters();
    }

}
