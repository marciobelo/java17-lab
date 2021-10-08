module java17 {

    // compile and runtime dependency
    requires java.base;
    
    // compile time only dependency
    requires static jdk.javadoc;

    // compile and runtime, and consumers also must have
    requires transitive jdk.httpserver;

    // packages inside this module are not exported by default,
    // it has to be done explicitly
    exports br.nom.belo.marcio;

    // só expõe para o pacote indicado
    exports br.nom.belo.marcio.restrito to br.nom.consumer;

    //uses 

    //provides

    //open module
    //opens package
    // opens package to module1, module2, ...;
}