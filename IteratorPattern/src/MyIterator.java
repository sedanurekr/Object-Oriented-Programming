
public class MyIterator {
    int sayac=0;
    Object [] dizi;

    public MyIterator(Object[] dizi) {
        if(dizi != null) {
            this.dizi = dizi;
        } else {
            this.dizi = new Shape[100];
        }
    }
    
    public boolean hasNext() {
        return !(sayac >= dizi.length || 
                dizi[sayac] == null);}

    public Object next() {
        Object shape = null;
        //dizideki bir sonraki ogeyi dondurur ve sayac degerini artirir.
        if(this.sayac < dizi.length) {
            shape =  dizi[sayac]; 
            sayac += 1; 
        }
        return shape;}

    
    
}
