public class Cliente {
    public int id;
    public String nome;
    public double din;

    public void deposito(double quantia) {
        din += quantia;
    }

    public void saque(double quantia) {
        din -= quantia + 5.0;
    }
}
