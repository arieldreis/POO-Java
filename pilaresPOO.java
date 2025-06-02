public class pilaresPOO {
    public static void main(String[] args) {
        Animal a1 = new Gato();
        Animal a2 = new Vaca();
        a1.fazerSom(); // Miau
        a2.fazerSom(); // Muuu
    }
}

// Abstração + Polimorfismo
abstract class Animal {
    abstract void fazerSom();
}

// Herança
class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}

class Vaca extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Muuu");
    }
}

// Encapsulamento
class ContaBancaria {
    private double saldo = 0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
