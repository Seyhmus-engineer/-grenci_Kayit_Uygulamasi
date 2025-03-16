
package ögrenci_kayit_uygulamasi;


public class OgrNode {
    
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ort;
    String durum;
    
    OgrNode next;

    public OgrNode(int numara, String ad, String soyad, int vize, int fin) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;
        
        ort=vize*0.4+fin*0.6;
        
        if (ort >= 50) {
            durum="Geçti";
        }
        else{
            durum="Kaldı";
        }
        next=null; 
 
    }

    
    
    
}
