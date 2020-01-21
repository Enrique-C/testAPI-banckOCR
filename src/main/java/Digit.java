public class Digit {

    private StringBuilder charactersCollection;
    private int number;

    public Digit() {
        this.charactersCollection = new StringBuilder();
    }

    public StringBuilder getCharactersCollection() {
        return charactersCollection;
    }

    public void setCharactersCollection(StringBuilder charactersCollection) {
        this.charactersCollection = charactersCollection;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
