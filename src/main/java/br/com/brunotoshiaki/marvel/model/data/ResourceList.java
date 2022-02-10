package br.com.brunotoshiaki.marvel.model.data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResourceList implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int available;
    private int returned;
    private String collectionURI;
    private List<Item> items;

}
