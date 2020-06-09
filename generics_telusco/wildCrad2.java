import java.util.ArrayList;

public class wildCrad2 {
    // this cls is error 
    public static void main(String[] args) {
        Demo2<Integer> lst= new Demo2<Integer>(5);
        ArrayList<Number> list=new ArrayList<Number>();
        list.add(5.5);
        lst.show(list);
    }
}
class Demo2<T extends Number>{
    T value;
    public Demo2(T value){
        this.value=value;
    }



    void show(ArrayList<? super Integer> list){
        //we can add any supertype of Integer
        // we can't use Number n because ? may be object because object is top super class pf Inter
        // therefore type should be object
        for(Object n: list){
            System.out.println((value));
            System.out.println(n);

            // we can't use value + n because we don't know wht type is
        }
    }
}