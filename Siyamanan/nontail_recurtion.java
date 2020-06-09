class Recuring{
    public static void main(String[] args) {
    
        System.out.println(normalR(20));
        System.out.println(tailRR(3));


    }

    static int tailRR(int n){
        return tailR(n, n);
    }

    static int tailR(int n, int k){
        if(n==0){
            return k;
        }
        else{
            return tailR(n-1, k+(n-1));
        }
    }

    static int normalR(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+normalR(n-1);
        }
    }
}