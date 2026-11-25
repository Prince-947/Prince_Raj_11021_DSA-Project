import java.io.*;
import java.util.*;

class Item {
    String id, name;
    int price;
    Item(String id, String name, int price) {
        this.id = id; this.name = name; this.price = price;
    }
    public String toString() {
        return id + " | " + name + " | " + price;
    }
}
public class ShoppingWishlistManager {
    static ArrayList<Item> list = new ArrayList<>();
    static int idCounter = 101;
    static final String FILE = "wishlist.txt";

    static void add(String name, int price, boolean fromFile) {
        if (price <= 0) { System.out.println("Price must be greater than 0."); return; }
        String id = fromFile ? name.split(":")[0] : "W" + idCounter++;
        String itemName = fromFile ? name.split(":")[1] : name;
        Item item = new Item(id, itemName, price);
        list.add(item);
        if (fromFile) idCounter = Math.max(idCounter, Integer.parseInt(id.substring(1)) + 1);
        else System.out.println("Item added. ID: " + item);
    }
    static void display() {
        if (list.isEmpty()) { System.out.println("Wishlist is empty."); return; }
        for (int i = 0; i < list.size(); i++)
            System.out.println((i + 1) + ". " + list.get(i));
    }
    static void sort() {
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = 0; j < list.size() - i - 1; j++)
                if (list.get(j).price > list.get(j + 1).price) {
                    Item tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
        display();
    }
    static void remove(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equalsIgnoreCase(id)) {
                list.remove(i);
                System.out.println("Item " + id + " removed.");
                return;
            }
        }
        System.out.println("Item " + id + " not found.");
    }
    static void total() {
        int sum = 0;
        for (Item item : list) sum += item.price;
        System.out.println("Total wishlist cost: " + sum + " | Items: " + list.size());
    }
    static void load() {
        File f = new File(FILE);
        if (!f.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            for (String line; (line = br.readLine()) != null; ) {
                String[] p = line.split("\\|");
                if (p.length == 3) add(p[0] + ":" + p[1], Integer.parseInt(p[2]), true);
            }
        } catch (Exception ignored) {}
    }
    static void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Item item : list)
                pw.println(item.id + "|" + item.name + "|" + item.price);
        } catch (Exception ignored) {}
    }
    public static void main(String[] args) {
        load();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n1-Add, 2-Display, 3-Sort, 4-Remove, 5-Total, 6-Exit: ");
            if (!sc.hasNextInt()) { sc.next(); continue; }
            int ch = sc.nextInt(); sc.nextLine();
            switch (ch) {
                case 1 -> {
                    System.out.print("Item: "); String name = sc.nextLine().trim();
                    System.out.print("Price: "); int price = sc.hasNextInt() ? sc.nextInt() : -1;
                    sc.nextLine(); add(name, price, false);
                }
                case 2 -> display();
                case 3 -> sort();
                case 4 -> { System.out.print("ID: "); remove(sc.nextLine().trim()); }
                case 5 -> total();
                case 6 -> { save();
                return;
                }
            }
        }
    }
}