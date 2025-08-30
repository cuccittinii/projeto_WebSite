package scr.model;

public class Services {

    enum Type {
        Dog_Walk,
        Pet_Sitter
    }

    private Type type;
    private Double price;
    private int durationMinutes;

    public Services(Type type,Double price, int durationMinutes){
        this.type = type;
        this.price = price;
        this.durationMinutes = durationMinutes;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
