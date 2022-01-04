package br.com.brunotoshiaki.marvel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Data
@Builder
public class ComicSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    private String resourceURI;
    private String name;
}
