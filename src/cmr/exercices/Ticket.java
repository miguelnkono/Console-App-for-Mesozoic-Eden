package cmr.exercices;


import java.time.LocalDate;

/*
* Ticket
* @params :
*   - visitor's name
*   - price
*   - visit date
*
* @methods :
*   - expire
*   - getters
* */
public class Ticket {
    private String visitor_name;
    private int price;
    private LocalDate visit_date;

    public Ticket(String visitor_name, int price, LocalDate visit_date) {
        this.visitor_name = visitor_name;
        this.price = price;
        this.visit_date = visit_date;
    }

    public boolean has_expired(LocalDate new_date) {
//        return visit_date == new_date;
        return visit_date.equals(new_date);
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getVisit_date() {
        return visit_date;
    }

    public String getVisitor_name() {
        return visitor_name;
    }
}
