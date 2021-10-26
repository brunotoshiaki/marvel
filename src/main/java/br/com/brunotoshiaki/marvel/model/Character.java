package br.com.brunotoshiaki.marvel.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import br.com.brunotoshiaki.marvel.model.to.Image;
import br.com.brunotoshiaki.marvel.model.to.ResourceList;
import br.com.brunotoshiaki.marvel.model.to.Url;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class Character implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String uId;
    private int id;
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


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Character)) {
            return false;
        }
        Character character = (Character) o;
        return Objects.equals(name, character.name)
                && Objects.equals(description, character.description)
                && Objects.equals(modified, character.modified)
                && Objects.equals(resourceURI, character.resourceURI)
                && Objects.equals(thumbnail, character.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, modified, resourceURI, thumbnail);
    }



}
