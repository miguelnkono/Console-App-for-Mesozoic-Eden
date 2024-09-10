package cmr.exercices;


/*
* Food class
* @params :
*   - name
*   - nutritional value
*   - cost
* */
public record Food(String name, String nutritional_value, int cost) {

    public String getName() { return name; }
    public int getCost() { return cost; }
    public String getNutrition_value() { return nutritional_value; }

}
