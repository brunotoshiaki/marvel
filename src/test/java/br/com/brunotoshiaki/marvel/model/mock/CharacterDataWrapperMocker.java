package br.com.brunotoshiaki.marvel.model.mock;


import br.com.brunotoshiaki.marvel.model.dto.CharacterDataContainer;
import lombok.Data;

@Data
public class CharacterDataWrapperMocker {

  public static CharacterDataContainer mockCharacterDataContainer() {
    return CharacterDataContainer.builder().build();
  }
}
