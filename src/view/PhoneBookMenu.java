package view;

import control.PhoneBookManager;
import model.PhoneBook;
import storage.PhoneBookFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PhoneBookMenu {
    PhoneBookManager phoneBookManager = new PhoneBookManager();
    PhoneBookFile phoneBookFile = PhoneBookFile.getInstance();

    public PhoneBookManager getPhoneBookManager() {
        return phoneBookManager;
    }

    public void setPhoneBookManager(PhoneBookManager phoneBookManager) {
        this.phoneBookManager = phoneBookManager;
    }

    public PhoneBookMenu() {
    }
    private static class  PhoneBookMenuHelper{
        private static final PhoneBookMenu INSTANCE = new PhoneBookMenu();
    }
    public static PhoneBookMenu getInstance(){
        return PhoneBookMenuHelper.INSTANCE;
    }


    public void runPhoneBook() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);


        int choice = -1;
        while (choice != 0) {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ-----");
            System.out.println("Chọn chức năng theo số : ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhập");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    phoneBookManager.showAllListContacts();
                    break;
                case 2:
                    addPhoneBook(phoneBookManager);
                    break;
                case 3:
                    editPhoneBook(phoneBookManager);
                    break;
                case 4:
                    removePhoneBook(phoneBookManager);
                    break;
                case 5:
                    System.out.println( "Số điện thoại cần tìm là :" +   phoneBookManager.searchPhoneBook(inputPhoneNumber()));
                    break;
                case 6:
                    readFile();
                    break;
                case 7:
                    writeFile();
                    break;
                case 8:

            }
        }
    }


    //them danh ba
    public void addPhoneBook(PhoneBookManager phoneBookManager){
        phoneBookManager.addPhoneBook(inputPhoneBook());
    }
    //sua danh ba
    public void editPhoneBook(PhoneBookManager phoneBookManager){
        phoneBookManager.searchPhoneBook(inputPhoneNumber());
    }
    // xoa danh ba
    public void removePhoneBook(PhoneBookManager phoneBookManager){
        phoneBookManager.removePhoneBook(inputPhoneNumber());
    }
    //ghi file
    public void writeFile(){
        try {
            phoneBookFile.writeFile(phoneBookManager.getPhoneBookArrayList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //doc file
    public void readFile() throws IOException, ClassNotFoundException {

       phoneBookManager.setPhoneBookArrayList(phoneBookFile.readFile(phoneBookManager.getPhoneBookArrayList()));
    }
    // input phonebook
    public PhoneBook inputPhoneBook() {
        System.out.println("nhap thong tin danh ba");
        Scanner sc = new Scanner(System.in);

        String phoneNumber;
        String groupOfContacts;
        String userName;
        String address;
        String email;
        String gender;
        String birthOfDay;

        System.out.println("Nhập số điện thoại");
        phoneNumber = sc.nextLine();
        System.out.println("nhập nhóm danh bak");
        groupOfContacts = sc.nextLine();
        System.out.println("nhập tên danh bạ");
        userName = sc.nextLine();
        System.out.println("nhập địa chỉ");
        address = sc.nextLine();
        System.out.println("nhập email");
        email = sc.nextLine();
        System.out.println("Nhập giới tính");
        gender= sc.nextLine();
        System.out.println("Nhập ngày tháng nam sinh");
        birthOfDay = sc.nextLine();

        return new PhoneBook(phoneNumber,groupOfContacts,userName,address,email,gender,birthOfDay);
    }

    // nhap input phoneNumber
    public String inputPhoneNumber(){
        System.out.println("Nhập số điện thoại");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
