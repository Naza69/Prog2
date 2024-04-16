public abstract class Animal {
    private String name;
    private int age;
    private String type;
    private double price;

    public Animal(String name, int age, String type, double price){
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
    }

    public Animal(){}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override

    public String toString(){
        return "Nombre: "+name+"\n"+"Edad: "+age+"\n"+"Tipo: "+type+"\n"+"Precio: "+price;
    }
}
