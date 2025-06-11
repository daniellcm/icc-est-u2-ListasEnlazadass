package model;

public class Contact {
    private String nombre;
    private String telefono;

    public Contact(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contact{Nombre='" + nombre + "', Telefono='" + telefono + "'}"; 
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0; 
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) 
            return true;
            
        if(object == null || getClass() != object.getClass()){
            return false;
        }
        Contact c = (Contact) object;
        c.getNombre();    
        return nombre != null && nombre.equals(c.getNombre());
    }
}