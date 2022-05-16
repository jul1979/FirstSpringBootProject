package he2b.g48982.web5g.annualprogram.Model;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class SectionConverter implements AttributeConverter<Section, String> {

    @Override
    public String convertToDatabaseColumn(Section attribute) {

        if (attribute == null) {
            return null;
        }
        return attribute.getCharacter().toString();
    }

    @Override
    public Section convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        switch (dbData) {
            case "G":
                return Section.GESTION;
            case "I":
                return Section.INDUSTRIELLE;
            case "R":
                return Section.RESEAU;
        }
        return null;
    }
}