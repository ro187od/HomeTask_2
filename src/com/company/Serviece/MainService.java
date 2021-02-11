package com.company.Serviece;

import com.company.Transaction;
import com.company.repo.PaymentsRepo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainService {
    AddingTransactionFromFile transactionFromFile;
    PaymentsRepo paymentsRepo;

    public MainService(){
        transactionFromFile = new AddingTransactionFromFile();
        paymentsRepo = new PaymentsRepo();
    }

    private void recordTransactionFromFile(String[] strArray){
        Transaction transaction = new Transaction(
                strArray[0], strArray[1], strArray[2],  strArray[3], strArray[4]);
        paymentsRepo.add(transaction);
    }

    public void getAll(){
        printAllTransaction(transactionFromFile.paymentsRepo.getAll());
    }

    private void printAllTransaction(ArrayList<Transaction> all) {
        for(Transaction transaction : all){
            System.out.println(
                    transaction.getId() + " " + transaction.getName() + " " + transaction.getSurname() + " " +
                            transaction.getTypeCard() + " " + transaction.getAmount() + " "
            );
        }
    }
}
