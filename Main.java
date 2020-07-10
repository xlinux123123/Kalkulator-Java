package com.belajarjava;

import java.util.*;

public class Main{

    public static void main(String[] args) {
	// write your code here

        // KALKULTOR
        //HEAD

        Scanner userInput = new Scanner(System.in);

        float input1,input2,hasil;
        char operator;
        System.out.println("[!] Information [!]");
        System.out.println("OPERATOR : [ + , - , * , / ]");
        System.out.println(" ");
        System.out.print("Masukan nilai x = ");
        input1 = userInput.nextFloat();
        System.out.print("Masukan nilai operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("Masukan nilai y = ");
        input2 = userInput.nextFloat();

        System.out.println(" ");

        System.out.println("Input user : "+ input1 + " " + operator + " "+ input2);

        // OPERATOR TERSEDIA x(*) , + , - , /
        // BODY

        if (operator == '+'){
            // penjumlahan
            hasil = input1 + input2;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '-'){
            // Pergurangan
            hasil = input1 - input2;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '*'){
            // Perkalian
            hasil = input1 * input2;
            System.out.println("hasilnya = " + hasil);
        }else if (operator == '/'){
            // Pembagian
            hasil = input1 / input2;
            System.out.println("hasilnya = " + hasil);
        }else {
            System.out.println("Operator Eror 404");
        }

    }
}
