package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ResourceList implements Serializable {
    private static final long serialVersionUID = 1L;
    private int available;
    private int returned;
    private String collectionURI;
    private List<Item> items;

}
