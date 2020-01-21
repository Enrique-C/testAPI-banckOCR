import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoderTest {

    @Test
    public void loadStringDigits_ReadAFileWithAnEntry_DigitListLength9() {
        String filePath = "src/main/resources/file.txt";
        String textLines = TxtFileReader.read(filePath);

        Decoder decoder = new Decoder();
        int actualResult = decoder.loadStringDigits(textLines).size();
        int expectedResult = 9;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void generateDigits_ReadAFileWithAnEntry_123456789() {
        String filePath = "src/main/resources/file.txt";
        String textLines = TxtFileReader.read(filePath);

        Decoder decoder = new Decoder();
        decoder.loadStringDigits(textLines);
        String actualResult = decoder.generateDigits();
        String expectedResult = "123456789";

        assertEquals(expectedResult, actualResult);
    }
}
