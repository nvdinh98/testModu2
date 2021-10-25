package control;

import model.PhoneBook;

import java.util.ArrayList;

public class PhoneBookManager {
    ArrayList<PhoneBook> phoneBookArrayList = new ArrayList<>();

    public PhoneBookManager() {
    }

    private static class PhoneBookHelper{
        private static final PhoneBookManager INSTANCE = new PhoneBookManager();
    }
    public static PhoneBookManager getInstance(){
        return PhoneBookHelper.INSTANCE;
    }

    public PhoneBookManager(ArrayList<PhoneBook> phoneBookArrayList) {
        this.phoneBookArrayList = phoneBookArrayList;
    }

    public ArrayList<PhoneBook> getPhoneBookArrayList() {
        return phoneBookArrayList;
    }

    public void setPhoneBookArrayList(ArrayList<PhoneBook> phoneBookArrayList) {
        this.phoneBookArrayList = phoneBookArrayList;
    }

    // hien thi danh sach danh ba
    public void showAllListContacts(){
        for (PhoneBook phoneBook : phoneBookArrayList
             ) {
            System.out.println(phoneBook);
        }
    }

    //tim nguoi trong danh ba bang sdt
    public PhoneBook searchPhoneBook(String phoneNumber){
        for (PhoneBook phoneBook: phoneBookArrayList
             ) {
            if(phoneBook.getPhoneNumber().equals(phoneNumber)){
                return phoneBook;
            }
        }
        return null;
    }
   // them nguoi vao danh ba
    public void addPhoneBook(PhoneBook phoneBook){
        phoneBookArrayList.add(phoneBook);
    }

    //sua nguoi trong danh ba
    public void editPhoneBook(String phoneNumber,PhoneBook newPhoneBook){
        PhoneBook phoneBook = searchPhoneBook(phoneNumber);
        if (phoneBook != null){
            for (int i = 0; i < phoneBookArrayList.size(); i++) {
                if (phoneBookArrayList.get(i).equals(phoneBook)){
                    phoneBookArrayList.set(i,newPhoneBook);
                }
            }
        }
        else {
            System.out.println("khong tim thay sdt nao ca !");
        }
    }
    // xoa nguoi trong danh ba
    public void removePhoneBook(String phoneNumber){

        PhoneBook phoneBook = searchPhoneBook(phoneNumber);
        if (phoneBook != null){
            for (int i = 0; i < phoneBookArrayList.size(); i++) {
                if (phoneBookArrayList.get(i).equals(phoneBook)){
                    phoneBookArrayList.remove(i);
                }
            }
        }
        else {
            System.out.println("khong tim thay sdt nao ca !");
        }
    }
}
