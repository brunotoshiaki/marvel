package br.com.brunotoshiaki.marvel.model.data;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class Characters implements Serializable {

  @Serial private static final long serialVersionUID = 1L;
  @Id private String uId;
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
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characters that = (Characters) o;
    return id == that.id && name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
