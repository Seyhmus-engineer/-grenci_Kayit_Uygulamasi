
package ögrenci_kayit_uygulamasi;

import java.util.Scanner;


public class Ögrenci_Kayit_Uygulamasi {

    
    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        
        
        int secim=-1;
        OgrListe bilBolum=new OgrListe();
        
        while(secim!=0 ){
            
            System.out.println();
            System.out.println("Ogrenci kayit uygulamasi ");
            System.out.println("1- yeni kayit");
            System.out.println("2- kayit sil");
            System.out.println("3- kayitlari listele");
            System.out.println("4- en basarili Ogrenci");
            System.out.println("0- cikis");
            System.out.print(" Seciminiz: ");
            
            secim=k.nextInt();
            
            if (secim==1) {
                bilBolum.ekle();
            }
            else if (secim==2) {
                bilBolum.sil();
            }
            else if (secim==3) {
                bilBolum.yazdir();
            }
            else if (secim==4) {
                bilBolum.enBasariliOgrenci();
            }
            else if (secim==0) {
                System.out.println("Program sonlandırılıyor..");
            }
            else{
                System.out.println("Hatalı secim yaptınız...");
            }
        }
        
    }
    
}
