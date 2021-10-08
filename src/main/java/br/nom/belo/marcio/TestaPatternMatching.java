package br.nom.belo.marcio;

public class TestaPatternMatching {

    public boolean equals(Object that) {

        if( that instanceof TestaPatternMatching that2) {

            return true;
        }

        /* preview feature 
        switch( that) {
           case null -> System.out.println("null");
           case String s -> System.out.println("String");
           case int[] ia -> System.out.println("Array length" + ia.length);
           default -> System.out.println("Something else");
        }
        */
        return false;
    }
    
}