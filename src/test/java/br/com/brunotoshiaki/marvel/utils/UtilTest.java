package br.com.brunotoshiaki.marvel.utils;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import io.vertx.core.json.JsonObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;


public class UtilTest {

  private static final String FILE = "src/test/resources/resourceCharacters.json";

  @Test
  public void jsonFileToJsonObjectTest() {
    try {
      var result = Utils.jsonFileToJsonObject(FILE);
      var expected = new JsonObject(Files.readString(Paths.get(FILE)));
      assertEquals(expected, result);
    } catch (IOException e) {
      fail(e.getMessage());
      e.printStackTrace();
    }

  }

  @Test
  public void readFileTest() {
    try {
      var result = Utils.readFile("src/test/resources/teste.txt");
      assertEquals("teste", result.trim());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
