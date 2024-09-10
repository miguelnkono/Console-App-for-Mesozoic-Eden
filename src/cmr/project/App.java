package cmr.project;

import cmr.exercices.Dinosaur;
import cmr.exercices.Employee;

public class App {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur("Tiranosaur", 1500, 35, "Canivore");
        System.out.println(dinosaur);

        Employee employee = new Employee("Nkono Ndeme Miguel", "Student", 500_000, 1);
        System.out.println(employee.getSalary() + "Fcfa");
    }
}
