// Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana yazan java programı.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımlıyoruz.
        float mat,fizik,kimya,turkce,tarih,muzik;

        //İnputlarımızı tanımlıyoruz.
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);

        //Girilen inputları değişkenlerimize atıyoruz.
        mat = input1.nextFloat();
        fizik = input2.nextFloat();
        kimya = input3.nextFloat();
        turkce = input4.nextFloat();
        tarih = input5.nextFloat();
        muzik = input6.nextFloat();

        // Girilen notların ortalamasını bulmak için yeni bir değişken tanımlıyoruz.
        float notOrtalamasi;
        //Notların toplamını ders sayısına bulup ortalamayı buluyoruz.
        notOrtalamasi = ((mat + fizik + kimya + tarih + turkce + muzik) / 6);
        System.out.println("Girilen Notlarin Ortalamasi: " + notOrtalamasi);
        System.out.println(notOrtalamasi >= 60 ? " Geçtiniz" : "Kaldınız");



    }

}