import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp= new Scanner(System.in);

        int donguSayi, sayi;

        System.out.print("Kaç Sayı Gireceksin: ");
        donguSayi = imp.nextInt();

        int buyuk=0;
        int kucuk=0;
        for(int i = 1; i<=donguSayi; i++){
            System.out.print(i + ". Sayıyı Giriniz: ");
            sayi= imp.nextInt();
            if(i==1){
                kucuk = sayi;
                buyuk = sayi;
            }else {
                if(sayi< kucuk) kucuk = sayi;
                if(sayi > buyuk) buyuk  =sayi;
            }
        }
        System.out.println("Küçük Sayı: " + kucuk);
        System.out.println("Büyük Sayı: " + buyuk);

    }
}