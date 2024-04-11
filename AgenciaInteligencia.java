
public class AgenciaInteligencia{
    private String nome;
    private String chave;
    private String pais;

    public AgenciaInteligencia(){}

    AgenciaInteligencia(String nome, String chave){
        this.nome = nome;
        this.chave = chave;
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


    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return pais;
    }

    public void setChave(String chave, Agente agente) {
        if (agente.getNivelHierarquico() == NivelHierarquico.COMANDO &&
            agente.getPais().equals(this.pais) &&
            chave.length() == 26) {
            this.chave = chave;
        }
    }

    public Mensagem cifrarMensagem(Mensagem mensagem, Agente agente) {
        if (agente.getAgenciaInteligencia() == this) {
            mensagem.setTexto(criptografar(mensagem.getTexto(), chave));
        } else {
            mensagem.setTexto("");
        }
        return mensagem;
    }

    public Mensagem decifrarMensagem(Mensagem mensagem, Agente agente) {
        if (agente.getAgenciaInteligencia() == this) {
            mensagem.setTexto(descriptografar(mensagem.getTexto(), chave));
        } else {
            mensagem.setTexto("");
        }
        return mensagem;
    }

    private String criptografar(String texto, String chave) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isUpperCase(c)) {
                int posicaoOriginal = c - 'A';
                int posicaoCifrada = (posicaoOriginal + chave.length()) % 26;
                char letraCifrada = (char) (posicaoCifrada + 'A');
                sb.append(letraCifrada);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String descriptografar(String texto, String chave) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isUpperCase(c)) {
                int posicaoCifrada = c - 'A';
                int posicaoOriginal = (posicaoCifrada - chave.length() + 26) % 26;
                char letraOriginal = (char) (posicaoOriginal + 'A');
                sb.append(letraOriginal);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}