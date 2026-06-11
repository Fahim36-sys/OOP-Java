package InfoHider;
public class Main{
    public static void main(String[] args){
        Password password = new Password(8);
        String newPassword = "mySecret123";
        if (password.setPassword(newPassword)){
            System.out.println("Password set successfully.");
        } 
        else{
            System.out.println("Password must be at least " + password.getLength() + " characters long.");
        }
}
}
