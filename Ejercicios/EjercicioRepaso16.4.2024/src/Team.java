import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player> {
    private ArrayList<Player> players;
    public Team(ArrayList<Player> players){
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public Iterator<Player> iterator(){
        return players.iterator();
    }

}
