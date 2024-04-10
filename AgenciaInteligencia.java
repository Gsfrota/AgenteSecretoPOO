package AgenteSecretoPOO;

public class AgenciaInteligencia{
    private String nome;
    private String chave;
    private String alfabeto;
    private String pais;

    AgenciaInteligencia(String nome, String chave, String alfabeto){
        this.nome = nome;
        this.chave = chave;
        this.alfabeto = alfabeto;
        this.pais = pais;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setChave(String chave){
        this.chave = chave;
    }
    public String getChave(){
        return chave;
    }

    public void setAlfabeto(String alfabeto){
        this.alfabeto = alfabeto;
    }
    public String getAlfabeto(){
        return alfabeto;
    }

    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return pais;
    }

    public String decifrarMensagem(String mensagem, Agente agente) {
        return " ";
    }
       
        public String cifrarMensagem(String mensagem, AgenciaInteligencia agencia) {
          
            return ""; 
        }
}