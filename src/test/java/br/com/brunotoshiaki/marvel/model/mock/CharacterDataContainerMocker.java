package br.com.brunotoshiaki.marvel.model.mock;


import br.com.brunotoshiaki.marvel.model.dto.CharacterDataContainer;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CharacterDataContainerMocker {

  public static CharacterDataContainer mockCharacterDataContainer() {
    return CharacterDataContainer.builder().results(new ArrayList<>()).build();
  }
}
