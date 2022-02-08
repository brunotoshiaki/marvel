package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.Image;
import lombok.Data;

@Data
public class ImageMocker {

  public static Image mockImage() {
    return Image.builder()
        .path("http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784")
        .extension("jpg")
        .build();
  }
}
