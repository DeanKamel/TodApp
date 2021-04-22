package com.example.todapp;

public class UserHelperClass {

    String name,email,username,password,phone,address,childName;
    int correct_alphabet = 0;
    int correct_animals = 0;
    int correct_numbers = 0;
    int wrong_alphabet = 0;
    int wrong_animals = 0;
    int wrong_numbers = 0;
    int timesPlayed_alphabet = 0;
    int timesPlayed_animals = 0;
    int timesPlayed_numbers = 0;


    public UserHelperClass() {
    }

    public UserHelperClass(String name, String email, String username, String password, int correct_alphabet, int correct_animals, int correct_numbers, int wrong_alphabet,
                           int wrong_animals, int wrong_numbers, int timesPlayed_alphabet, int timesPlayed_animals, int timesPlayed_numbers,String phone, String address, String childName) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.correct_alphabet = correct_alphabet;
        this.correct_animals = correct_animals;
        this.correct_numbers = correct_numbers;
        this.wrong_alphabet = wrong_alphabet;
        this.wrong_animals = wrong_animals;
        this.wrong_numbers = wrong_numbers;
        this.timesPlayed_alphabet = timesPlayed_alphabet;
        this.timesPlayed_animals = timesPlayed_animals;
        this.timesPlayed_numbers = timesPlayed_numbers;
        this.address = address;
        this.phone = phone;
        this.childName = childName;
    }
    public String getChildName() {return childName; }
    public void setchildName(String childName) {this.childName = childName;}

    public String getPhone() {return phone; }
    public void setPhone(String phone) {this.phone = phone;}

    public String getAddress() {return address; }
    public void setAddress(String address) {this.address = address;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCorrectAlphabet() {
        return correct_alphabet;
    }

    public void setCorrectAlphabet(int correct_alphabet) {
        this.correct_alphabet = correct_alphabet;
    }

    public int getCorrectAnimals() {
        return correct_animals;
    }

    public void setCorrectAnimals(int correct_animals) {
        this.correct_animals = correct_animals;
    }

    public int getCorrectNumbers() {
        return correct_numbers;
    }

    public void setCorrectNumbers(int correct_numbers) {
        this.correct_numbers = correct_numbers;
    }

    public int getWrongAlphabet() {
        return wrong_alphabet;
    }

    public void setWrongAlphabet(int wrong_alphabet) {
        this.wrong_alphabet = wrong_alphabet;
    }


    public int getWrongAnimals() {
        return wrong_animals;
    }

    public void setWrongAnimals(int wrong_animals) {
        this.wrong_animals = wrong_animals;
    }


    public int getWrongNumbers() {
        return wrong_numbers;
    }

    public void setWrongNumbers(int wrong_numbers) {
        this.wrong_numbers = wrong_numbers;
    }

    public int getTimesPlayedAlphabet() {
        return timesPlayed_alphabet;
    }

    public void setTimesPlayedAlphabet(int timesPlayed_alphabet) {
        this.timesPlayed_alphabet = timesPlayed_alphabet;
    }

    public int getTimesPlayedAnimals() {
        return timesPlayed_animals;
    }

    public void setTimesPlayedAnimals(int timesPlayed_animals) {
        this.timesPlayed_animals = timesPlayed_animals;
    }

    public int getTimesPlayedNumbers() {
        return timesPlayed_numbers;
    }

    public void setTimesPlayedNumbers(int timesPlayed_numbers) {
        this.timesPlayed_numbers = timesPlayed_numbers;
    }

}
