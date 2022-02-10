package br.com.brunotoshiaki.marvel.model.mock;


import br.com.brunotoshiaki.marvel.model.data.CharacterDataContainer;
import lombok.Data;

@Data
public class CharacterDataContainerMocker {

  public static CharacterDataContainer mockCharacterDataContainer() {
    return CharacterDataContainer.builder()
        .offset(0)
        .limit(1)
        .total(1559)
        .count(1)
        .results(CharacterMocker.mockCharacters())
        .build();
  }
}
