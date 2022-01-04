package br.com.brunotoshiaki.marvel.to;

import java.io.Serializable;
import java.util.List;

import br.com.brunotoshiaki.marvel.model.Character;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CharacterDataContainer implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Character> results;
}
