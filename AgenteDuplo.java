public class AgenteDuplo {
    private AgenciaInteligencia agenciaInfiltrada;
    private AgenciaInteligencia agenciaVerdadeira;
    private String informacoes;
    private String informacoesTopSecret;

    public AgenteDuplo(AgenciaInteligencia agenciaInfiltrada, AgenciaInteligencia agenciaVerdadeira) {
        this.agenciaInfiltrada = agenciaInfiltrada;
        this.agenciaVerdadeira = agenciaVerdadeira;
        this.informacoes = "";
        this.informacoesTopSecret = "";
    }

    public String getPaisVerdadeiro() {
        return agenciaVerdadeira != null ? agenciaVerdadeira.getPais() : null;
    }

    public String getInformacoes(Agente agente) {
        if (agente.getAgenciaInteligencia() == agenciaInfiltrada) {
            if (agente.getAgenciaInteligencia() == agenciaVerdadeira) {
                return informacoesTopSecret;
            } else {
                return informacoes;
            }
        }
        return "";
    }

    public void receberMensagem(Mensagem mensagem) {
        if (mensagem.getAgenciaInteligencia() == agenciaInfiltrada) {
            mensagem = agenciaInfiltrada.decifrarMensagem(mensagem, new Agente(agenciaInfiltrada));
            if (mensagem.getNivelSeguranca() == NivelSeguranca.TOPSECRET) {
                informacoesTopSecret += mensagem.getTexto();
            } else {
                informacoes = mensagem.getTexto();
            }
        }
    }
}
