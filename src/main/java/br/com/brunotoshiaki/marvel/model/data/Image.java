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
public class Image implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;
  private String path;
  private String extension;
}
