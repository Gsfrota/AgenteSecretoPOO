public class Pais {

    private String nome;
    private String sigla;
    private String prefixoArea;
  
    public Pais(String nome, String sigla, String prefixoArea) {
      this.nome = nome;
      this.sigla = sigla;
      this.prefixoArea = prefixoArea;
    }
  
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
    
    public String toString() {
      return "País: " + nome + ", Sigla: " + sigla + ", Prefixo de Área: " + prefixoArea;
    }
  }