package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StoryList implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private int available;
  private int returned;
  private String collectionURI;
  private List<StorySummary> items;
}
