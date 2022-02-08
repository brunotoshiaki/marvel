package br.com.brunotoshiaki.marvel.model.dto;

import java.io.Serial;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String resourceURI;
    private String name;
}
