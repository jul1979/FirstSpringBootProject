package he2b.g48982.web5g.annualprogram.Model;

public enum Section {
    GESTION('G'),INDUSTRIELLE('I'),RESEAU('R');

    private Character character;

    Section(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }
}
