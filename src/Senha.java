public class Senha {
 private static int senhaAtual;
 private int minhaSenha;

public Senha() {
    this.minhaSenha = senhaAtual;
    senhaAtual++;
}

public int getSenhaAtual() {
    return senhaAtual;
}
public int getMinhaSenha() {
    return minhaSenha;  
}

}
