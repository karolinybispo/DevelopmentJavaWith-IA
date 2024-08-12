package Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 34;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void AumentarVolume(){
        volume = volume + 1;
    }

    public void DiminuirVolume(){
        volume--;
    }

    public void MudarCanal(int newChanel){ // newChannel so fica visivel para esse metodo
        canal = newChanel;

    }

    public void DiminuirCanal(){
        canal--;
    }
    public void AumentarCanal(){
        canal++;
    }
    
}
