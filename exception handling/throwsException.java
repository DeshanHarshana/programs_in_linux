import java.io.IOException;
import java.util.Arrays;

public class throwsException {
    public static void main(String[] args) {
        try {
            display(11);
        } catch (Exception e) {
            System.out.println(e.getSuppressed().length);
        }
        
        
    }
    static void display(int i) throws Exception, IOException, ArithmeticException {
        if(i>10){
            throw new IOException("Input is greter than 10");
        }
    }
}

/*
Here are the few other Checked Exceptions –

SQLException
IOException
ClassNotFoundException
InvocationTargetException



Here are the few unchecked exception classes:

NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException
IllegalArgumentException
NumberFormatException


throws:

throws is a keyword in Java which is used in the signature of method to
indicate that this method might throw one of the listed type exceptions. 
The caller to these methods has to handle the exception using a try-catch block.
*/