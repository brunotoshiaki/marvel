package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.StorySummary;
import java.util.ArrayList;
import java.util.List;

public class StorySummaryMocker {

  public static List<StorySummary> mockStorySummary() {
    return new ArrayList<>(
        List.of(new StorySummary("http://gateway.marvel.com/v1/public/stories/19947", "Cover #19947", "cover")
            , new StorySummary("http://gateway.marvel.com/v1/public/stories/19948", "The 3-D Man!", "interiorStory")
            , new StorySummary("http://gateway.marvel.com/v1/public/stories/19949", "Cover #19949", "cover")
        )
    );

  }

}
