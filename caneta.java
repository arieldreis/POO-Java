public class caneta {
    String cor;
    float ponta;
    boolean tampada;
    public caneta(String cor, float ponta, boolean tampada){
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! NÃO POSSO RABISCAR.");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
   void destampar(){
        this.tampada = false;
   }
    public static void main(String[] args) {
        // programação de naturalidade
        caneta mypen = new caneta("Azul", 0.5f, true);
        System.out.println("A cor da sua caneta é " + mypen.cor);
        System.out.println("A metragem da ponta de sua caneta é de " + mypen.ponta + "cm");
        System.out.println("A sua caneta está tampada: " + mypen.tampada);
        mypen.rabiscar();
    }
}
