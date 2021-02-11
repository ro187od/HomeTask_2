package com.company.Menu;

import com.company.Serviece.MainService;

import java.util.Scanner;

public class HandsomeMenu {
    MainService service;
    Scanner in;

    public HandsomeMenu(){
        service = new MainService();
        printMenu();
    }

    private void printMenu() {
        System.out.println("1. просмотр всех платежей");
        System.out.println("2. просмотр платежей определённого клиента");
        System.out.println("3. просмотр платежей за определённый период(от до)");
        System.out.println("4. совершить платёж");
        userChoice();
    }

    private void userChoice() {
        Scanner in = new Scanner(System.in);
        int selectedAction = in.nextInt();
        if(selectedAction == 1){
            service.getAll();
        }
        if(selectedAction == 2){

        }
        if(selectedAction == 3){

        }
        if(selectedAction == 4){

        }
    }
}
