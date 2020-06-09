import java.util.ArrayList;

public class wildcard {
    public static void main(String[] args) {
        Demo<String> lst= new Demo<String>("Hey");
        ArrayList<String> list=new ArrayList<>();
        list.add("ooo");
        lst.show(list);
    }
}
class Demo<T>{
    T value;
    public Demo(T value){
        this.value=value;
    }



    void show(ArrayList<? extends T> list){
        //we can add any subtype of T
        for(T n: list){
            System.out.println((value));
            System.out.println(n);

            // we can't use value + n because we don't know wht type is
        }
    }
}