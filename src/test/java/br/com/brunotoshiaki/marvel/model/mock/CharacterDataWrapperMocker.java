package br.com.brunotoshiaki.marvel.model.mock;


import br.com.brunotoshiaki.marvel.model.data.CharacterDataWrapper;
import lombok.Data;

@Data
public class CharacterDataWrapperMocker {

  public static CharacterDataWrapper mockCharacterDataWrapper() {
    return CharacterDataWrapper.builder()
        .code(200)
        .status("ok")
        .copyright("© 2021 MARVEL")
        .attributionText("Data provided by Marvel. © 2021 MARVEL")
        .attributionHTML("<a href=\"http://marvel.com\">Data provided by Marvel. © 2021 MARVEL</a>")
        .etag("a3c6ec51204f012456a45086ee054f51dcfbd50a")
        .data(CharacterDataContainerMocker.mockCharacterDataContainer())
        .build();
  }
}
