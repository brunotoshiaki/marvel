package br.com.brunotoshiaki.marvel.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vertx.core.json.JsonObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

  public static JsonObject jsonFileToJsonObject(String path) throws IOException {
    return new JsonObject(Files.readString(Paths.get(path)));
  }

  public static String readFile(String path) throws IOException {
    return Files.readString(Paths.get(path));
  }

  public static <T> T toObject(JsonObject json, Class<T> deserializador) throws JsonProcessingException {
    return new ObjectMapper().readValue(json.toString(), deserializador);
  }


}
