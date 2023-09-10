public class SmartTv {
    
    Boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligada = true;
    }

    public void deligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void baixarVolume(){
        volume--;
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
