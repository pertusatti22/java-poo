package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> doneContent = new LinkedHashSet<>();

    public void bootcampSignUp(Bootcamp bootcamp) {

    }

    public void leveling() {

    }

    public void xpCalculate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getDoneContent() {
        return doneContent;
    }

    public void setDoneContent(Set<Content> doneContent) {
        this.doneContent = doneContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getSubscribedContents(), student.getSubscribedContents()) && Objects.equals(getDoneContent(), student.getDoneContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubscribedContents(), getDoneContent());
    }
}
