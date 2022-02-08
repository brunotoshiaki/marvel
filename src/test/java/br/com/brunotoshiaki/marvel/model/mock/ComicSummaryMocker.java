package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.ComicSummary;
import java.util.ArrayList;
import java.util.List;

public class ComicSummaryMocker {

  public static List<ComicSummary> mockComicSummary() {
    return new ArrayList<>(
        List.of(new ComicSummary("http://gateway.marvel.com/v1/public/comics/21366", "Avengers: The Initiative (2007) #14")
            , new ComicSummary("http://gateway.marvel.com/v1/public/comics/24571", "Avengers: The Initiative (2007) #14 (SPOTLIGHT VARIANT")
            , new ComicSummary("http://gateway.marvel.com/v1/public/comics/21546", "Avengers: The Initiative (2007) #15")
        )
    );
  }
}
