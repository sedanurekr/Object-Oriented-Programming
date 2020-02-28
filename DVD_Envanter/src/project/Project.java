package project;
public class Project {

    public static void main(String[] args) {
        NodeList nodeList;
        nodeList = Method.CreateList();
        form formObject = new form(nodeList);
        formObject.show();
        
    }
    
}
