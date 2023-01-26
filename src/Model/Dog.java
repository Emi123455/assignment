package Model;

public class Dog extends Animal {
    private int id;

    public Dog(int id, Boolean vaccinated, String habitat) {
        super(vaccinated, habitat);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
