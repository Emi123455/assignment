package Model;

public class Cat extends Animal{
    public String name;

    public Cat(String name, Boolean vaccinated, String habitat) {
        super(vaccinated, habitat);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
