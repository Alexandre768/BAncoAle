public class Banco {
    String nome;
    int IdBanco;
    int Numero;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdBanco() {
        return IdBanco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdBanco(int idBanco) {
        IdBanco = idBanco;
    }
}
