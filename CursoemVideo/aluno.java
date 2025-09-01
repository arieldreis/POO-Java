
public class aluno {
    String nome;
    float nota1;
    float nota2;
    public aluno(String nome, float nota1, float nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    static void calcular_media(){
        aluno student = new aluno("ARIEL MARINHO", 1.4f, 7.6f);
        float media = (student.nota1 + student.nota2) / 2;
        System.out.println("NOME: " + student.nome);
        System.out.println("MEDIA DO ALUNO: " + media);
        if(media > 6){
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }
    }
    public static void main(String[] args) {
        System.out.println("RESULTADO DA MINHA CLASSE EM JAVA");
        calcular_media(); // Invocando o metodo calcular_media
    }
}
