public class MainApp {
    public static void main(String[] args) {
        User user=new User(1,"deshan");
        String emails[]={"n@gmail.com", "p@yahoo.com"};
        user.input(emails);
    }
}

class EmailException extends Exception{
    String email;
    public EmailException(String email){
        super(email);
    }
    public String getEmail(){
        return this.email;
    }
}

class User{
    int id;
    String name;
    String email[];

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean ValidateEmails(int index){
        if(((email[index].substring(email[index].indexOf("@") + 1)).equals("gmail.com")) || 
        (((email[index].substring(email[index].indexOf("@") + 1)).equals("yahoo.com"))) || 
        (((email[index].substring(email[index].indexOf("@") + 1)).equals("hotmail.com")))){
            return true;
        }
        else{
            return false;
        }
    }

    public void input(String e[]){
        email=new String[e.length];
        for(int i=0; i<e.length; i++){
            
                    email[i]=e[i];
          
        }
        

        for(int i=0; i<email.length;i++){
            try {
                if(!ValidateEmails(i)){
                    throw new EmailException(email[i].toString()+" Not Valid");
                }
            } catch (Exception a) {
                System.out.println(a);
            }
        }
    }
    
}