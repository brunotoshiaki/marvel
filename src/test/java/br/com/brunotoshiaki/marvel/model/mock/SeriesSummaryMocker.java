package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.SeriesSummary;
import java.util.ArrayList;
import java.util.List;

public class SeriesSummaryMocker {

  public static List<SeriesSummary> mockerSeriesSummary() {
    return new ArrayList<>(
        List.of(new SeriesSummary("http://gateway.marvel.com/v1/public/series/1945", "Avengers: The Initiative (2007 - 2010)")
            , new SeriesSummary("http://gateway.marvel.com/v1/public/series/2005", "Deadpool (1997 - 2002)")
            , new SeriesSummary("http://gateway.marvel.com/v1/public/series/2045", "Marvel Premiere (1972 - 1981)")
        )

    );
  }
}
