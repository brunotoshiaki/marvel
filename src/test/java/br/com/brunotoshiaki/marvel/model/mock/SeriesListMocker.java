package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.data.SeriesList;

public class SeriesListMocker {

  public static SeriesList mockerSeriesList() {
    return SeriesList
        .builder()
        .available(3)
        .returned(3)
        .collectionURI("http://gateway.marvel.com/v1/public/characters/1011334/series")
        .items(SeriesSummaryMocker.mockerSeriesSummary())
        .build();

  }

}
