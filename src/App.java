import controller.ContactManager;
import controller.MenuController;
import view.ConsoleView;

public class App {
    public static void main(String[] args) throws Exception {
        ContactManager contactManager = new ContactManager();
        ConsoleView consoleView = new ConsoleView();
        MenuController menuController = new MenuController(contactManager, consoleView);
        menuController.showMenu();
    }
}
