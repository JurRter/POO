<<<<<<< HEAD
package po0909.Exercicio2;

public class Empregado {
    String name;
    double salariobruto;
    double taxa;

    double salarinet(){
        return salariobruto - taxa;
    }

    void aumento(double porc){
        salariobruto += salariobruto*porc/100;
    }
    @SuppressWarnings("override")
    public String toString() {
        return name + ", $ " + String.format("%.2f", salarinet());
    }   
}
=======
package po0909.Exercicio2;

public class Empregado {
    String name;
    double salariobruto;
    double taxa;

    double salarinet(){
        return salariobruto - taxa;
    }

    void aumento(double porc){
        salariobruto += salariobruto*porc/100;
    }
    @SuppressWarnings("override")
    public String toString() {
        return name + ", $ " + String.format("%.2f", salarinet());
    }   
}
>>>>>>> eb2dffb (osheeeee)
