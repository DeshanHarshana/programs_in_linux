public class tryCatch {
    public static void main(String[] args) {
        try{
            int i=1/0;
        }catch(ArithmeticException e){
            
            System.out.println("Error is : "+e);
        }finally{
            System.out.println("Final");
        }
        
    }
    
}