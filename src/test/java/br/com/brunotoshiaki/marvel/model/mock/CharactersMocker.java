package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.data.Characters;

public class CharactersMocker {

    public static Characters mockCharacters() {
    return Characters.builder()
        .id(1011334)
        .name("3-D Man")
        .description("")
        .modified("2014-04-29T14:18:17-0400")
        .resourceURI("http://gateway.marvel.com/v1/public/characters/1011334")
        .thumbnail(ImageMocker.mockImage())

        .build();
    }
}
