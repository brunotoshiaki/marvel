package br.com.brunotoshiaki.marvel.to;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int ts;
    private String apikey;
    private String hash;

}
