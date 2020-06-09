package multithred;

public class multithred {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
        
            @Override
            public void run() {
               for(int i=0; i<10; i++){
                System.out.println("One");
                try{Thread.sleep(1000);} catch(Exception e){}
               }
                
            }
        });

        Thread t2=new Thread(new Runnable(){
        
            @Override
            public void run() {
              decrement(20);
                
            }
        });

        t1.start();
        t2.start();
    }

    static void decrement(int x){
        for(int i=x; i>0; i--){
            System.out.println(i);
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}