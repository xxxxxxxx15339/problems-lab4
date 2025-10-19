package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 50;

    public Major() {
        this.id = nextId++;
        this.code = "";
        this.name = "";
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    public void addStudent(Student s) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = s;
            studentCount++;
        } else {
            System.out.println("Cannot add student: Major is at maximum capacity (50 students)");
        }
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String getName() { return name; }
    public Student[] getStudents() { return students; }
    public int getStudentCount() { return studentCount; }
    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }

    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne) {
        Student student = findStudentByCNE(cne);
        if (student != null) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i] == student) {
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[studentCount - 1] = null;
                    studentCount--;
                    return true;
                }
            }
        }
        return false;
    }

    public double getOccupancyRate() {
        return (double) studentCount / MAX_STUDENTS * 100.0;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null) {
                sb.append((i + 1)).append(". ")
                  .append(students[i].getCne()).append(" ")
                  .append(students[i].getSecondName().toUpperCase()).append(" ")
                  .append(students[i].getFirstName())
                  .append("\n");
            }
        }
        return sb.toString();
    }

    public void displayStudents() {
        System.out.println("The list of students in the " + name.toLowerCase() + " major is:");
        System.out.print(getStudentListAsString());
    }

    public String toString() {
        return "Major{id=" + id + ", code='" + code + "', name='" + name + "', studentCount=" + studentCount + ", maxCapacity=" + MAX_STUDENTS + "}";
    }
}
