package br.com.brunotoshiaki.marvel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ComicList implements Serializable {

    private static final long serialVersionUID = 1L;

    private int available;
    private int returned;
    private String collectionURI;
    private List<ComicSummary> items;

}
