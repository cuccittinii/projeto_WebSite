package scr.manager;

import scr.model.Pet;
import scr.model.User;

import java.util.*;

public class PetManager {
    private List<Pet> pets =new ArrayList<>();
    private UserManager userManager;


    public PetManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void addPet(Pet pet){
        pets.add(pet);
        System.out.println("Pet " + pet.getNamePet() + " Cadastrado com sucesso.");
    }

    public void registerPet(){
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite o nome do dono: ");
        String ownerName = kb.nextLine().trim();

        User owner = userManager.findUserByName(ownerName);

        if (owner == null){
            System.out.println("Dono não encontrado. Por favor, cadastre o usuário " +
                    "primeiro.");
            return;
        }
        System.out.print("Nome do Pet: ");
        String namePet = kb.nextLine();

        System.out.print("Espécie: ");
        String specie = kb.nextLine();

        System.out.print("Idade: ");
        int age = Integer.parseInt(kb.nextLine());

        Pet newPet = new Pet (namePet, specie, age, owner);
        this.addPet(newPet);
    }
    // PetManager.java

    // Adicione este novo método à sua classe PetManager
    public void listPetsForUser() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite o nome do dono para listar os pets: ");
        String ownerName = kb.nextLine();

        // 1. Procura o dono usando a UserManager
        User owner = userManager.findUserByName(ownerName);

        if (owner == null) {
            System.out.println("Dono não encontrado. Verifique o nome e tente novamente.");
            return; // Sai do método se o dono não for encontrado
        }

        System.out.println("--- Pets de " + owner.getName() + " ---");
        boolean hasPets = false; // Flag para verificar se o dono tem pets
                //'hasPet' variavel criada para realizar a verificação se tem
                // ou não um pet aquele dono.

        // 2. Percorre a lista de TODOS os pets
        for (Pet pet : pets) {
            // 3. Verifica se o dono do pet atual é o mesmo que a gente procurou
            if (pet.getOwner().equals(owner)) {
                pet.exibirInfo(); // Chama o método da classe Pet para exibir as informações
                System.out.println("-------------------------");
                hasPets = true;
            }
        }

        if (!hasPets) {
            System.out.println("Nenhum pet cadastrado para este dono.");
        }
    }
}
