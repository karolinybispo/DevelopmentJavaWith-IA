public class Operadores {
    public static void main(String[] args) {
        //Operador de atribuicao:
        String nome = "oi";
        int idade = 30;
        double peso = 23.9;
        char sexo = 'M';
        boolean mulher = true;
        MinhaClasse datanacimento = new MinhaClasse(); // nesse caso a classe 'Date' esta sendo um "tipo de dado"
        //esta sendo criado um novo objeto nesse exemplo de atribuicao.



        //Operador Aritmetico: utilizado para operacoes matematicas
        int idadee = 30 + 30;
        double pesoo = 23.9 + 90;
        int idade3 = 30 * 56;
        double peso3 = 23.9 / 0;
        int idade4 = 30 % 5; // informa se o resto da divisao eh fracionario
        double peso4 = (23.9 % 7) - 23;


        //  Exemplos praticos:
        String name = "OI" + "CARA"; // O '+' em contexto de texto se torna um concatenador, ou seja, juntas as palavras
        System.out.println(name);

        String concatenacao = "1"; //1
        System.out.println(concatenacao);

        concatenacao = 1+ 1+ 1+ 1+ "1";  //41 (aqui primeiro ele viu os numeros e usou o '+'como operador, ao ver a letra, apenas concatenou)
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1; // 111 (1, letra) os outros dois uns sao os numeros concatenados
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1); // 12: na ordem, o () vem primeiro, soma e dps viu que é uma letra, concatenou
        System.out.println(concatenacao);

        //OU SEJA, se ele ver primeiro a LETRA e dps os numeros com o simbolo de '+'tudo sera concatenado
        //Se ver primeiro os numeros, será somado e ao ver a letra com '+', acontece a concatenacao.



        //Operadores UNARIOS:
        int number = 5; // aqui o valor esta positivo.
        System.out.println( - number); // aqui o valor vai ser tornar negativo, APENAS nesse momento, pois manipulei.
        System.out.println(number); // mostrando que 5 nao mudou para negativo permanentemente. 

        number = - number; // number vai receber ele mesmo negativo. Aqui ele vai se tornar negativo permanente.
        System.out.println(number);

        //number = + number; Quero tornar '5' positivo novamente, porem dessa forma nao funciona uma vez que '+' eh um operador aritmetico para somar.
        number = number * -1; // nesse caso sera possivel, pois esta sendo multiplado por 1 e este esta negativo, (- com - = +).
        System.out.println(number);
    }
}
