package controller;

import model.*;

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    public Contact findContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        current.setNext(new Node<>(null));

        while (current != null) {
            if (current.getValue() != null && current.getValue().getNombre().equals(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        while (current != null) {
            Contact c = current.getValue();
            if (c != null && c.getNombre().equals(name)) {
                return contacts.deleteByValue(c);
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }
}