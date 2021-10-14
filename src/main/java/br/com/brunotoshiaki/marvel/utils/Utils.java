package br.com.brunotoshiaki.marvel.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import br.com.brunotoshiaki.marvel.model.KeyTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

    public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }

    public static KeyTO getKey() {
        try {
            var obj = readFile("src/main/resources/key.bc").split(";");
            return new KeyTO(1, obj[0], obj[1]);
        } catch (IOException e) {

            log.error(e.getMessage());
        }
        return new KeyTO();
    }

}
