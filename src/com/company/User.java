package com.company;

import java.util.Scanner;

public class User {

    private String name;
    private int parol;

    public String getName() {
        return name;
    }


    public void setName(Scanner scanner)  throws NameExeption {
        String name = scanner.nextLine();
        if ("Alisa" != name) {

            throw new NameExeption("Неверное имя,попытайтесь еще раз :  ");
        } else
        this.name = name;
    }

    public int getParol() {
        return parol;
    }


    public void setParol(Scanner scanner) throws ParolExeption {
        int parol =scanner.nextInt();
        if (parol != 556778) {

            throw new ParolExeption("Вы ввели неверный пароль, введите снова: ");
        }else
         this.parol = parol;
    }



}
