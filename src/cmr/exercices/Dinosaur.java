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

    public Dinosaur(String name, int age, int weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
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

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAge() + ", " + getWeight() + ", " + getSpecies() + "]";
    }
}
