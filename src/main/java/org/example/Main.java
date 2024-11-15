package org.example;

import org.example.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(200);
        curso1.setDescricao("Engenharia de software");
        curso1.setTitulo("TI");

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setTitulo("Esse ano da certo");

       // System.out.println(mentoria1);

        //Conteudo conteudo1 = new Mentoria();
       // conteudo1.calcularXp();
        //System.out.println(conteudo1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Formação Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devWilly = new Dev();
        devWilly.setNome("willy");
        devWilly.inscreveBootcamp(bootcamp);
        System.out.println(devWilly.getConteudosInscritos());
        devWilly.progredir();
        System.out.println(devWilly.getConteudosInscritos());
        System.out.println(devWilly.getConteudosConcluidos());
        System.out.println(devWilly.calcularTotalXp());

        System.out.println("----------------");


        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreveBootcamp(bootcamp);
        System.out.println(devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println(devMarcos.getConteudosInscritos());
        System.out.println(devMarcos.getConteudosConcluidos());
        System.out.println(devMarcos.calcularTotalXp());
    }
}