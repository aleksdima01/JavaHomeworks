package ExceptionHomework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surName;
    private String lastName;

    private String birthday;
    private int phoneNumber;
    private char gender;
    ListUsers usersInUser = new ListUsers();

    public User(String name, String surName, String lastName, String date, int phoneNumber, char gender) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.birthday = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public User() {

    }

    public User CreateUser() {
        ArrayList inputLine;
        Parsing parsing = new Parsing();
        SimpleDateFormat birthday = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        inputLine = parsing.parsing();
        this.surName = inputLine.get(0).toString();

        this.name = inputLine.get(1).toString();
        this.lastName = inputLine.get(2).toString();
        String birthdayDAte = inputLine.get(3).toString();
        try {
            date = birthday.parse(birthdayDAte);
        } catch (ParseException e) {
            System.out.println("Неправильно введен формат даты рождения!");
            e.printStackTrace();
        }
        this.birthday = birthday.format(date);
        try {
            this.phoneNumber = Integer.parseInt((String) inputLine.get(4));
        } catch (NumberFormatException ex) {
            System.out.println("Неправильный формат номера телефона! Номер должен быть числовым!");
            ex.printStackTrace();
        }
        if (inputLine.get(5).toString().length() != 1) {
            throw new IllegalArgumentException("Неправильно введен пол! Пол может быть m или f!");
        }
        if (inputLine.get(5).toString().charAt(0) != 'm' && inputLine.get(5).toString().charAt(0) != 'f') {
            throw new IllegalArgumentException("Неправильно введен пол! Пол может быть m или f!");
        }
        this.gender = inputLine.get(5).toString().charAt(0);

        return new User(this.name, this.surName, this.lastName, this.birthday, this.phoneNumber, this.gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + birthday +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}' + "\n";
    }
}
