public class lamda2 {
    public static void main(String[] args) {
    //    A a=new A(){
       
    //        @Override
    //        public void show() {
    //            System.out.println("Hello");
    //        }
    //    };

       //lambda

       A a=() -> {
            System.out.println("Hello");
        };



       a.show();
    }

    

}

interface A{
    void show();
}