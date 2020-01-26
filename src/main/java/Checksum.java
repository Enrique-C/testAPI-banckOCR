import java.util.ArrayList;

public class Checksum {
    public int validate(ArrayList<Digit> digits) {
        int checksum = 0;
        int sizeList = digits.size();
        for (int i = 0; i < digits.size(); i++) {
            checksum += digits.get(i).getNumber() * sizeList;
            sizeList -= 1;
        }
        return checksum % 11;
    }
}
