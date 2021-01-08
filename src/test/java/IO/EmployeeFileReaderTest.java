package IO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


class EmployeeFileReaderTest {
    @Test
    void EmployeeFileCheck() {
        File fileName = new File("EmployeeList.csv");
        Assertions.assertTrue(fileName.exists());
    }
}