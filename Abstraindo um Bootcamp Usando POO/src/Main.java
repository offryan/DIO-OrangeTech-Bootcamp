import dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer 2023");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devLuana = new Dev();
        devLuana.setNome("Luana");
        devLuana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Luana:" + devLuana.getConteudosInscritos());
        devLuana.progredir();
        devLuana.progredir();
        System.out.println("Progress");
        System.out.println("Conteudos Inscritos de Luana:" + devLuana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Luana:" + devLuana.getConteudosConcluidos());
        System.out.println("XP: " + devLuana.calcularTotalXp());
        System.out.println("---------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Progress");
        System.out.println("Conteudos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
    }
}
