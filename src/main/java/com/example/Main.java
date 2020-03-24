package com.example;

import com.example.operacje.Dodawanie;
import com.example.operacje.Mnozenie;
import com.example.operacje.Oblicz;
import com.example.operacje.Odejmowanie;

public class Main {
    public static void main(String[] args) {
        Oblicz dodawanie = new Dodawanie();
        Oblicz odejmowanie = new Odejmowanie();
        Oblicz mnozenie = new Mnozenie();

        WykonajZadanie zadanie = new WykonajZadanie();
        System.out.println(zadanie.wykonajOperacje(12,12, dodawanie));
        System.out.println(zadanie.wykonajOperacje(12,12, odejmowanie));
        System.out.println(zadanie.wykonajOperacje(12,12, mnozenie));


       }
}
