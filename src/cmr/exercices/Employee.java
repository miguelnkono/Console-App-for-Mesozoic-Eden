package cmr.exercices;

/*
* Employee class
* @params :
*   - name
*   - job
*   - years of experience
*   - salary
* @methods :
*   - getters
*   - setters
* */
public class Employee {
    private String name;
    private String job;
    private int salary;
    private int years_of_experience;

    public Employee(String name, String job, int salary, int years_of_experience) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.years_of_experience = years_of_experience;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getYears_of_experience() {
        return years_of_experience;
    }
    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

}
