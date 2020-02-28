
package proje2deneme2;

import java.util.ArrayList;
import java.util.List;


public abstract class Observer {
   protected Sirketler sirket;
   protected List<String> hisse;
   public abstract void guncelSonuc(ArrayList liste);
}
