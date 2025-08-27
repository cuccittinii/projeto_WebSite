package scr;

import java.util.ArrayList;
import java.util.List;

public class User {
   private String name;
   private String phoneNumber;
   private String email;
   private List<Pet> pets;

   public User (String name, String phoneNumber, String email){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.email = email;
       this.pets= new ArrayList<>(); // inicializa a lista de pets
   }

    // método para adicionar pet
    public void adicionarPet(Pet pet) {
        pets.add(pet);
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

    public List<Pet> getPets() {
        return pets;
    }


    public void exibirPets() {
        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            System.out.println("Pets cadastrados:");
            int contador = 1; // numerar os pets
            for (Pet p : pets) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println(contador + " Pet:");
                p.exibirInfo();
                contador++;
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }


    public  void exibirInfo(){
        System.out.println("Client Name:" + name);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email Address:" + email);
    }

}

