package br.com.brunotoshiaki.marvel.rest.client;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;
import org.springframework.web.reactive.function.client.WebClient;
import br.com.brunotoshiaki.marvel.utils.Utils;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

public class CharacterServiceTest {
    private static MockWebServer mockWebServer = new MockWebServer();
    private static RestApiClientController controller =
            new RestApiClientController(WebClient.builder(),
                    mockWebServer.url("/v1/public/characters").toString());


    @Test
    public void getCharactersTest() throws InterruptedException, IOException {

        var json = Utils.readFile("src/test/resources/characters.json");

        MockResponse mockResponse = new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setBody(json);

        mockWebServer.enqueue(mockResponse);

        String result = controller.restExecute("/v1/public/characters");

        assertEquals(json, result);

    }

}
