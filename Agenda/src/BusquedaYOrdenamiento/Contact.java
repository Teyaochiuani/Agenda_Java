package BusquedaYOrdenamiento;

public class Contact implements Comparable {

    private String firstName, lastName, phone;

    public Contact(String firsName, String lastName, String phone) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String toString() {
        return lastName + " , " + firstName + "\t" + phone;
    }

    public int compareTo(Object o) {
        int result;

        if (lastName.equals(((Contact) o).lastName)) {
            result = firstName.compareTo(((Contact) o).firstName);
        } else {
            result = lastName.compareTo(((Contact) o).lastName);
        }
        return result;

    }

}
