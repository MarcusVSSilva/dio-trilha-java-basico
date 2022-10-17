public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //método para ligar a smartTv 
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}