package domain;

public class Course {
    private String title;
    private String description;
    private int gradeTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGradeTime() {
        return gradeTime;
    }

    public void setGradeTime(int gradeTime) {
        this.gradeTime = gradeTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", gradeTime=" + gradeTime +
                '}';
    }
}
