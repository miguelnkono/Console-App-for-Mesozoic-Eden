package cmr.project;

import cmr.exercices.Park;

import java.util.Scanner;

/*
* main application.
* @author : Nkono Ndeme Miguel.
* @Company : Dream Technology.
* */
public class App{
    /*
    * The main dialog menu for the app.
    * */
    public static void sections() {
        int n = 4;
        System.out.print("\n" + "\t".repeat(n));
        System.out.print("*".repeat(n + 30 + 10*10)); /*"Dialog sections".length()*/
        System.out.println("\n" + "\t".repeat(n) + "|" +
                "\t".repeat((30)/2) + "Dialog sections" + "\t".repeat(n+11) +" |");
        String startLine = "\t".repeat(n) + "*".repeat(n + 30 + 10 * 10);
        System.out.print(startLine);

        System.out.print("\n" + "\t".repeat(n) + "|" +
                "\t".repeat(n-2) + "Park management" + "\t".repeat(n-1) + "|"
                + "\t".repeat(n-1) + "Tracking system" + "\t".repeat(n-1) + "|" +
                "\t".repeat(n-1)+ "Ticket system" + "\t".repeat(n-1) + "|" +
                "\t".repeat(n-1) + "Special" + "\t".repeat(n-1) + " ".repeat(n-3) + "|\n");
        System.out.print(startLine);
    }

    /*
    * Park management section.
    * */
    public static void management_section() {
        int n = 4;
        String startLine = "\t".repeat(n*4) + "*".repeat(n * 10) + "*";
        System.out.print(startLine);
        System.out.println("\n" + "\t".repeat(n*4) + "|" +
                "\t".repeat(n-1) + "PARK MANAGEMENT" + "\t".repeat(n) + "|");
        System.out.print(startLine);
        System.out.println("\n" + "\t".repeat(n*4) + "|" + " -> Dinosaurs" + "\t".repeat(n + 3) + "|");
        System.out.print(startLine);
        System.out.println("\n" + "\t".repeat(n*4) + "|" + " -> Employees" + "\t".repeat(n + 3) + "|");
        System.out.print(startLine);
        System.out.println("\n" + "\t".repeat(n*4) + "|" + " -> Tickets" + "\t".repeat(n + 3) + "|");
        System.out.print(startLine);
    }

    /*
    * Enum representing the different stage or level of the application.
    * */
    enum Stage{
        PARK_MANAGEMENT, TRACKING_SYSTEM, TICKET_SYSTEM, SPECIAL, EXIST;

    }

    /*
    * Function to make correspondence between a string representing a stage and a Stage enum element
    *  */
    public static Stage toStage(String stage) {
        return switch (stage) {
            case "park manager" -> Stage.PARK_MANAGEMENT;
            case "tracking system" -> Stage.TRACKING_SYSTEM;
            case "ticket system" -> Stage.TICKET_SYSTEM;
            case "special" -> Stage.SPECIAL;
            default -> Stage.EXIST;
        };
    }

    public static void main(String[] args) {
        int stage = 1;
        Scanner inputs = new Scanner(System.in);

        System.out.println(new StringBuilder()
                .append("\t\t")
                .append("Welcome to Mesozoic Eden park.\n\n"));

        do {
            sections();
            System.out.print("\nPlease enter your choice >>> ");
            Stage stage_name = toStage(inputs.nextLine().toLowerCase());
            System.out.println(stage_name);

            // Switch on the value of stage_name, depending on what the toStage() function returns to us.
            switch (stage_name) {
                case PARK_MANAGEMENT -> {
                    stage++; // 2
                    do {
                        management_section();
                        if (inputs.nextLine().toLowerCase().equals("dinosaurs")) {
                            // TODO
                        } else if (inputs.nextLine().toLowerCase().equals("employees")) {
                            // TODO
                        } else if (inputs.nextLine().equals("tickets")) {
                            // TODO
                        }
                        else {
                            // Exist the program.
                            stage--; // 1
                            break;
                        }
                    } while (stage != 1);
                }

                case TRACKING_SYSTEM -> {
                    // TODO
                }
                case TICKET_SYSTEM -> {
                    // TODO
                }
                case SPECIAL -> {
                    // TODO
                }
                case EXIST -> {
                    // TODO
                }

            }
            stage = 0; // just for testing.

        }while(stage != 0);
    }

    /*
    * Method to print some statics about the dinosaurs within the park.
    * */
    /*public static void statics() {
        Park park = new Park("Mesozoic Eden", )
        System.out.println(new StringBuilder()
                .append("\t\t\t")
                .append("Mesozoic Eden park counts : ")
                .append(new Park("M")));
    }*/
}