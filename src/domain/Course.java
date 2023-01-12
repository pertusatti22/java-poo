package domain;

public class Course extends Content{

    private int gradeTime;

    @Override
    public double xpCalculate() {
        return DEFAULT_XP * gradeTime;
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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", gradeTime=" + gradeTime +
                '}';
    }
}
