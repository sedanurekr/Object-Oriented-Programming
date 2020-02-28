
package proje1;


public class DataEntryOperator {
    private int ID;
    private String adSoyad;
    private String departman;
    
    public DataEntryOperator(){
        ID=0;
        adSoyad=null;
        departman=null;
    }
    
    public DataEntryOperator(int ID, String adSoyad, String departman){
        this.ID=ID;
        this.adSoyad=adSoyad;
        this.departman=departman;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    @Override
    public String toString(){
        return "ID : "+getID()+" \nAd Soyad : "+getAdSoyad()+" \nDepartman : "+getDepartman();
    }

    DataEntryOperator getContent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
