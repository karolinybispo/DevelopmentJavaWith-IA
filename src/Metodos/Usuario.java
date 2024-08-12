package Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv samsung = new SmartTv();


        System.out.println(samsung.ligada);
        System.out.println(samsung.canal);
        System.out.println(samsung.volume);

        // o metodo ligar() nao retorna nd, portanto nao pode ser chaamda diretamente nesse sout System.out.println(samsung.ligar());
        
        samsung.ligar(); // chamei o metodo
        System.out.println(samsung.ligada); // chamei a variavel pois o metodo acima mudou seu valor. O metodo acima nao retorna e nao tem sout, nesses casos, siga como esta nesse exmeplo
    
        samsung.AumentarVolume();
        System.out.println("aumentado volume: " + samsung.volume);
       
        samsung.DiminuirVolume();
        System.out.println("diminuindo volume " + samsung.volume);
    
        samsung.MudarCanal(4);
        System.out.println("Canal atual: " + samsung.canal);

        samsung.DiminuirCanal();
        System.out.println("Diminui: " + samsung.canal);

        samsung.AumentarCanal();
        samsung.AumentarCanal();
        samsung.AumentarCanal();
        samsung.AumentarCanal();
        samsung.AumentarCanal();
        System.out.println(samsung.canal + " Aumentei 5 vezes");
    
    
    
    
    }
}
