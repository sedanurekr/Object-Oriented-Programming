import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyIteratorTest {
    
    public MyIteratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
   @Test
    public void testNext() {
        Shape [] dizi=new Shape[100];
        dizi[0]=new Rectangle(5,1,10,15);
        dizi[1]=new Circle(6,7,5);
        dizi[2]=new Square(2,1,10);
        MyIterator iterator = new MyIterator(dizi);
        
        assertSame(dizi[0],iterator.next());
        assertSame(dizi[1],iterator.next());
        assertSame(dizi[2],iterator.next());
    }
   
   @Test
   public void testHasNextEmpty() {
        Shape [] dizi=new Shape[100];
        MyIterator iterator = new MyIterator(dizi);
        
        assertEquals(false,iterator.hasNext());
    }
   
   @Test
    public void testHasNextNull() {
        MyIterator iterator = new MyIterator(null);
        
        assertEquals(false,iterator.hasNext());
    }
    
    @Test
    public void testHasNext() {
        Shape [] dizi=new Shape[100];
        dizi[0]=new Rectangle(5,1,10,15);
        dizi[1]=new Circle(6,7,5);
        dizi[2]=new Square(2,1,10);
        MyIterator iterator = new MyIterator(dizi);
        
        assertEquals(true,iterator.hasNext());
    }

   
    @Test
    public void testNextNull() {
        MyIterator iterator = new MyIterator(null);
        
        assertSame(null,iterator.next());
    }
    
}
