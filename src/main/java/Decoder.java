import java.util.ArrayList;

public class Decoder {

    ArrayList<Digit> digits = new ArrayList<>();
    ArrayList<String> lines = new ArrayList<>();

    public ArrayList<Digit> getDigits() {
        return digits;
    }

    public ArrayList<Digit> loadStringDigits(String characters) {
        generateTextLines(characters);

        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());
        digits.add(new Digit());

        for (String value : lines) {
            int startSting = 0;
            int endString = 3;
            for (Digit digit : digits) {
                digit.getCharactersCollection().append(value.substring(startSting, endString));
                startSting = startSting + 3;
                endString = endString + 3;
            }
        }

        return digits;
    }

    public String generateDigits() {
        String allDigits = "";
        for (Digit digit : digits) {
            digit.setNumber(analyzeStringDigit(digit.getCharactersCollection().toString()));
            allDigits = allDigits + digit.getNumber();
        }
        return allDigits;
    }

    private int analyzeStringDigit(String digit) {
        int result = 0;
        switch (digit) {
            case "     |  |   ":
                result = 1;
                break;
            case " _  _||_    ":
                result = 2;
                break;
            case " _  _| _|   ":
                result = 3;
                break;
            case "   |_|  |   ":
                result = 4;
                break;
            case " _ |_  _|   ":
                result = 5;
                break;
            case " _ |_ |_|   ":
                result = 6;
                break;
            case " _   |  |   ":
                result = 7;
                break;
            case " _ |_||_|   ":
                result = 8;
                break;
            case " _ |_| _|   ":
                result = 9;
                break;
        }
        return result;
    }

    private void generateTextLines(String characters) {
        int lengthLine = 27;
        while (characters.length() >= 27) {
            lines.add(characters.substring(0, lengthLine));
            characters = characters.substring(lengthLine);
        }
    }
}
