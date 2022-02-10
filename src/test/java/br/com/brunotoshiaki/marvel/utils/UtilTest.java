package br.com.brunotoshiaki.marvel.utils;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import br.com.brunotoshiaki.marvel.model.data.CharacterDataWrapper;
import br.com.brunotoshiaki.marvel.model.mock.CharacterDataWrapperMocker;
import io.vertx.core.json.JsonObject;
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
    } catch (Exception e) {
      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  @Test
  public void readFileTest() {
    try {
      var result = Utils.readFile("src/test/resources/teste.txt");
      assertEquals("teste", result.trim());
    } catch (Exception e) {
      e.printStackTrace();
      fail(e.getMessage());
    }
  }

  @Test
  public void jsonFileToObjectTest() {
    try {
      var jsonObject = Utils.jsonFileToJsonObject(FILE);
      var characterDataWrapper = Utils.toObject(jsonObject, CharacterDataWrapper.class);
      var mockcharacterDataWrapper = CharacterDataWrapperMocker.mockCharacterDataWrapper();
      assertEquals(mockcharacterDataWrapper.getCode(), characterDataWrapper.getCode());
      assertEquals(1, characterDataWrapper.getData().getResults().size());

    } catch (Exception e) {
      fail(e.getMessage());
      e.printStackTrace();

    }
  }

}
