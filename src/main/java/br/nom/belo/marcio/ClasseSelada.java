package br.nom.belo.marcio;

public abstract sealed class ClasseSelada permits Subclasse1, Subclasse2 {

}

final class Subclasse1 extends ClasseSelada {

}

final class Subclasse2 extends ClasseSelada {
    
}