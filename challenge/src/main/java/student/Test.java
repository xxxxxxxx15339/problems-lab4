package student;

public class Test {
    public static void main(String[] args) {
        Major computerScience = new Major("23", "Computer Science");
        Major mathematics = new Major("15", "Mathematics");
        
        Student student1 = new Student("Amal", "SAFI", "123456789", "amal.safi@email.com", "22885676", computerScience);
        Student student2 = new Student("Samir", "ALAMI", "987654321", "samir.alami@email.com", "23585976", computerScience);
        Student student3 = new Student("Ahmed", "BENALI", "555666777", "ahmed.benali@email.com", "12345678", mathematics);
        Student student4 = new Student("Fatima", "ELIDRISSI", "111222333", "fatima.elidrissi@email.com", "87654321");
        
        computerScience.displayStudents();
        
        System.out.println("\nTesting other methods:");
        System.out.println("Student count in Computer Science: " + computerScience.getStudentCount());
        System.out.println("Occupancy rate: " + String.format("%.1f", computerScience.getOccupancyRate()) + "%");
        
        Student foundStudent = computerScience.findStudentByCNE("22885676");
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getFullNameFormatted());
        }
        
        boolean removed = computerScience.removeStudent("23585976");
        System.out.println("Student removed: " + removed);
        System.out.println("Student count after removal: " + computerScience.getStudentCount());
        
        System.out.println("\nUpdated computer science students:");
        computerScience.displayStudents();
    }
}

