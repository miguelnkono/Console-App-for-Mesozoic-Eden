package cmr.exercices;


/*
* Enclosure that contains dinosaurs inside.
* @params :
*   - array of dinosaurs
*   - name
*
* @methods :
*   - getters
*   - get the number of dinosaur inside the enclosure.
* */
public class Enclosure {
    private Dinosaur[] dinosaur;
    private String name;

    public Enclosure(String name, Dinosaur[] dinosaur) {
        this.dinosaur = dinosaur;
        this.name = name;
    }

    // get the number of dinosaurs inside the enclosure.
    public int Amount() {
        return dinosaur.length;
    }

    public Dinosaur[] getDinosaur() {
        Dinosaur[] temp = dinosaur;
        return dinosaur;
    }

    public String getName() {
        return name;
    }
}
