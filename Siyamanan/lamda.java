import java.util.Arrays;
import java.util.List;

public class lamda {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(3,4,6,7);
        lst.forEach(System.out::println);  
    }
}