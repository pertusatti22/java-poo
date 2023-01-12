package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Student {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> doneContents = new LinkedHashSet<>();

    public void bootcampSignUp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedStudents().add(this);
    }

    public void leveling() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()) {
            this.doneContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double xpCalculate() {
        return this.doneContents
                .stream()
                .mapToDouble(Content::xpCalculate)
                .sum();
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

    public Set<Content> getDoneContents() {
        return doneContents;
    }

    public void setDoneContents(Set<Content> doneContents) {
        this.doneContents = doneContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getSubscribedContents(), student.getSubscribedContents()) && Objects.equals(getDoneContents(), student.getDoneContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubscribedContents(), getDoneContents());
    }
}
