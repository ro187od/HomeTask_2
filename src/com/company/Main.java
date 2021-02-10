package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Входные данные из файла: Id / Name / Surname / Time (10:10:10) / Visa / Amount
Функции приложения:
1. просмотр всех платежей
2. просмотр платежей определённого клиента
3. просмотр платежей за определённый период(от до)
4. совершить платёж
 */
public class Main {

    public static void main(String[] args) {
        String file = "src\\com\\company\\file\\payments.txt";
        try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
            while (buffReader.ready()) {
                System.out.println(buffReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
