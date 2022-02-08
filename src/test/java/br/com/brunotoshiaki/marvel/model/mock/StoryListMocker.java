package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.StoryList;

public class StoryListMocker {

  public static StoryList mockStoryList() {
    return StoryList
        .builder()
        .available(3)
        .returned(3)
        .collectionURI("http://gateway.marvel.com/v1/public/characters/1011334/stories")
        .items(StorySummaryMocker.mockStorySummary())
        .build();
  }


}
