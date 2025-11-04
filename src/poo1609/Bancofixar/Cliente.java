package poo1609.Bancofixar;

public class Cliente {
    double id;
    String nome;
    double din;

    double deposito(double quant){
        return din += quant;
    }
    double saque(double quant){
        return din -= quant + 5;
    }
}