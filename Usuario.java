public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); smartTv = SmartTv@10
        smartTv.diminuirVolume(); smartTv = SmartTv@10
        smartTv.diminuirVolume(); smartTv = SmartTv@10
        smartTv.aumentarVolume();; smartTv = SmartTv@10
        System.out.println("Volume Atual : " +smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.pritln("Canal Atual : " + smartTv.canal);
    
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.pritln("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

}
}