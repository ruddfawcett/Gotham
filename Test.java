import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import com.ruddfawcett.gotham.entities.Player;

import com.ruddfawcett.gotham.items.Attribute;
import com.ruddfawcett.gotham.items.Item;
import com.ruddfawcett.gotham.items.storage.Backpack;

public class Test {
  public static void main(String[] args) {
    Player p = new Player("John Doe");
    p.backpack = new Backpack();

    for (int i = 0; i < 12; i++) {
      List<Attribute> attributes = new ArrayList<Attribute>();
      attributes.addAll(Arrays.asList(Attribute.HEAVY, Attribute.CUBIC, Attribute.TALL));

      Item item = new Item(Integer.toString(i), "Test", attributes);
      
      p.backpack.add(item);
    }

    log(p.getName() + "'s " + p.backpack);
  }

  public static void log(Object x) {
    System.out.println(x);
  }
}
