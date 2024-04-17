import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player jugador1 = new Player("Emanuel Ginobili", "Escolta", 20);
        Player jugador2 = new Player("Michael Jordan", "Escolta", 45);
        Player jugador3 = new Player("Shaquille O'Neal", "Pivot", 32);

        ArrayList<Player> jugadores1 = new ArrayList<>();
        jugadores1.add(jugador1);
        jugadores1.add(jugador2);
        jugadores1.add(jugador3);

        Team equipo1 = new Team(jugadores1);

        for(Player player : equipo1){
            System.out.println("Nombre: "+player.getName());
            System.out.println("Posicion: "+player.getPosition());
            System.out.println("Numero de camiseta: "+player.getNumber());
        }
    }
}
