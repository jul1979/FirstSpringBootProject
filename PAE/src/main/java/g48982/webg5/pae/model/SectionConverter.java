package g48982.webg5.pae.model;

import java.util.Objects;
import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class SectionConverter implements AttributeConverter<Section, String> {

  @Override
  public String convertToDatabaseColumn(Section attribute) {

    if (attribute == null) {
      return null;
    }
    return attribute.name();
  }

  @Override
  public Section convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      return null;
    }
    return Stream.of(Section.values()).filter(c -> Objects.equals(c.name(), dbData)).findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }

}
