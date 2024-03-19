public abstract class Animal {
    //Atributos
    private String name;
    private int age;
    private String gender;
    //Constructor
    public Animal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Animal(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //Metodos
    public void makeSound(){
        System.out.println("El animal hace un sonido generico.");
    }
    public void tongueShower(){
        System.out.println("El animal se baña con la lengua...");
    }
    public void info(){
        System.out.println("Animal: "+getClass());
        System.out.println("Nombre: "+getName());
        System.out.println("Edad: "+getAge());
        System.out.println("Genero: "+getGender());
    }
}
