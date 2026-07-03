
import util.Menu;

public class Main {
    public static void main(String[] args) {

        boolean running = true;

        Menu menu = new Menu();

        while (running){
        int choice = menu.getUserChoice();

        switch (choice){

            case 1:
                menu.addTask();
                break;

            case 2:
                menu.showTasks();
                break;

            case 3:
                System.out.println("Good Bye!");
                running = false;
                break;

            default:
                System.out.println("Invalid choice");
        }
        }

    }
}