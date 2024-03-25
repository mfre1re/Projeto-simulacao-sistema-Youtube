public class ProjetoYoutube {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO em PHP");
        v[2] = new Video("Aula 03 de POO em Java");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Jubileu", 22, "Masculino", "juba");
        a[1] = new Aluno("Creuza", 12, "Feminino", "creuzita");

        Visualizacao visualizacao[] = new Visualizacao[5];
        visualizacao[0] = new Visualizacao(a[0], v[0]); //Jubileu + POO
        visualizacao[1] = new Visualizacao(a[0], v[1]); //Jubileu + POO em PHP
        visualizacao[1].avaliar(100.0f);

        visualizacao[2] = new Visualizacao(a[1], v[0]); //Creuza + POO
        visualizacao[3] = new Visualizacao(a[1], v[1]); //Creuza + POO + PHP

        System.out.println(visualizacao[1].toString());
        //System.out.println(visualizacao[2].toString());
        //System.out.println(visualizacao[3].toString());

//        System.out.println(v[0].toString());
//        System.out.println(a[0].toString());
    }
}
