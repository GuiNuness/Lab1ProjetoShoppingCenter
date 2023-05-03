public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private int cep;
    private int numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, int cep, int numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getNomeDaRua(){
        return nomeDaRua;
    }

    public void setNomeDaRua(){
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(){
        this.cidade = cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(){
        this.estado = estado;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(){
        this.pais = pais;
    }

    public int getCep(){
        return cep;
    }

    public void setCep(){
        this.cep = cep;
    }
    
    public int getNumero(){
        return numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(){
        this.complemento = complemento;
    }

    public String toString(){
        return "Endereco: " + nomeDaRua + 
        ", " + numero +
        ", " + cidade + 
        ", " + estado +
        ", " + pais +
        ", CEP: " + cep +
        " - Complemento: " + complemento;
    }
}

