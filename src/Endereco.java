public class Endereco {
    private int Codigo;
    private String Logradouro;
    private String Bairro;
    private String Numero;
    private String Cep;
    private String Cidade;
    private String Estado;
    private String Uf;

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getNumero() {
        return Numero;
    }

    public String getCep() {
        return Cep;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getUf() {
        return Uf;
    }
}
