
import util.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        int choice = menu.getUserChoice();

        System.out.println("You selected: " + choice);

    }
}