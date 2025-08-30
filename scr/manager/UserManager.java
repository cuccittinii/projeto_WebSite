package scr.manager;

import scr.model.User;

import  java.util.*;

public class UserManager {

    private List <User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("Usuário " + user.getName() + " cadastrado com sucesso!");
    }

    public void registerUser(){
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

        // Cria o objeto User com os dados
        User newUser = new User(name, phoneNumber, email);

        // Adiciona o novo usuário à lista
        this.addUser(newUser);
    }

    public void listUsers(){
        if (users.isEmpty()){
            System.out.println("Nenhum usuário cadastrado.");
        }else {
            System.out.println("Usuários cadastrados:");
            int contador = 1; // numerar os users
            for (User u : users) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println(contador + " Usuário:");
                u.exibirInfo(); // Chama o método da classe User
                contador++;
            }
        }

    }

    public User findUserByName(String name){
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)){
                return u;  // Retorna o usuário encontrado
            }
        }
        return null;  // Retorna nulo se o usuário não for encontrado
    }
}
