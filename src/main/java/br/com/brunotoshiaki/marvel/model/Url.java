package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Url implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private String url;
}
