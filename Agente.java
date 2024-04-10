
public class Agente {

    private String nome;
    private String sigla;
    private String prefixoArea;
    private Enum.NivelHierarquico nivelHierarquico;
    private Pais pais;
    private String informacoes;
    private String pseudonimo;

    public Agente() {}

    public Agente(String nome, String sigla, String prefixoArea, Enum.NivelHierarquico nivelHierarquico, Pais pais) {
        this.nome = nome;
        this.sigla = sigla;
        this.prefixoArea = prefixoArea;
        this.nivelHierarquico = nivelHierarquico;
        this.pais = pais;
    }

    // Getters e Setters
    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    public String getSigla() {
        return sigla; 
    }
    public void setSigla(String sigla) { 
        this.sigla = sigla; 
    }
    public String getPrefixoArea() { 
        return prefixoArea; 
    }
    public void setPrefixoArea(String prefixoArea) { 
        this.prefixoArea = prefixoArea;
    }
    public Enum.NivelHierarquico getNivelHierarquico() {
        return nivelHierarquico; 
    }
    public void setNivelHierarquico(Enum.NivelHierarquico nivelHierarquico) { 
        this.nivelHierarquico = nivelHierarquico; 
    }
    public Pais getPais() { 
        return pais; 
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getInformacoes() { 
        return informacoes; 
    }
    public void setInformacoes(String informacoes) { 
        this.informacoes = informacoes; 
    }
    public String getPseudonimo() {
        return pseudonimo; 
    }
    public void setPseudonimo(String pseudonimo) { 
        this.pseudonimo = pseudonimo;
    }

    
    public void enviarMensagem(Mensagem mensagem) { 
       // postMensagem();
    }
    public void receberMensagem(Mensagem mensagem) { 
        //getMmensagem();    
    }

}
