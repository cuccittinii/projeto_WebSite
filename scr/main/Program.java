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