import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import com.ruddfawcett.gotham.entities.Player;

import com.ruddfawcett.gotham.items.Attribute;
import com.ruddfawcett.gotham.items.Item;
import com.ruddfawcett.gotham.items.storage.Backpack;
import com.ruddfawcett.gotham.locations.*;

public class Test {
  public static void main(String[] args) {  
	Room main = new Room("Main", "Description Main", null);
	 
	Map<Direction, Room> exits = new HashMap<Direction, Room>();
	
	for (Direction dir : Direction.values()) {
		Map<Direction, Room> tmpExits = new HashMap<Direction, Room>();
		tmpExits.put(dir.getOpposite(), main);
		
		Room tmp = new Room(toDisplayCase(dir.toString()) + " room", "Test", tmpExits);
		exits.put(dir, tmp);
	}
	
	main.setExits(exits);
	  
    Player p = new Player("Bruce Wayne", "Batman", main);
    p.backpack = new Backpack();

    for (int i = 0; i < 2; i++) {
      List<Attribute> attributes = new ArrayList<Attribute>();
      attributes.addAll(Arrays.asList(Attribute.HEAVY));

      Item item = new Item(Integer.toString(i), "Test", attributes);
      
      p.backpack.add(item);
    }

    log(p.getAlias() + "'s " + p.backpack);
    
    p.move(Direction.EAST);
    
    
  }

  public static void log(Object x) {
    System.out.println(x);
  }
  
  // https://stackoverflow.com/questions/1086123/string-conversion-to-title-case
  public static String toDisplayCase(String s) {
	    final String ACTIONABLE_DELIMITERS = " '-/"; // these cause the character following
	                                                 // to be capitalized
	    StringBuilder sb = new StringBuilder();
	    boolean capNext = true;

	    for (char c : s.toCharArray()) {
	        c = (capNext)
	                ? Character.toUpperCase(c)
	                : Character.toLowerCase(c);
	        sb.append(c);
	        capNext = (ACTIONABLE_DELIMITERS.indexOf((int) c) >= 0); // explicit cast not needed
	    }
	    return sb.toString();
	}
}
