package br.com.brunotoshiaki.marvel.model.mock;


import java.util.ArrayList;

import br.com.brunotoshiaki.marvel.to.CharacterDataContainer;
import lombok.Data;

@Data
public class CharacterDataContainerMocker {



    public static CharacterDataContainer mockCharacterDataContainer() {
        return CharacterDataContainer.builder().results(new ArrayList<>()).build();
    }

}
