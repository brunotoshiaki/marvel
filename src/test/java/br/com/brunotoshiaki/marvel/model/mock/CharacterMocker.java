package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.data.Character;
import java.util.ArrayList;
import java.util.List;

public class CharacterMocker {

  private static Character mockCharacter() {
    return Character.
        builder()
        .id(1011334)
        .name("3-D Man")
        .description("")
        .modified("2014-04-29T14:18:17-0400")
        .resourceURI("http://gateway.marvel.com/v1/public/characters/1011334")
        .urls(UrlMocker.mockerUrl())
        .thumbnail(ImageMocker.mockImage())
        .comics(ComicListMocker.mockComicList())
        .stories(StoryListMocker.mockStoryList())
        .events(EventListMocker.mockEventListMocker())
        .series(SeriesListMocker.mockerSeriesList())
        .build();
  }

  public static List<Character> mockCharacters() {
    return new ArrayList<>(List.of(mockCharacter()));
  }
}
