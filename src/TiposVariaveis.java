

public class TiposVariaveis {
    
    public static void main(String[] args) {

        // TIPOS DE DADOS PRIMITIVOS:
        byte age = 123;
        short years = 2021; 
        int cep = 230944; // se comecar com 0, talvez que tenha que ser outro
        long cpf = 9034323L; // se comecar com 0, talvez que tenha que ser outro. O L sgnifica long, java precisa ver isso.
        Float pi = 3.14f;
        Double salario = 5900.30;
        // variavel constante devido ao final, por convencao, variavel constante eh escrita em caixa alta.
        final int CONSTANTE = 78;

        // Verificando se uma variavel recebe um valor de uma variavel com tipo diferente (Conclusao: pode receber porem ela deve conseguir expor toda a finidade da outra variavel. Ex: int pode mostrar ate 100 numeros, short, 1 numero, logo int consegue receber uma variavel do tipo short. No entanto, se fosse maior a quantidade de short, seria necessario fazer uma "conversao explicita")
        long numero2 = years;
        float numero3 = numero2;
        double numero4 = numero3;
        int numero =(int) cpf; // nesse caso nao eh possivel, sendo assim deve ser fesito uma "conversao explicita", pois a variavel de destino (numero - int) nao consegue armazenar todos os numeros de origem (cpf - long)

        //Incremento
       
        int num = 5;
        num = num + 5;
        System.out.println(num);
        
        int number = 6;
        number = number + number;
        System.out.println(number);

        int oi = 1;
        oi++; // mesmo que: oi = oi + 1;
        System.out.println(oi);

        int voce = 10;
        System.out.println(voce ++); // sgnfica que pegou o valor e esta pronto para mostrar o novo valor em outro sout.
        System.out.println(voce); // aqui a variavel recebeu a incrementacao, sem essa linha "voce" ainda continuaria como 10.

        int nos = 19;
        System.out.println(++ nos); // aqui priemeiro pega o valor, incrementa e depois imprimi 

        //Negando boolean:
        boolean vc = true;
        System.out.println(vc);
        System.out.println(!vc); // agora eh false, mas apenas em memoria, 'vc' so tera VALOR false, quando eu atribuir false.

        //Atribuindo UM NOVO valor para um boolean que ja tem valor:
        vc = !vc;
        System.out.println(vc);
        System.out.println(vc);


        // Operador Ternario
        int a = 4;
        int b = 5;
        String resul = a == b ? "true" : "false"; // aqui eu escri algo no operador ternario pois 'resul' is STRING
        System.out.println( "operador ternario " + resul);
    }
}
