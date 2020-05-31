public class throwException {
    
    static void validate(int age){  
    if(age<18){
        throw new ArithmeticException("not valid");  // we throw arithmatic excption 
    }  
     
    else{
        System.out.println("welcome to vote");
    } 
         

  }

  public static void main(String args[]){  
     validate(56);  
     System.out.println("rest of the code...");  
 }  
}