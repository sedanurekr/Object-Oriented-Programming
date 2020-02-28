
package proje2deneme2;

import java.util.ArrayList;
import java.util.List;


public class Sirketler {
    
   private List<Gozlemci> observers = new ArrayList<Gozlemci>();
   
   private List<ArrayList> hisseSenedi =new ArrayList();
   
   public Sirketler(List<ArrayList> hisseSenedi){
       this.hisseSenedi=hisseSenedi;      
   }

   public void update(ArrayList liste, int deger){
       int i = this.hisseSenedi.indexOf(liste);
       this.hisseSenedi.get(i).set(1, (int)(this.hisseSenedi.get(i).get(1)) + deger);
       notifyAllObservers(liste);
   }

    public List<Gozlemci> getObservers() {
        return observers;
    }

    public void setObservers(List<Gozlemci> observers) {
        this.observers = observers;
    }

    public List<ArrayList> getHisseSenedi() {
        return hisseSenedi;
    }

    public void setHisseSenedi(List<ArrayList> hisseSenedi) {
        this.hisseSenedi = hisseSenedi;
    }

   public void attach(Gozlemci observer){ 
      observers.add(observer);		
   }

   
   public void notifyAllObservers(ArrayList liste){
      for (Gozlemci observer : this.observers) {
          if(observer.hisse.contains(liste.get(0).toString()))
            observer.guncelSonuc(liste);
      }
      
   }

    
    
    
    
    
}
