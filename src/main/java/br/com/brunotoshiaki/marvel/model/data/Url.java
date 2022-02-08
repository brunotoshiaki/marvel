package br.com.brunotoshiaki.marvel.model.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Url implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String type;
    @JsonProperty("url")
    private String urls;
}
