public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(5);

        System.out.println("TV está ligado? : " + smartTv.ligada);
        System.out.println("Qual o canal? : " + smartTv.canal);
        System.out.println("Qual o volume? : " + smartTv.volume);
    }
}
