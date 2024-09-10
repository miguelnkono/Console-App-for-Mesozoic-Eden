package cmr.exercices;


/*
* Enclosure that contains dinosaurs inside.
* @params :
*   - array of dinosaurs
*
* @methods :
*   - getters
*   - get the number of dinosaur inside the enclosure.
* */
public class Enclosure {
    private Dinosaur[] dinosaur;

    public Enclosure(Dinosaur[] dinosaur) {
        this.dinosaur = dinosaur;
    }

    // get the number of dinosaurs inside the enclosure.
    public int Amount() {
        return dinosaur.length;
    }

    public Dinosaur[] getDinosaur() {
        Dinosaur[] temp = dinosaur;
        return dinosaur;
    }
}
