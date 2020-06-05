import java.util.Arrays;
import java.util.List;

public class wildCard_Generics {
    public static void main(String[] args) 
    { 
          
        //Upper Bounded Integer List 
        List<Integer> list1= Arrays.asList(4,5,6,7); 
          
        //printing the sum of elements in list 
        System.out.println("Total sum is:"+sum(list1)); 
  
        //Double list 
        List<Double> list2=Arrays.asList(4.1,5.1,6.1); 
          
        //printing the sum of elements in list 
        System.out.print("Total sum is:"+sum(list2)); 
    } 
  
    private static double sum(List<? extends Number> list)  
    { 
        double sum=0.0; 
        for (Number i: list) 
        { 
            sum+=i.doubleValue(); // we know i is number
        } 
  
        return sum; 
    } 
}

/*abstract
 if we only use generics we cant do calculation for our value. look following


  private static<E> double sum(List<E> list)  
    { 
        double sum=0.0; 
        for (E i: list) 
        { 
            sum=sum+i; // this shows error because i is not a number it may be a number but not sure
                        // threrefore like this senario we have to use wild cards
        } 
  
        return sum; 
    } 



*/