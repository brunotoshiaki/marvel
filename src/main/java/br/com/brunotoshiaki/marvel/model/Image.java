package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Image implements Serializable {
    private static final long serialVersionUID = 1L;

    private String path;
    private String extension;
}
