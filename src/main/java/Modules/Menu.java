package Modules;

import ConsolePrinting.EmployeeListPrinting;
import ConsolePrinting.MenuPrinting;

import java.util.Scanner;

public class Menu {
    int userChoice;
    Scanner input = new Scanner(System.in);

    EmployeeListPrinting elp = new EmployeeListPrinting();

    public void menu() {
        do {
            MenuPrinting mp = new MenuPrinting();
            mp.menuOptions();
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    elp.printEmployeeList();
            }
        } while ((userChoice = input.nextInt()) == 9);
    }
}
