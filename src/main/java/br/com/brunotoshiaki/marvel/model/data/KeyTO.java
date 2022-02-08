package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyTO implements Serializable {
  @Serial private static final long serialVersionUID = 1L;
  private int ts;
  private String apikey;
  private String hash;
}
