package g48982.webg5.pae.model;

import java.util.Objects;
import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class GenreConverter implements AttributeConverter<Genre, String> {

  @Override
  public String convertToDatabaseColumn(Genre attribute) {
    if (attribute == null) {
      return null;
    }
    return attribute.name();
  }

  @Override
  public Genre convertToEntityAttribute(String dbData) {

    if (dbData == null) {
      return null;
    }
    return Stream.of(Genre.values())
        .filter(c -> Objects.equals(c.name(), dbData))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }

}
