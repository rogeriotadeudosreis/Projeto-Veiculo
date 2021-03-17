package classesveiculo;

public abstract class Veiculo implements IVeiculo{
    
    protected String fabricante ;
    protected String modelo ;
    protected String cor ;   
    protected String tipoVeiculo ;
    protected int velocidade;

    public Veiculo() {
    }

    public Veiculo(String fabricante, String modelo, String cor, String tipoVeiculo, int velocidade)throws Exception {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoVeiculo = tipoVeiculo;
        this.velocidade = 0;
        if (this.velocidade < 0) {
            throw new Exception("Velocidade não pode ser menor que 0.");
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade)throws Exception {
        this.velocidade = velocidade;
        if (this.velocidade < 0) {
            throw new Exception("Velocidade não pode ser menor que 0.");
        }
    }
    
    
    
    
    
    
    
    
}
