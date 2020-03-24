package com.example;

import com.example.operacje.Oblicz;

public class WykonajZadanie {
    public double wykonajOperacje(double a, double b, Oblicz oblicz){
        return oblicz.wylicz(a,b);
    }
}
