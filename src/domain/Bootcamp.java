package domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String title;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finishDate = startDate.plusDays(45);
    private Set<Student> subscribedStudents = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Student> getSubscribedStudents() {
        return subscribedStudents;
    }

    public void setSubscribedStudents(Set<Student> subscribedStudents) {
        this.subscribedStudents = subscribedStudents;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getTitle(), bootcamp.getTitle()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getStartDate(), bootcamp.getStartDate()) && Objects.equals(getFinishDate(), bootcamp.getFinishDate()) && Objects.equals(getSubscribedStudents(), bootcamp.getSubscribedStudents()) && Objects.equals(getContents(), bootcamp.getContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getStartDate(), getFinishDate(), getSubscribedStudents(), getContents());
    }
}
