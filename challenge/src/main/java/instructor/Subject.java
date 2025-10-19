package instructor;

public class Subject {
    private String code;
    private String title;

    public Subject() {
        this.code = "";
        this.title = "";
    }

    public Subject(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }

    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        if (title == null || title.isEmpty()) return title;
        
        String[] words = title.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1) {
                    sb.append(words[i].substring(1).toLowerCase());
                }
                if (i < words.length - 1) sb.append(" ");
            }
        }
        return sb.toString();
    }

    public boolean isIntroCourse() {
        if (code == null || title == null) return false;
        return title.toLowerCase().contains("intro") || code.toUpperCase().startsWith("INTRO-");
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode()).append(" - ").append(properTitle());
        if (instructor != null) {
            sb.append(" (Instructor: ").append(instructor.getLastName())
              .append(" ").append(instructor.getFirstName()).append(")");
        }
        return sb.toString();
    }

    public String toString() {
        return "Subject{code='" + code + "', title='" + title + "'}";
    }
}
