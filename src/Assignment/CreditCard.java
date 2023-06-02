package Assignment;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello enter card detail to verify");
        String creditCardNumber = scanner.nextLine();
        System.out.println("Credit Card Type " + creditCard.validateCardType(creditCardNumber));
        System.out.println("credit card number " + creditCardNumber);
        System.out.println("credit card digit length " + creditCard.validateLenght(creditCardNumber));
        System.out.println("card validity status"+ creditCard.validate(creditCardNumber));
    }



    public String validate(String creditCardNumber) {
        if (numberAtOddPositionAndSingleDigit(creditCardNumber) % 10 == 0) {
            return "valid";
        }else {
            return "invalid";
        }
    }
    public String validateLenght(String creditCardNumber) {
        if (creditCardNumber.length() <= 16 && creditCardNumber.length() >= 13){
            return  "the length is " + creditCardNumber.length();
        } else {
            return "the length is invalid";
        }
    }
    public creditCardType validateCardType(String creditCardNumber){
        creditCardType creditCardType = null;
        if (creditCardNumber.startsWith("4")){
            creditCardType = creditCardType.VISA_CARD;
        } else if (creditCardNumber.startsWith("5")) {
            creditCardType = creditCardType.MASTERCARD;
        } else if (creditCardNumber.startsWith("37")) {
            creditCardType =creditCardType.AMERICAN_EXPRESS_CARD;
        } else if (creditCardNumber.startsWith("6")) {
            creditCardType = creditCardType.DISCOVER.CARDS;
        }
        else {
            throw new IllegalArgumentException();
        }
        return creditCardType;
    }
    public int doublingEverySecondDigit(String creditCardNumber){
        String digit = "";
        int numberDigit;
        int doubleNumber;
        int sum = 0;
        String doubleString;
        String valString;
        int innerInt = 0;
        for (int count = creditCardNumber.length()-2; count >=0; count-=2){
            digit = String.valueOf(creditCardNumber.charAt(count));
            numberDigit = Integer.parseInt(digit);
            doubleNumber = numberDigit + numberDigit;

            if (doubleNumber > 9){
                doubleString = String.valueOf(doubleNumber);
                for (int index = doubleString.length()-1; index >= 0; index--){
                    doubleNumber = innerInt;doubleString = String.valueOf(doubleNumber);
                    valString = String.valueOf(doubleString.charAt(index));
                    innerInt = Integer.parseInt(valString);
                    doubleNumber += innerInt;
                }
            }
            sum += doubleNumber;
        }
        return  sum;
    }
    public int addDigitInOddPosition(String creditCardNumber){
        String digit;
        int numberDigit;
        int number = 0;
        for (int count = creditCardNumber.length()-1;count >= 0; count-=2){
            digit = String.valueOf(creditCardNumber.charAt(count));
            numberDigit = Integer.parseInt(digit);
            number += numberDigit;
        }
        return number;
    }
    public int numberAtOddPositionAndSingleDigit(String creditCardNumber){
        return addDigitInOddPosition(creditCardNumber) + doublingEverySecondDigit(creditCardNumber);
    }
}
