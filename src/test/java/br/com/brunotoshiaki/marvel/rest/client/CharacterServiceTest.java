package br.com.brunotoshiaki.marvel.rest.client;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.reactive.function.client.WebClient;
import br.com.brunotoshiaki.marvel.utils.Utils;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@SpringBootTest
public class CharacterServiceTest {

  private static MockWebServer mockWebServer;
  private static RestApiClientController controller;

  @Before
  public void setUp() throws IOException {
    mockWebServer = new MockWebServer();
    mockWebServer.start();
    controller =
        new RestApiClientController(
            WebClient.builder(), mockWebServer.url("/v1/public/characters").toString());
  }

  @Test
  public void getCharactersTest() throws IOException {

    var json = Utils.readFile("src/test/resources/resourceCharacters.json");

    var mockResponse =
        new MockResponse()
            .addHeader("Content-Type", "application/json; charset=utf-8")
            .setBody(json);

    mockWebServer.enqueue(mockResponse);

    var result = controller.restExecute("/v1/public/characters");

    assertEquals(json, result);
  }

  @After
  public void tearDown() throws IOException {
    mockWebServer.shutdown();
  }
}
