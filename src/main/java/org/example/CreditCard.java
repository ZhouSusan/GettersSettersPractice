package org.example;

public class CreditCard {
    private String name;
    private String creditCardNumber;
    private String expirationDate;
    private int cvv;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
}
