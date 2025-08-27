package scr;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Cadastro de Usuario:");
        System.out.println("-------------------------------------------------------------------");

        System.out.print("Client Name:");
        String name = kb.nextLine().trim();

        System.out.print("Phone Number:");
        String phoneNumber = kb.nextLine().trim();

        System.out.print("Email Address:");
        String email = kb.nextLine().trim();

        // Criando objeto User
        User user = new User(name, phoneNumber, email);

        System.out.println("-------------------------------------------------------------------");

        // --- Cadastro de pets ---
        String namePet;  // variável que vai controlar o loop
        do {
            System.out.print("Pet Name (ou 'sair' para encerrar): ");
            namePet = kb.nextLine().trim();

            // Se o usuário digitar "sair", encerra o loop
            if (namePet.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Specie: ");
            String specie = kb.nextLine().trim();

            System.out.print("Age: ");
            int age = Integer.parseInt(kb.nextLine().trim()); // evita problemas com nextInt + nextLine

            // Criando o objeto Pet
            Pet pet = new Pet(namePet, specie, age);

            // Adicionando o pet à lista do usuário
            user.adicionarPet(pet); //!!! NÃO ENTENDI BEM ESSA LINHA, REFAZER E ENTENDER

            System.out.println("Pet cadastrado com sucesso!");
            System.out.println("-------------------------------------------------------------------");

        } while (true); // continua até digitar "sair"

        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
        System.out.println("-------------------------------------------------------------------");

        // Exibe informações do usuário
        user.exibirInfo();
        System.out.println("-------------------------------------------------------------------");

        // Exibe todos os pets cadastrados
        user.exibirPets();

        kb.close();
    }
}
