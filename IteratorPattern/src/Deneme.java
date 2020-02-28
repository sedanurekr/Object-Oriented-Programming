
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Deneme {
    public static void main(String[] args) {
        
        Shape [] dizi;
        dizi = new Shape[100];
        Scanner fileIn;
        String[] result;
        String result2;
        String[] result3;
        try{
            String line; 
            fileIn=new Scanner(new FileInputStream("shapes.txt"));
            int i=0;
            while(fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                result = line.trim().split(" "); //satirlari bosluklardan boluyor
                int x=result[1].length()-1; //son index bulmak icin
                result2=result[1].substring(1,x); //parantez icindeki kismi ayirmak icin
                result3=result2.split(","); //x ve y yi ayiriyor

                //kumelere ayirip nesne olusturarak diziye ekliyor
                if(result[0].equalsIgnoreCase("Rectangle")){
                    dizi[i] =new Rectangle(Double.parseDouble(result3[0]),Double.parseDouble(result3[1]),Double.parseDouble(result[2]),Double.parseDouble(result[3]));  
                }
                else if(result[0].equalsIgnoreCase("Circle")){
                    dizi[i]=new Circle(Double.parseDouble(result3[0]),Double.parseDouble(result3[1]),Double.parseDouble(result[2]));     
                }
                else if(result[0].equalsIgnoreCase("Square")){
                    dizi[i]=new Square(Double.parseDouble(result3[0]),Double.parseDouble(result3[1]),Double.parseDouble(result[2]));        
                } 
                i++;
            }
            MyIterator iterator = new MyIterator(dizi);  
            System.out.println("---------------INFORMATION SHAPES---------------");
            System.out.println();
            while(iterator.hasNext()) {
                Shape n = (Shape)iterator.next();
                System.out.println(n.toString());
                System.out.println("The area is : "+n.calculateArea());
                System.out.println("The perimeter is : "+n.calculatePerimeter());
                System.out.println();
            }   
        } 
        catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        
        

        
    }
    
    }
    

