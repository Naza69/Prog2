public class Section {
    private Employee[] employees;
    private String name;
    public Section(Employee[] employees, String name){
        this.employees = employees;
        this.name = name;
    }
    public Section(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}