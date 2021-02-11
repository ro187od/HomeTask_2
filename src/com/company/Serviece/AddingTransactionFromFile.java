package com.company.Serviece;

import com.company.Transaction;
import com.company.repo.PaymentsRepo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddingTransactionFromFile {

    PaymentsRepo paymentsRepo;

    public AddingTransactionFromFile() {
        paymentsRepo = new PaymentsRepo();
        addAllEntries();
    }

    private void addAllEntries() {
        String file = "src\\com\\company\\file\\payments.txt";
        try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
            int i = 0;
            while (buffReader.ready()) {
                String str = buffReader.readLine();
                String strArray[] = str.split(" ");
                System.out.println(strArray[i]);
                addFromFile(strArray);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addFromFile(String[] strArray) {
        Transaction transaction = new Transaction(
                strArray[0], strArray[1], strArray[2],  strArray[3], strArray[4]);
        paymentsRepo.add(transaction);
        System.out.println(
                transaction.getId() + " " + transaction.getName() + " " + transaction.getSurname() + " " +
                        transaction.getTypeCard() + " " + transaction.getAmount() + " ");
    }
}
