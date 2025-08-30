package scr.model;

public class Pet  {
    private String namePet;
    private String specie;
    private int age;
    private User owner;

    public Pet(String namePet, String specie, int age, User onwer){
        this.namePet = namePet;
        this.specie = specie;
        this.age = age;
        this.owner = onwer;

    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getSpecie() {
        return specie;
    }

    public String getNamePet() {
        return namePet;
    }

    public void exibirInfo(){
        System.out.println("Name Pet:" + namePet);
        System.out.println("Specie:" + specie);
        System.out.println("Age:" + age);

    }
}
