import java.util.ArrayList;
import java.util.List;

public class basic_genarics {
    public static void main(String[] args) {
        List list = new ArrayList();    
        list.add(10);  
        list.add("10");  

        List<Integer> list2 = new ArrayList<Integer>();    
        list2.add(10);  
        //list2.add("10");// compile-time error  
    }
    
}