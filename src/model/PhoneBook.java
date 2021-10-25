package model;

import java.io.Serializable;
import java.time.LocalDate;

public class PhoneBook implements Serializable {
    private String phoneNumber;
    private String groupOfContacts;
    private String userName;
    private String address;
    private String email;
    private String gender;
    private String birthOfDay;

    public PhoneBook() {
    }

    public PhoneBook(String groupOfContacts, String userName, String address, String email, String gender, String birthOfDay) {
        this.groupOfContacts = groupOfContacts;
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.birthOfDay = birthOfDay;
    }

    public PhoneBook(String phoneNumber, String groupOfContacts, String userName, String address, String email, String gender, String birthOfDay) {
        this.phoneNumber = phoneNumber;
        this.groupOfContacts = groupOfContacts;
        this.userName = userName;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.birthOfDay = birthOfDay;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupOfContacts() {
        return groupOfContacts;
    }

    public void setGroupOfContacts(String groupOfContacts) {
        this.groupOfContacts = groupOfContacts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(String birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "Số điện thoại ='" + phoneNumber + '\'' +
                ", Nhóm danh bạ ='" + groupOfContacts + '\'' +
                ", Tên ='" + userName + '\'' +
                ", Địa chỉ ='" + address + '\'' +
                ", Email ='" + email + '\'' +
                ", Giới tính ='" + gender + '\'' +
                ", ngay thang sinh ='" + birthOfDay + '\'' +
                '}';
    }
}
