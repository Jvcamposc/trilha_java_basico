package Aula04_Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        //volume da tv
        smartTv.diminuirVolume();//volume:24
        smartTv.diminuirVolume();//volume:23
        smartTv.diminuirVolume();//volume:22
        smartTv.aumentarVolume();//volume:23
        System.out.println("------Dados da TV---");
        System.out.println("Canal Atual? : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual? : " + smartTv.canal);

        System.out.println("Volume Atual? : " + smartTv.volume);


        // interface da smart tv
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? : " + smartTv.canal);
        System.out.println("Volume Atual? : " + smartTv.volume);
        // ligar tv
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada?" + smartTv.ligada);
        // desligar tv
        smartTv.desligar();
        System.out.println("Novo Status -> TV desligada?" + smartTv.ligada);
    }

}
