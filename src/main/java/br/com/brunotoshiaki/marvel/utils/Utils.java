package br.com.brunotoshiaki.marvel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.apache.commons.io.IOUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

    private static Optional<String> readFile() {
        try {
            var classLoader = Utils.class.getClassLoader();
            var file = new File(classLoader.getResource("key.bc").getFile());
            var inputStream = new FileInputStream(file);
            return Optional.of(IOUtils.toString(inputStream, StandardCharsets.UTF_8));
        } catch (IOException ex) {
            log.error(ex.getMessage());
        }

        return Optional.empty();
    }

    public static String getKey() throws FileNotFoundException {
        var key = readFile();

        if (key.isPresent()) {
            return key.get();
        } else {
            throw new FileNotFoundException("Arquivo não encotrado");
        }

    }

}
