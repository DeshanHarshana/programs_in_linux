class userDifineException {
    public static void main(String[] args) {
        int num=0;
        try{
            if(num==0){
                throw new myException("Error");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class myException extends Exception{

    

    public myException(String message) {
        super(message);
    }
    
}