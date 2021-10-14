package br.com.brunotoshiaki.marvel.exeption;

import lombok.Getter;

@Getter
public class MarvelApiExeption extends RuntimeException {
    private static final long serialVersionUID = -7661881974219233311L;
    private final int statusCode;

    public MarvelApiExeption(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

}