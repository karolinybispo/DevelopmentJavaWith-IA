
public class MinhaClasse {
    public static void main(String [] args){
        System.out.println("oi");

        // Variaves constantes
        String BR = "BRASIL";
        final String SC = "Santa Catarina";
        final int NUMERO_FINAL = 34; // this value doesn't change.

        //Declarando variavel
        float numFracionado = 3390;
        boolean logico; //ele ainda nao recebeu valor.


        //valores que serao usados no metodo nomeCompleto:
        String nome = "ju";
        String lastName = "be";
        String nomeCompleto = nomeCompleto(nome, lastName); //sabe-se que nomeCompleto apos o "=" eh metodo, pois ha () ou parametros.
       
        //imprimindo valor do metodo nomeCompleto:
        System.out.println("impressao do metodo " + nomeCompleto);


        
    }


    //Declarando metodo (nao pode haver metodo dentro de outro metodo):
    public static String nomeCompleto (String nome, String lastName){
        return nome.concat(" ").concat(lastName);
    }
}
