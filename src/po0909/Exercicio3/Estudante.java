
package po0909.Exercicio3;

public class Estudante{
    String name;
    double nota1;
    double nota2;
    double nota3;
    double med(){ 
        return nota1 + nota2 + nota3;
    }
    public double missingPoints() {
        if (med() < 60.0) {
            return 60.0 - med();
        }
        else {
            return 0.0;
        }
    }
}

