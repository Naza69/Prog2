public class Bird extends Animal{
    private String race;
    private String plumage;
    public Bird(){}
    public Bird(String name, int age, String gender, String race, String plumage){
        super(name, age, gender);
        this.race = race;
        this.plumage = plumage;
    }

    public String getRace() {
        return race;
    }

    public String getPlumage() {
        return plumage;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setPlumage(String plumage) {
        this.plumage = plumage;
    }
    //Metodos nativos
    public void fly(){
        System.out.println("El pajaro aletea sus alas, da una vuelta en el aire volando, y vuelve a ti.");
    }
    public void stealSomething(String something){{
        System.out.println("El pajaro se va volando, pasa un rato, y vuelve con algo en su pico, es "+(something)+"!");}
    }
    //Metodos heredados
    @Override
    public void makeSound() {
        System.out.println("El pajaro chirria fuerte!");
    }
    @Override
    public void tongueShower() {
        System.out.println("El pajaro se baña con la lengua...");
    }
}
