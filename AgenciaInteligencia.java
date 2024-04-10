package AgenteSecretoPOO;

public class AgenciaInteligencia {
    private String nome;
    private Pais pais;

    public AgenciaInteligencia() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public String decifrarMensagem(String mensagem, Agente agente) {
        return " ";
    }

    public String cifrarMensagem(String mensagem, AgenciaInteligencia agencia) {

        return "";
    }
}