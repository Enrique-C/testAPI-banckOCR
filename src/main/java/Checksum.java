import java.util.ArrayList;

public class Checksum {
    public int validate(ArrayList<Digit> digits) {
        return (digits.get(8).getNumber() + 2 * digits.get(7).getNumber() + 3 * digits.get(6).getNumber() + 4 *
                digits.get(5).getNumber() + 5 * digits.get(4).getNumber() + 6 * digits.get(3).getNumber() + 7 *
                digits.get(2).getNumber() + 8 * digits.get(1).getNumber() + 9 * digits.get(0).getNumber()) % 11;
    }
}
