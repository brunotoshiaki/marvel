package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDataWrapper implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  private int code;
  private String status;
  private String copyright;
  private String attributionText;
  private String attributionHTML;
  private CharacterDataContainer data;
  private String etag;


}
