package br.com.brunotoshiaki.marvel.model.mock;

import br.com.brunotoshiaki.marvel.model.dto.Url;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class UrlMocker {

  public static List<Url> mockerUrl() {
    return new ArrayList<>(
        List.of(new Url("http://gateway.marvel.com/v1/public/series/1945", "Avengers: The Initiative (2007 - 2010)")));
  }

}
