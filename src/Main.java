import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();//instanciando o objeto
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();//instanciando o objeto
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

//        Conteudo conteudo = new Curso();// É exemplo do conceito de polimorfismo, pois instanciamos 'Curso' a partir de 'Conteudo'

        Mentoria mentoria = new Mentoria();// instanciando a mentoria.
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        /* Criando o bootcamp */
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        /* Criando os Devs */
        Dev devRamon = new Dev();
        devRamon.setNome("Ramon");
        devRamon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ramon: " + devRamon.getConteudosInscritos());
        devRamon.progredir();
        devRamon.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Ramon: " + devRamon.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ramon: " + devRamon.getConteudosConcluidos());
        System.out.println("XP: " + devRamon.calcularXP());

        System.out.println("-------------------------------");

        Dev devBarbara = new Dev();
        devBarbara.setNome("Bárbara");
        devBarbara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bárbara:  " + devBarbara.getConteudosInscritos());
        devBarbara.progredir();
        devBarbara.progredir();
        devBarbara.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Bárbara:  " + devBarbara.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bárbara:  " + devBarbara.getConteudosConcluidos());
        System.out.println("XP: " + devBarbara.calcularXP());

    }
}
