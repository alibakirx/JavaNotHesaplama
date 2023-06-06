// Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana yazan java programı.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımlıyoruz.
        float mat,fizik,kimya,turkce,tarih,muzik;

        //İnputumuzu tanımlıyoruz.
        Scanner input = new Scanner(System.in);
        

        //Girilen inputları değişkenlerimize atıyoruz.
        mat = input.nextFloat();
        fizik = input.nextFloat();
        kimya = input.nextFloat();
        turkce = input.nextFloat();
        tarih = input.nextFloat();
        muzik = input.nextFloat();

        // Girilen notların ortalamasını bulmak için yeni bir değişken tanımlıyoruz.
        float notOrtalamasi;
        //Notların toplamını ders sayısına bulup ortalamayı buluyoruz.
        notOrtalamasi = ((mat + fizik + kimya + tarih + turkce + muzik) / 6);
        System.out.println("Girilen Notlarin Ortalamasi: " + notOrtalamasi);
        System.out.println(notOrtalamasi >= 60 ? " Geçtiniz" : "Kaldınız");



    }

}
