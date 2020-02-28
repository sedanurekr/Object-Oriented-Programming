
package project;

import java.util.ArrayList;
import java.util.List;


public class DVD {
    private String adSoyad, baslik;
    private int tarih, fiyat;
    private List<String> liste;

    public DVD() {
        this.adSoyad = "";
        this.baslik = "";
        this.tarih = 0;
        this.fiyat = 0;
        this.liste = new ArrayList<String>();
    }

    public DVD(String adSoyad,String baslik, int tarih, int fiyat) {
        this.adSoyad = adSoyad;
        this.baslik = baslik;
        this.tarih = tarih;
        this.fiyat = fiyat;
        this.liste = new ArrayList<String>();
    }

    public DVD(String adSoyad, String baslik, int tarih, int fiyat, List<String> liste) {
        this.adSoyad = adSoyad;
        this.baslik = baslik;
        this.tarih = tarih;
        this.fiyat = fiyat;
        this.liste = liste;
    }

    
    
    
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getTarih() {
        return tarih;
    }

    public void setTarih(int tarih) {
        this.tarih = tarih;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public List<String> getListe() {
        return liste;
    }

    public void setListe(List<String> liste) {
        this.liste = liste;
    }
    
    public void addListe(String music) {
        liste.add(music);
    }

    @Override
    public String toString() {
        return adSoyad + ", "+ baslik + ", "+ tarih + ", "+ fiyat + ", "+ liste+"\n";
    }
    
    
}
