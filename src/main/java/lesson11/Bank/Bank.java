package src.main.java.lesson11.Bank;

import java.util.Arrays;

public class Bank<T> { //T указывет что универсальный аврвметр то есть может быть любой тип
    T[] accounts;//создание массива типа T
    public Bank(){

    }

    public Bank(T[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
