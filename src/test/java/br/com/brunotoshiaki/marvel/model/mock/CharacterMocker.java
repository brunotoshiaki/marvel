package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.Character;

public class CharacterMocker {

    public static Character mockCharacter() {
        return Character
                .builder()
                .id(1011334)
                .name("3-D Man")
                .description("")
                .modified("2014-04-29T14:18:17-0400")
                .thumbnail(ImageMocker.mockImage())
                .resourceURI("http://gateway.marvel.com/v1/public/characters/1011334")


                .build();

    }
}
