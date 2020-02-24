package definition;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private MylinkedList<String> contactNumbers;

    public Person(String firstName, String lastName, String email, MylinkedList<String> contactNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumbers = contactNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumbers() {
        StringBuilder contacts = new StringBuilder();
        boolean a = false;
        for (int i = 0; i < contactNumbers.size; i++) {
            if (i == 0) {
                contacts.append(contactNumbers.getData(i));
            } else
                contacts.append(",").append(contactNumbers.getData(i));
        }
        if (contactNumbers.size == 0) {
            contacts.append("null");
        } else if (contactNumbers.size == 1) {
            a = true;
        }

        return a ? "Contact: " + contacts : "Contacts:" + contacts;
    }


    @Override
    public String toString() {
        return "firstName: " + getFirstName() + "\n" + "lastName: " + getLastName() + "\n" + getContactNumbers() + "\n" + "Email: " + getEmail() + "\n" + "--------*--------*--------*--------\n" +
                "--------*--------*--------*--------\n";

    }
}
