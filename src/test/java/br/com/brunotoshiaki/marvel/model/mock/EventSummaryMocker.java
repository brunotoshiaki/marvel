package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.EventSummary;
import java.util.ArrayList;
import java.util.List;

public class EventSummaryMocker {

  public static List<EventSummary> mockerEventSummary() {
    return new ArrayList<>(
        List.of(new EventSummary("http://gateway.marvel.com/v1/public/events/269", "Secret Invasion"))
    );
  }

}
