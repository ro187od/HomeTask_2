package com.company;

public class Transaction {
    private String id;
    private String name;
    private String surname;
    private String amount;
    private String typeCard;

    public Transaction(String id, String name, String surname, String amount, String typeCard) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.amount = amount;
        this.typeCard = typeCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }
}
