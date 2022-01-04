package br.com.brunotoshiaki.marvel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Builder
@Data
public class EventSummary implements Serializable {
    private static final long serialVersionUID = 1L;
    private String resourceURI;
    private String name;
}
