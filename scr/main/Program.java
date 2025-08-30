package scr.main;

import scr.manager.UserManager;
import scr.manager.PetManager;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        UserManager userManager = new UserManager();
        PetManager petManager = new PetManager(userManager); // Criando o PetManager e passando o UserManager

        int option;

        do {
            System.out.println("-------------------------------------------------------------------");

            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Cadastrar novo cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Adicionar pet a um cliente");
            System.out.println("4. Listar pets de um cliente");
            System.out.println("5. Sair");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            option = kb.nextInt();
            kb.nextLine(); // Consumir a linha extra

            switch (option) {
                case 1:
                    userManager.registerUser();
                    break;
                case 2:
                    userManager.listUsers();
                    break;
                case 3:
                    petManager.registerPet(); // Chamando o método do PetManager
                    break;
                case 4:
                    petManager.listPetsForUser();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 5);

    }
}

//        System.out.println("-------------------------------------------------------------------");
//
//        // --- Cadastro de pets ---
//        String namePet;  // variável que vai controlar o loop
//        do {
//            System.out.print("Pet Name (ou 'sair' para encerrar): ");
//            namePet = kb.nextLine().trim();
//
//            // Se o usuário digitar "sair", encerra o loop
//            if (namePet.equalsIgnoreCase("sair")) {
//                break;
//            }
//
//            System.out.print("Specie: ");
//            String specie = kb.nextLine().trim();
//
//            System.out.print("Age: ");
//            int age = Integer.parseInt(kb.nextLine().trim()); // evita problemas com nextInt + nextLine
//
//            // Criando o objeto Pet
//            Pet pet = new Pet(namePet, specie, age);
//
//            // Adicionando o pet à lista do usuário
//            user.adicionarPet(pet); //!!! NÃO ENTENDI BEM ESSA LINHA, REFAZER E ENTENDER
//
//            System.out.println("Pet cadastrado com sucesso!");
//            System.out.println("-------------------------------------------------------------------");
//
//        } while (true); // continua até digitar "sair"
//
//        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
//        System.out.println("-------------------------------------------------------------------");
//
//        // Exibe informações do usuário
//        user.exibirInfo();
//        System.out.println("-------------------------------------------------------------------");
//
//        // Exibe todos os pets cadastrados
//        user.exibirPets();
//
//        kb.close();
//    }


//    Services service1 = new Services(Services.Type.Pet_Sitter, 60.0, 60);
//    Services service2 = new Services(Services.Type.Dog_Walk, 30.0,50);
//
//        System.out.println("Serviço 1:" + service1.getType() +
//                " | Price:" + service1.getPrice() +
//                " | Duration:" + service1.getDurationMinutes() + "min" );
//
//    // Alterando o tipo do serviço via setter
//        service1.setType(Services.Type.Dog_Walk);
//        System.out.println("Serviço 1 atualizado: " + service1.getType());
//
//}