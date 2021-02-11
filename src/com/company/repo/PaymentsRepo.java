package com.company.repo;

import com.company.Transaction;

import java.util.ArrayList;

public class PaymentsRepo {

    private ArrayList<Transaction> transactions;

    public PaymentsRepo(){
        this.transactions = new ArrayList<>();
    }

    public void add(Transaction transaction){
        this.transactions.add(transaction);
    }

    public ArrayList<Transaction> getAll(){
        return transactions;
    }

    public void remove(Transaction transaction){
        this.transactions.add(transaction);
    }
}
