package main;

import view.PhoneBookMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PhoneBookMenu phoneBookMenu = new PhoneBookMenu();
        try {
            phoneBookMenu.runPhoneBook();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
