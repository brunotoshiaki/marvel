package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.ComicList;
import java.util.ArrayList;
import java.util.List;

public class ComicListMocker {

  public static ComicList mockComicList() {
    return ComicList
        .builder()
        .available(3)
        .returned(3)
        .collectionURI("http://gateway.marvel.com/v1/public/characters/1011334/comics")
        .items(ComicSummaryMocker.mockComicSummary())
        .build();
  }


}
