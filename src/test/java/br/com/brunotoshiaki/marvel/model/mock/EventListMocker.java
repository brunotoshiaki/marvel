package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.EventList;

public class EventListMocker {

  public static EventList mockEventListMocker() {
    return EventList
        .builder()
        .available(1)
        .returned(1)
        .collectionURI("http://gateway.marvel.com/v1/public/characters/1011334/events")
        .items(EventSummaryMocker.mockerEventSummary())
        .build();

  }


}
