class E{
    public static void main(String[] args) {
        
    }
}

class EmailException extends Exception{

   String email="";

   public EmailException(String message, String email) {
       super(message);
       this.email = email;
   }
   

}