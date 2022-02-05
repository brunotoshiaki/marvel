package br.com.brunotoshiaki.marvel.model.to;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CharacterDataContainer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private List<Character> results;
}
