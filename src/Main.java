import domain.*;

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

        Mentorship mentoriaGIT = new Mentorship();
        mentoriaGIT.setTitle("Mentoria de GIT");
        mentoriaGIT.setDescription("Melhorando seus estudos a partir do versionamento de código");
        mentoriaGIT.setDate(LocalDate.now());

        System.out.println("Lista de Conteúdos");
        System.out.println(courseJava);
        System.out.println(courseAngular);
        System.out.println(mentoriaGIT);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp para estudantes de Java");
        bootcamp.getContents().add(courseJava);
        bootcamp.getContents().add(mentoriaGIT);
        bootcamp.getContents().add(courseAngular);

        Student student = new Student();
        student.setName("Jack");

        System.out.println("\n-- " + student.getName() + " start XP: " + student.xpCalculate() + " --\n");
        System.out.println("-- Conteúdos inscritos antes do bootcamp --");
        System.out.println(student.getSubscribedContents());

        student.bootcampSignUp(bootcamp);

        System.out.println("\n-- Conteúdos inscritos depois do bootcamp --");

        for(Content c: student.getSubscribedContents()){
            System.out.println(c);
        }

        System.out.println("\n-- Conteúdos concluídos antes de progredir --");
        System.out.println(student.getDoneContents());

        student.leveling();

        System.out.println("\n-- Conteúdos inscritos depois do progredir --");
        for(Content c: student.getSubscribedContents()){
            System.out.println(c);
        }

        System.out.println("\n-- Conteúdos concluídos depois de progredir --");
        for(Content c: student.getDoneContents()){
            System.out.println(c);
        }

        System.out.println("\n-- " + student.getName() + " final XP: " + student.xpCalculate() + "--");
    }
}
