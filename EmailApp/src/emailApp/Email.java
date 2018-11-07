package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private String alternateEmail;


    public Email(String fname, String lName) {
        this.firstName = fname;
        this.lastName = lName;
        System.out.println("Email created with First Name " + this.firstName + " and last name " + this.lastName);

        this.department = getDepartment();
        System.out.println("Department is " + this.department);

        this.password = Password();
        System.out.println("Your password is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".sjsu.edu";
        System.out.println("Email is " + email);
    }

    private String getDepartment() {
        System.out.println("Enter the department\n 1 For Sales\n2 For Development\n3 For Accounting\n0 For none\n Enter department code ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else return "";
    }

    private String Password() {
        String password = "ABCD";
        return password;
    }

    private String getemail() {
        return "";
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public void setAlternateEmail(String alteremail){
        this.alternateEmail=alteremail;
        System.out.println("Your alternate email is set to "+this.alternateEmail);
    }
    public String geAlternateEmail(){
       return this.alternateEmail;
    }

    public void changepassword(String pwd){
        this.password=pwd;
        System.out.println("Your Password is set to "+this.password);
    }

    public String getPassword(){
        return this.password;
    }

    public String showInfo(){
        return "Name is "+this.firstName+this.lastName+"  and email id id " +this.email;
    }

}
