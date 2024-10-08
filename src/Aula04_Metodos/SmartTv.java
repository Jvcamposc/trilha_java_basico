/*Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

1.Ela tenha as características: ligada (boolean), canal (int) e volume (int);

2.Nossa  e assim mudar o estado ligada;

3.Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

4.Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente. */
package Aula04_Metodos;

public class SmartTv {
    // 1. ligada (boolean), canal (int) e volume (int)
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // 2. TV poderá ligar e desligar
    public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }

    // 3.TV aumentará e diminuirá o volume sempre em +1 ou -1

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // 4.Mudar de canal de 1 em 1 ou definindo o número correspondente.
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}