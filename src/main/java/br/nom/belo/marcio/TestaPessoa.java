package br.nom.belo.marcio;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 11);
        Pessoa p2 = new Pessoa("Ana", 11);
        System.out.println( p1.nome());
        System.out.println( p1.idade());

        System.out.println( p1.toString());

        System.out.println( p1.hashCode() == p2.hashCode());

        System.out.println( p1.equals( p2));
        System.out.println( "Text block = " + """
        Linha 1
        Linha 2
        """)        ;

    }
}