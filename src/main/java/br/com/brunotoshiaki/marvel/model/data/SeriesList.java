package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesList implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int available;
    private int returned;
    private String collectionURI;
    private List<SeriesSummary> items;
}
