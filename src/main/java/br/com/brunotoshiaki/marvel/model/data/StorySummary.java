package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StorySummary implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private String resourceURI;
  private String name;
  private String type;
}
