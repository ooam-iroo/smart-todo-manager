package util;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {

        System.out.println("\n===== Smart Todo Manager =====");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

    }

    public int getUserChoice(){
        showMenu();
        return scanner.nextInt();
    }
}
