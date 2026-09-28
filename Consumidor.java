public class Consumidor extends Thread {

    private Deposito deposito;
    private int tempo;

    public Consumidor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {

        int consumidas = 0;

        while (consumidas < 20) {

            if (deposito.retirar()) {

                consumidas++;

                System.out.println(
                    "Consumidor retirou uma caixa. " +
                    "Total consumido: " + consumidas
                );

                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {

                System.out.println(
                    "Depósito vazio. Consumidor aguardando 200 ms..."
                );

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Consumidor terminou.");
    }
}