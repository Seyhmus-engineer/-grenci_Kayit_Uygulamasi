
package ögrenci_kayit_uygulamasi;

import java.util.Scanner;


public class OgrListe {
    Scanner k= new Scanner(System.in);
    
    OgrNode bas=null;
    OgrNode son=null;
    OgrNode temp=null;
    OgrNode temp2=null;
    
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ort;
    String durum;
    
    void ekle() {
        System.out.println("Yeni öğrencini bilgilerini giriniz : ");
        
        System.out.print("Numara : "); numara=k.nextInt();
        k.nextLine();
        System.out.print("ad     : "); ad=k.nextLine();
        System.out.print("Soyad  : "); soyad=k.nextLine();
        System.out.print("Vize   : "); vize=k.nextInt();
        System.out.print("Final  : "); fin=k.nextInt();
        
        
        OgrNode eleman=new OgrNode(numara,ad,soyad,vize,fin);
        
        if (bas==null) {
            bas=eleman;
            son=eleman;
            System.out.println("Kayıt olacak ögrencilerin listesi olustu, ilk ögrenci kaydi yapildi");
            
        }
        else{
            eleman.next=bas;
            bas=eleman;
            System.out.println(numara+"numaralı ögrenci bölüme kayıt edildi");
        }
    }
    
    void sil(){
        
        if (bas==null) {
            System.out.println("Liste bos, silinecek ögrenci yok!!! ");
            
        }
        else{
            System.out.print("Silmek istediğiniz ögrencinin numarasını giriniz: ");
            numara=k.nextInt();
            
            if (numara==bas.numara && bas.next==null) {
                bas=null;
                son=null;
                System.out.println(numara+"numaralı ögrenci silindi, listede kayıtlı ögrenci kalmadı ");
            }
            else if (numara==bas.numara  && bas.next!=null) {
                bas=bas.next;
                System.out.println(numara+"numaralı ögrenci silindi");
            }
            else{
                temp=bas;
                temp2=bas;
                while( temp.next!=null){
                    if (numara==temp.numara) {
                        temp2.next=temp.next;
                        System.out.println(numara+" numaralı ögrenci silindi ");
                    }
                    temp2=temp;
                    temp=temp.next;
                }
                if (numara==temp.numara) {
                        temp2.next=null;
                        son=temp2;
                        System.out.println(numara+" numaralı ögrenci silindi ");
                    }
            }
 
        }
    }
    
    void yazdir() {
        
        if (bas==null) {
            System.out.println("Liste boş..");   
        }
        else{
           temp=bas;
           while(temp!=null){
               System.out.println(temp.numara+" numaralı ögrenci bilgileri ");
               System.out.println("**********************************");
               System.out.println("ad        : "+temp.ad);
               System.out.println("soyad     : "+temp.soyad);
               System.out.println("vize      : "+temp.vize);
               System.out.println("final     : "+temp.fin);
               System.out.println("ortalama  : "+temp.ort);
               System.out.println("durum     : "+temp.durum);
               System.out.println("**********************************");
               
               temp=temp.next;
               
           }
        }
    }
    
    void enBasariliOgrenci() {
        
        if (bas==null) {
            System.out.println("Liste boş..");   
        }
        else{
           temp=bas;
           double buyuk=temp.ort;
           
           while(temp!=null){
               
               if (buyuk<temp.ort) {
                   
                   buyuk=temp.ort;
                   
                   numara= temp.numara;
                   ad=temp.ad;
                   soyad=temp.soyad;
                   vize=temp.vize;
                   fin=temp.fin;
                   ort=temp.ort;
                   durum=temp.durum;
               }
               
               temp=temp.next;
               
           }
           System.out.println(" En basarılı ögrenci bilgileri ");
               System.out.println("**********************************");
               System.out.println("ad        : "+ad);
               System.out.println("soyad     : "+soyad);
               System.out.println("vize      : "+vize);
               System.out.println("final     : "+fin);
               System.out.println("ortalama  : "+ort);
               System.out.println("durum     : "+durum);
               System.out.println("**********************************");
        }
    }
}
