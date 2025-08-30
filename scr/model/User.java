package scr.model;

public class User {
   private String name;
   private String phoneNumber;
   private String email;

   public User (String name, String phoneNumber, String email){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.email = email;
   }


    public String getName(){
       return name;
    }

    public String getPhoneNumber(){
       return phoneNumber;
    }

    public String getEmail(){
       return email;
    }


    public  void exibirInfo(){
        System.out.println("Client Name:" + name);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email Address:" + email);
    }

}

