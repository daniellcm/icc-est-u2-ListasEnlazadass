package controller;

import model.Contact;
import view.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        boolean running = true;

        while (running) {
            consoleView.displayMenu();
            String option = consoleView.getInput("Opción: ");

            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    contactManager.printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Opción no válida.");
            }
        }
    }

    public void addContact() {
        String nombre = consoleView.getInput("Nombre: ");
        String phone = consoleView.getInput("Teléfono: ");
        Contact contact = new Contact(nombre, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto agregado.");
    }

    public void findContact() {
        String nombre = consoleView.getInput("Nombre a buscar: ");
        Contact contact = contactManager.findContactByName(nombre);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    public void deleteContact() {
        String nombre = consoleView.getInput("Nombre a eliminar: ");
        boolean deleted = contactManager.deleteContactByName(nombre);
        if (deleted) {
            consoleView.showMessage("Contacto eliminado.");
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }
}