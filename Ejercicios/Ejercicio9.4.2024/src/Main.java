//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University universidad1 = new University("Utn");
        Student alumno1 = new Student("Nazareno Fioretti", universidad1);

        Person persona1 = new Person("Rodrigo Zapata");
        //Para representar la agregacion, se deja un constructor con
        //con el atributo name, que es inherente al concepto de persona.
        Person[] personas1 = new Person[2];
        personas1[0] = new Person("Claudia Naveda");
        personas1[1] = new Person("Cintia Rigoni");
        Book libro1 =  new Book("Ubik"); //Lo mismo con el libro
        Book libro2 = new Book(personas1, "Fundamentos de la Programacion");

        Employee empleado1 = new Employee("Analista", "Uriel Castellino");
        Employee[] empleados1 = new Employee[3];
        empleados1[0] = new Employee("Tecnico", "Thomas Muñoz");
        empleados1[1] = new Employee("Gerente", "Paula Geier");
        empleados1[2] = new Employee("Inpector", "Mauro Garzia");
        Employee[] empleados2 = new Employee[3];
        empleados2[0] = new Employee("Conserje", "Hernan Cortez");
        empleados2[1] = new Employee("Electricista", "Luciano Aguilera");
        empleados2[2] = new Employee("Programador mayor", "Tomas Berdejo");
        Section departamento1 = new Section(); //Lo mismo con el departamento
        Section[] departamentos1 = new Section[2];
        departamentos1[0] = new Section(empleados1, "Control de calidad");
        departamentos1[1] = new Section(empleados2, "Produccion");
        Company empresa1 = new Company(); //Lo mismo con la empresa
        Company empresa2 = new Company(departamentos1);

        Door[] puertas1 = new Door[3];
        puertas1[0] = new Door("Madera");
        puertas1[1] = new Door("Metal");
        puertas1[2] = new Door("Cristal");
        //Pero con casa, al inherentemente tener puertas, no puede tener un constructor vacio
        House casa1 = new House(puertas1);





    }
}