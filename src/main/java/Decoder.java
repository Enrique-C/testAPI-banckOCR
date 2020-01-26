import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Map<Integer,String> stringDigit = new HashMap<Integer,String>();
        stringDigit.put(1,"     |  |   ");
        stringDigit.put(2," _  _||_    ");
        stringDigit.put(3," _  _| _|   ");
        stringDigit.put(4,"   |_|  |   ");
        stringDigit.put(5," _ |_  _|   ");
        stringDigit.put(6," _ |_ |_|   ");
        stringDigit.put(7," _   |  |   ");
        stringDigit.put(8," _ |_||_|   ");
        stringDigit.put(9," _ |_| _|   ");

        for(Map.Entry entry: stringDigit.entrySet()){
            if(digit.equals(entry.getValue())){
                return  entry.getKey().hashCode();
            }
        }
        return 0;
    }

    private void generateTextLines(String characters) {
        int lengthLine = 27;
        while (characters.length() >= 27) {
            lines.add(characters.substring(0, lengthLine));
            characters = characters.substring(lengthLine);
        }
    }
}
