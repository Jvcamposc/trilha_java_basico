package Desafio_Iphone;

// Classe principal para testar as funcionalidades
public class main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Despacito");
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123-456-789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }

    @Override
    public String toString() {
        return "main []";
    }
}
