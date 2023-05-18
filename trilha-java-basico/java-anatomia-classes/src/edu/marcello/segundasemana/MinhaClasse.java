package edu.marcello.segundasemana;
public class MinhaClasse {
    
public static void main(String[] args) {
     // Aula 1 Anatomia das classes
    System.out.println("Hello World");
     
    String primeiroNome = "Marcello";
    String segundoNome = "Medeiros";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}
    /* Aula 2 Anatomia das classes
    int ano = 1998;
    ano = 2023;

    final String BR = "Brasil";
    //BR = "Brazil";

    int numeroum = 1;
    */
 
    /*  Aula 3 Anatomia das classes (Declarando Variáveis e métodos)
    // texto
    String meuNome = "Marcello";
    // inteiro
    int anofabricacao = 1998;
    // Valores logicos
    boolean verdadeira = true;

    boolean falsa = false;

    anofabricacao = 2023;
    
*/

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    } 

}
