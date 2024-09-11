package cmr.exercices;


/*
* Park class
* @params :
*   - name
*   - employees
*   - dinosaurs
*   - opening_closing_hours
*
* @methods :
*   - open
*   - close
*   - add dinosaur
*   - remove a dinosaur
*   - greet welcome at the entrance
* */

import java.util.ArrayList;

// enum representing the opening and closing state.
enum Available {
    OPEN,
    CLOSE
}

public class Park {
    private final String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Enclosure> enclosures = new ArrayList<>();    // List of enclosures in the park.
    Available is_open = Available.OPEN;

    public Park (String name,
                 ArrayList<Employee> employees,
                 ArrayList<Enclosure> enclosure)
    {
        this.name = name;
        this.employees = employees;
        this.enclosures = enclosure;
    }

    public void setIs_open(Available is_open) {
        this.is_open = is_open;
    }

    // greeting message.
    public void Welcome() {
        System.out.println("\tWelcome to Mesozoic Eden park\n" +
                        "\tWe hope that you will have a wonderful journey in our lovely park\n");
    }

    /* Methods for adding dinosaurs and removing them. */
    public void Add(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }
    public void Add(Enclosure[] enclosures) {
        for (Enclosure enclosure : enclosures) {
            Add(enclosure);
        }
    }
    /*public Dinosaur Remove() {  // To be checked later
        return this.dinosaurs.remove(1);
    }*/

    // methods open close:
    public void Open() {
        System.out.println("Opening of the Mesozoic Eden park.");
    }
    public void close() {
        System.out.println("Closing of the Mesozoic Eden park.");
    }

    public ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> temp = this.employees;
        return temp;
    }
    /*public ArrayList<Dinosaur> getDinosaurs() {
        ArrayList<Dinosaur> temp = this.dinosaurs;
        return temp;
    }*/
    public ArrayList<String> getEnclosuresNames() {
//        String names = enclosures.get(1).getName();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < enclosures.toArray().length; i ++) {    // toArray().length
            String name = enclosures.get(i).getName();
            names.add(name);
        }
        return names;
    }
}
