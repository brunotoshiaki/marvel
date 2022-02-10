package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Character implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  private int id;
  private String name;
  private String description;
  private String modified;
  private String resourceURI;
  private List<Url> urls;
  private Image thumbnail;
  private ComicList comics;
  private StoryList stories;
  private EventList events;
  private SeriesList series;
}
