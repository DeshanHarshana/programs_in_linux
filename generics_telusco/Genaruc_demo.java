class Example{
    public static void main(String[] args) {
        Containe<Double> ct=new Containe<Double>(23.44);
        ct.show();
    }
}
class Containe<T>{
    T value;

    public Containe(T value){
        this.value=value;
    }

    void show(){
        System.out.println(value.getClass().getName());
    }
}