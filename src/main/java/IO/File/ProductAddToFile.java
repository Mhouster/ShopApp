package IO.File;

import Model.Employee;
import Model.Product;

import java.io.*;
import java.util.Scanner;

public class ProductAddToFile {

    private static final Scanner INPUT = new Scanner(System.in);

    String fileName = "Product.csv";

    public void addProductToFile(Product product) {
        try (
                var writer = new BufferedWriter(new FileWriter(fileName, true));
                var fileReader =new FileReader(fileName);
        ){
            writer.newLine();
            writer.write(String.valueOf(product));
        } catch(IOException e){
            System.err.println("Cannot save file " + fileName);
        }
    }
}
