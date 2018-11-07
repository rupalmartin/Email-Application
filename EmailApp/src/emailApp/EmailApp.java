package emailApp;

public class EmailApp {

    public static void main(String args[]){
        Email email= new Email("Rupal", "Martin");
        email.setAlternateEmail("martinrupal@sjsu.edu");
        email.geAlternateEmail();
        email.changepassword("passwordChanged");
        email.getPassword();
        System.out.println(email.showInfo());

    }
}
