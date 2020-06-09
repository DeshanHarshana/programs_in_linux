public class sum_of {
    public static void main(String[] args) {
        System.out.println(sumof(2));
    }

    static int sumof(int n){
        return sum(n,n);
    }

    static int sum(int n, int k) {
        if(n==0 || n==1){
            return k;
        }
        else{
            return sum(n-1, n+(k-1));
        }
    }
}