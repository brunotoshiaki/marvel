package br.com.brunotoshiaki.marvel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class StorySummary implements Serializable {

    private static final long serialVersionUID = 1L;

    private String resourceURI;
    private String name;
    private String type;
}
