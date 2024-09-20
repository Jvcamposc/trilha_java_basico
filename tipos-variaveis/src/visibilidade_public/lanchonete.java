package visibilidade_public;

public class lanchonete{
    public void adicionarLancheNoBalcao(){
            System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
        }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
}
