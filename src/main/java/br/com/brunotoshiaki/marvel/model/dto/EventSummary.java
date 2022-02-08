package br.com.brunotoshiaki.marvel.model.dto;

import java.io.Serial;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Builder
@Data
@AllArgsConstructor
public class EventSummary implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String resourceURI;
    private String name;
}
