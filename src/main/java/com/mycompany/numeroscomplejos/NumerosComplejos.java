package com.mycompany.numeroscomplejos;

public class NumerosComplejos {

    public static void main(String[] args) {
        NumeroComplejo num1 = NumeroComplejo.parse("5+2i");
        NumeroComplejo num2 = NumeroComplejo.parse("7+3i");

        System.out.println("Número 1: " + num1);
        System.out.println("Es complejo: " + (num1.getImaginaria() != 0));

        System.out.println("Número 2: " + num2);
        System.out.println("Es complejo: " + (num2.getImaginaria() != 0));

        NumeroComplejo resultado = num1.suma(num2);
        System.out.println("Suma en cadena: " + resultado);
        System.out.println("Parte Real de la Suma: " + resultado.getReal());
        System.out.println("Parte Imaginaria de la Suma: " + resultado.getImaginaria());
    }
}
