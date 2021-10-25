package storage;

import model.PhoneBook;

import java.io.*;
import java.util.ArrayList;

public class PhoneBookFile {

    private static PhoneBookFile phoneBookFile;

    public static PhoneBookFile getInstance() {
        if (phoneBookFile == null) {
            phoneBookFile = new PhoneBookFile();
        }
        return phoneBookFile;
    }


    public ArrayList<PhoneBook> readFile(ArrayList<PhoneBook> phoneBookArrayList) throws IOException, ClassNotFoundException {
        File file = new File("phoneBook.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.length() > 0) {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            ArrayList<PhoneBook> list = (ArrayList<PhoneBook>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;

        } else {
            return new ArrayList<>();
        }
    }

    public void writeFile(ArrayList<PhoneBook> phoneBookArrayList) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("phoneBook.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(phoneBookArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }


}
