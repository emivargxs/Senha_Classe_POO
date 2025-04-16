import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de senha que vao ser geradas");
        int tamanho = entrada.nextInt();


        Senha [] senhas = new Senha [tamanho];

    //Instanciando os objetos do vetor
    for(int i = 0; i < tamanho; i++){
        senhas[i] = new Senha();
    }

    //imprimindo os valores da minha senha de cada objeto
    System.out.println("\nSenhas geradas");

    for(int i = 0; i < tamanho; i++){
        System.out.println("Senha" + (i+1) + ":" + senhas[i].getMinhaSenha());
    }
    entrada.close();}
}