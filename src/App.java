import controller.ContactManager;
import controller.MenuController;
import model.Contact;
import view.ConsoleView;

public class App {
    public static void main(String[] args) throws Exception {
        ContactManager contactManager = new ContactManager();
        ConsoleView consoleView = new ConsoleView();
        MenuController menuController = new MenuController(contactManager, consoleView);
        menuController.showMenu();
        Contact c1 = new Contact("Juan" , "123");
        Contact c2 = new Contact("Juan" , null);
        Contact c3 = new Contact("Juana" , "414");
        Contact c4 = new Contact("Juan"  , "");
        Contact c5 = new Contact("Juan" , "123");
        System.out.println(c1.getNombre() == c2.getNombre());
    }
}
