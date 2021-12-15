import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Js");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.of(2020,12,30));

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição do bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Lucas");
        dev1.increverBootcamp(bootcamp);
        System.out.println(dev1.getNome());
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("==");
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        System.out.println("===========================");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.increverBootcamp(bootcamp);
        System.out.println(dev2.getNome());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("==");
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
