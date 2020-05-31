public class generic_class {
    public static void main(String[] args) {
        MyGen<Integer> myGen=new MyGen(34);
        System.out.println(myGen.getValue());
    }
}
class MyGen<T>{
    T obj;
    public MyGen(T x){
        obj=x;
    }
    public T getValue(){
        return this.obj;
    }
}