package br.com.brunotoshiaki.marvel.utils;

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

    public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }

    public static JsonObject jsonFileToJsonObject(String path) throws IOException {
        return new JsonObject(Files.readString(Paths.get(path)));
    }

    public static <R> R jsonFileToObject(String path, Class<R> clazz) throws IOException {
        return jsonFileToJsonObject(path).mapTo(clazz);
    }

}
