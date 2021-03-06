package speedrun;
import org.bukkit.Location;
 

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Also NOT thread safe
public class Arena { 
    // Individual arena info here

    // Ofc, this CAN'T be the ID COULD IT? (jk)
    private final int id;
    private final List<UUID> players = new ArrayList<UUID>();
 
    public Arena(Location spawn, int id) {
        this.id = id;
    }

    // Getters
 
    public int getId() {
        return this.id;
    }
 
    public List<UUID> getPlayers() {
        return this.players;
    }
}