package br.com.brunotoshiaki.marvel.to;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image implements Serializable {
    private static final long serialVersionUID = 1L;

    private String path;
    private String extension;
}
