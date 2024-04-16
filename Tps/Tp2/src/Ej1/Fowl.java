public class Fowl extends Animal {
    private String species;
    private boolean canTalk;
    public Fowl(){}
    public Fowl(String name, int age, String type, double price, String species, boolean canTalk){
        super(name, age, type, price);
        this.species = species;
        this.canTalk = canTalk;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void isTalkative(){
        if(canTalk){
            System.out.println("Puede hablar");
        } else {
            System.out.println("No puede hablar");
        }
    }
    public boolean canTalkState(){
        return canTalk;
    }


    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }
    @Override
    public String toString(){
        return "Nombre: "+getName()+"\n"+"Edad: "+getAge()+"\n"+"Tipo: "+getType()+"\n"+"Precio: "+getPrice()+"\n"+"Especie: "+getSpecies()+"\n"+"Puede hablar: "+canTalk;
    }
}
