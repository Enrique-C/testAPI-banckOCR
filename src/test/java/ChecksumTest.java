import org.junit.Test;

import static org.junit.Assert.*;

public class ChecksumTest {
    @Test
    public void validate_ReadAFileWithAnEntry_0() {
        String filePath = "src/main/resources/file.txt";
        String textLines = TxtFileReader.read(filePath);

        Decoder decoder = new Decoder();
        Checksum checksum = new Checksum();

        decoder.loadStringDigits(textLines);
        decoder.generateDigits();
        int actualResult = checksum.validate(decoder.getDigits());
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}
