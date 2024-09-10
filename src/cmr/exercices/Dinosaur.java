package cmr.exercices;

/*
* Dinosaur class
* @params :
*   - name
*   - age
*   - weight
*   - species
*
* @methods :
*   - getters
*   - setters
* */
public class Dinosaur {
    private String name;
    private int age;
    private int weight;
    private String species;
    private DinosaursTypes dinosaursTypes = DinosaursTypes.UNKNOWN;

    public Dinosaur(String name, int age, int weight, String species, DinosaursTypes dinosaursTypes) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.dinosaursTypes = dinosaursTypes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public DinosaursTypes getDinosaursTypes() {
        return dinosaursTypes;
    }

    public void setDinosaursTypes(DinosaursTypes dinosaursTypes) {
        this.dinosaursTypes = dinosaursTypes;
    }

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAge() + ", "
                + getWeight() + ", " + getSpecies() + ", " + getDinosaursTypes() +  "]";
    }
}
