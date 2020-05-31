class UserDefine{
    public static void main(String[] args){
        
        try {
            display(-9);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("hey");
    }

    static void display(int num) throws NullPointerException{
        
       
            if(num<0){
                num=num/0;
            }
            else{
                System.out.println(num);
            }
        
    }
}