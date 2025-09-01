public class canetaV_2 {
    /*
        O atributo público qualquer classe pode acessar esse atributo ou metodo.
        ➡️ Pode acessar de fora da classe, de outra classe, de qualquer lugar.

        O atributo privado só pode ser desenvolvido dentro da classe.
        ➡️ Ninguém fora da classe consegue acessar esse atributo diretamente.
        Precisa usar métodos públicos pra ler ou mudar, tipo os famosos getters e setters.

        Só a própria classe, as subclasses (herança), ou classes do mesmo pacote conseguem acessar.
        ➡️ Um meio-termo entre private e public.
    */
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Modelo da Caneta: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! NÃO POSSO RABISCAR.");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    public static void main(String[] args) {
        canetaV_2 caneta = new canetaV_2();
        caneta.modelo = "Bic Cristal";
        caneta.cor = "Preta";
        // caneta.ponta = 0.5f;
        caneta.carga = 80;
        caneta.tampada = false;
        caneta.status();
        caneta.rabiscar();
    }
}
