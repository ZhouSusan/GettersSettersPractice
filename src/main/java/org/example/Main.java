package org.example;

public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.setName("Donkey Kong");
        cc.setCreditCardNumber("1435671748598592");
        cc.setExpirationDate("10/28");
        cc.setCvv(555);

        System.out.println("Your card details:\nCardholder Name: " + cc.getName());
        System.out.println("Card Number: " + cc.getCreditCardNumber());
        System.out.println("Expiration Date: " + cc.getExpirationDate());
        System.out.println("CVV: " + cc.getCvv());
    }
}