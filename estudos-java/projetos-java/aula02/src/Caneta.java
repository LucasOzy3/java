
package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.print("Uma caneta" + this.cor);
        System.out.print("Modelo: " + this.modelo);
        System.out.print("está tampada? " + this.tampada);
        System.out.print("Ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga);
        //System.out.printIn("está tampada?" + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.printIn("ERRO! Não posso rabiscar.");
            else {
                System.out.printIn("Estou rabiscando...");
            }
        }
    }

    void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada.");
    }

    void destampar() {
        this.tampada = false;
        System.out.println("Caneta destampada.");
    }
}