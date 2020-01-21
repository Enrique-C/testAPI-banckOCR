import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TxtFileReaderTest {

    @Test
    public void read_ReadAFileOfAFilePath_String() {
        String filePath = "src/main/resources/file.txt";
        String actualResult = TxtFileReader.read(filePath);

        assertNotNull(actualResult);
    }
}