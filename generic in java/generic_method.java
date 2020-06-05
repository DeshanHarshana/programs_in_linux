/*
The type parameters naming conventions are important to learn generics thoroughly. 
The common type parameters are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value
*/

/*
when we use generics we can pass any type of value to method but it should be one type
we not need to cast


*/

public class generic_method {
    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        System.out.println( "Printing Integer Array" );  
        display( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        display( charArray ); 
        
        System.out.println(get("Progre"));
        System.out.println(get(5.3));
    }

    static<E> void display(E[] elements){
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }

    static<V> V get(V value) {
        return value;
    }
}