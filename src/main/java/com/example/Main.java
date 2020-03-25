package com.example;

import com.example.operacje.Smartfon;
import com.example.operacje.Telefon;
import com.example.operacje.Wiadomosc;
import com.example.sekretarka.Sekretarka;

public class Main {
    public static void main(String[] args) {
        //wiadomosci dla klijenta
        Wiadomosc wiadomoscSms = new Telefon();
        Wiadomosc wiadomoscMMS = new Smartfon();
        Wiadomosc wiadomoscEmail = new Telefon();

        Sekretarka sekretarka = new Sekretarka();
        /***********Uwaga troche objasnien*********/
        /*
        Mozesz zapytać co nam dało zastosowanie interfejsu??
        Teoretycznie ten przykład moznaby bylo rozwiazac przy pomocy dziedziczenia,
        ale podane klasy nie maja ze soba za wiele wspolnego poza tym ze umożliwiaja wysłanie wiadomości.

        Interfejsy umożliwiaja pisanie kodu łatwego do rozbudowy, jesli sekretarka bedzie musiala wysłać np fax
        to wystarczy napisac odpowiednia klase. A klasa sekretarki nie bedzie musialabyć modyfikowana w żaden sposob.
        * */
        sekretarka.wiadomoscDoKlijenta(wiadomoscSms);
        sekretarka.wiadomoscDoKlijenta(wiadomoscMMS);
        sekretarka.wiadomoscDoKlijenta(wiadomoscEmail);
       }
}
