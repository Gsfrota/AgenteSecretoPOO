public class Agente {
    private NivelHierarquico nivelHierarquico;
    private Pais pais;
    private String informacoes;
    private String pseudonimo;
    private AgenciaInteligencia agenciaInteligencia;

    public Agente(AgenciaInteligencia agenciaInteligencia) {
        this.agenciaInteligencia = agenciaInteligencia;
    }

    // Getters e Setters
    public AgenciaInteligencia getAgenciaInteligencia() { 
        return agenciaInteligencia; 
    }
    public void setAgenciaInteligencia(AgenciaInteligencia agenciaInteligencia) { 
        this.agenciaInteligencia = agenciaInteligencia; 
    }

    public NivelHierarquico getNivelHierarquico() {
        return nivelHierarquico; 
    }
    public void setNivelHierarquico(AgenciaInteligencia agenciaInteligencia, NivelHierarquico nivelHierarquico) {
        if (this.agenciaInteligencia == agenciaInteligencia) {
            this.nivelHierarquico = nivelHierarquico;
        }
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
        if (agenciaInteligencia != null && agenciaInteligencia == mensagem.getAgenciaInteligencia()) {
            mensagem = agenciaInteligencia.cifrarMensagem(mensagem, this);
        } else {
            mensagem.setTexto("");
   
        }
    }

    public void receberMensagem(Mensagem mensagem) { 
        if (agenciaInteligencia != null && agenciaInteligencia == mensagem.getAgenciaInteligencia()) {
            mensagem = agenciaInteligencia.decifrarMensagem(mensagem, this);
           
        } else {
            mensagem.setTexto("");
            
        }
    }
}
