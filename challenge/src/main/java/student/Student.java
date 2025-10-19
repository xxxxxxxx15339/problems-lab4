package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {
        super();
        this.cne = "";
        this.major = null;
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        if (major != null) major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = new Major("23", "Computer Science");
        this.major.addStudent(this);
    }

    public String getCne() { return cne; }
    public Major getMajor() { return major; }
    public void setCne(String cne) { this.cne = cne; }
    public void setMajor(Major major) { this.major = major; }

    public String getFullNameFormatted() {
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }

    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', secondName='" + secondName + "', phone='" + phone + "', email='" + email + "', cne='" + cne + "', major=" + (major != null ? major.getName() : "None") + "}";
    }
}

