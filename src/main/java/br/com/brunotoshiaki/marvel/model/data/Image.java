package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;
  private String path;
  private String extension;
}
