package com.mycompany.numeroscomplejos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroComplejo {
    private double real;
    private double imaginaria;

    public NumeroComplejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public static NumeroComplejo parse(String complejoStr) {
        // Usar una expresión regular para extraer las partes real e imaginaria
        String regex = "([-+]?\\d*\\.?\\d+)([-+]\\d*\\.?\\d*)i";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(complejoStr);

        if (matcher.matches()) {
            double real = Double.parseDouble(matcher.group(1));
            double imaginaria = Double.parseDouble(matcher.group(2));
            return new NumeroComplejo(real, imaginaria);
        } else {
            throw new IllegalArgumentException("Formato incorrecto para número complejo: " + complejoStr);
        }
    }

    public NumeroComplejo suma(NumeroComplejo otro) {
        double sumaReal = this.real + otro.real;
        double sumaImaginaria = this.imaginaria + otro.imaginaria;
        return new NumeroComplejo(sumaReal, sumaImaginaria);
    }

    public String toString() {
        return real + (imaginaria >= 0 ? "+" : "") + imaginaria + "i";
    }

    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }
}
