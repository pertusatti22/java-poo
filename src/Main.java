import domain.Course;
import domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course courseJava = new Course();
        courseJava.setTitle("Java e POO");
        courseJava.setDescription("Aprenda o básico de Orientação a Objetos na linguagem JAVA");
        courseJava.setGradeTime(8);

        Course courseAngular = new Course();
        courseAngular.setTitle("Framework Angular");
        courseAngular.setDescription("Potencialize o uso de HTML, CSS e JS com esse poderoso framework");
        courseAngular.setGradeTime(16);

        System.out.println(courseJava);

        System.out.println(courseAngular);

        Mentorship mentoriaGIT = new Mentorship();
        mentoriaGIT.setTitle("Mentoria de GIT");
        mentoriaGIT.setDescription("Melhorando seus estudos a partir do versionamento de código");
        mentoriaGIT.setDate(LocalDate.now());

        System.out.println(mentoriaGIT);
    }
}
