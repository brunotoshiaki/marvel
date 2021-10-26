package br.com.brunotoshiaki.marvel.model.to;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private String resourceURI;
    private String name;
}
