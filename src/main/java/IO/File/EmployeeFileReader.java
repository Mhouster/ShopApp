package IO.File;

import java.io.*;

public class EmployeeFileReader {
    static final String FILE_NAME = "EmployeeList.csv";
    public void fileReader() {
        try (
                FileReader fileReader = new FileReader(FILE_NAME);
                BufferedReader reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



