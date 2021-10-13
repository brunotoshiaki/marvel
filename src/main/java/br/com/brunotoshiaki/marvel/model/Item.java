package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private String resourceURI;
    private String name;
}
