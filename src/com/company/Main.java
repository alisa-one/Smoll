package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Введите Ваше имя:  ");
            try {
                user1.setName(sc);

            } catch (NameExeption n) {
                System.out.println(n.getMessage());
            }



            System.out.println("Введите пароль: ");
            try {
                user1.setParol(sc);
            } catch (ParolExeption p) {
                System.out.println(p.getMessage());
            }
        }
    }
}

