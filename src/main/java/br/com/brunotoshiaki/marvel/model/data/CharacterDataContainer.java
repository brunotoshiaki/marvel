package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDataContainer implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  private int offset ;
  private int limit;
  private int total;
  private int count;
  private Collection<Character> results;
}
