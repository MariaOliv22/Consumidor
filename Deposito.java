public class Deposito {

    private int itens = 0;
    private final int capacidade = 100;

    public int getNumItens() {
        return itens;
    }

    public boolean retirar() {

        if (getNumItens() > 0) {

            itens = getNumItens() - 1;

            System.out.println(
                "Caixa retirada. Estoque: " + itens
            );

            return true;
        }

        System.out.println(
            "Não foi possível retirar. Depósito vazio."
        );

        return false;
    }
    
    public boolean colocar() {
        itens = getNumItens() + 1;

        System.out.println(
            "Caixa produzida. Estoque: " + itens
        );

        return true;
    }
}