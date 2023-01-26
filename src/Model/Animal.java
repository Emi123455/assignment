package Model;

public class Animal {
    public String breed ="huskey";
    public String mclass = "mammals";
    Boolean vaccinated;
    public String habitat;

    public Animal(Boolean vaccinated, String habitat) {
        this.vaccinated = vaccinated;
        this.habitat = habitat;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
