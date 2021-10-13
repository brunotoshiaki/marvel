package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Character implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String name;
    private String description;
    private String modified;
    private String resourceURI;
    private List<Url> urls;
    private Image thumbnail;
    private List<ResourceList> comics;
    private List<ResourceList> stories;
    private List<ResourceList> events;
    private List<ResourceList> series;

}
