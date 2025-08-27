package scr;

public class Pet  {
    private String namePet;
    private String specie;
    private int age;

    public Pet(String namePet, String specie, int age){
        this.namePet = namePet;
        this.specie = specie;
        this.age = age;

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
