package instructor;

public class Instructor {
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String email;
    private String phone;

    public Instructor() {
        this.employeeNumber = "";
        this.lastName = "";
        this.firstName = "";
        this.email = "";
        this.phone = "";
    }

    public Instructor(String employeeNumber, String lastName, String firstName, String email, String phone) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
    }

    public String getEmployeeNumber() { return employeeNumber; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }

    public String cleanEmployeeNumber() {
        return employeeNumber.trim().replaceAll("\\s+", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", 
                           cleanEmployeeNumber(), lastName, firstName);
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(firstName);
        }
        return sb.toString();
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(cleanEmployeeNumber()).append("\n");
        sb.append("Name : ").append(displayName()).append("\n");
        sb.append("Email : ").append(email != null ? email : "").append("\n");
        sb.append("Phone : ").append(phone != null ? phone : "").append("\n");
        return sb.toString();
    }

    public String toString() {
        return "Instructor{employeeNumber='" + employeeNumber + "', lastName='" + lastName + "', firstName='" + firstName + "', email='" + email + "', phone='" + phone + "'}";
    }
}
