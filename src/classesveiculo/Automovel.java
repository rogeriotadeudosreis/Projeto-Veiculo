package classesveiculo;

public class Automovel extends Veiculo {

    protected boolean motorLigado = false;

    public Automovel()throws Exception {
    }

    public Automovel(String fabricante, String modelo, String cor, String tipoVeiculo, int velocidade,
            boolean motorLigado) throws Exception {
        super(fabricante, modelo, cor, tipoVeiculo, velocidade);
        this.motorLigado = false;
    }

    @Override
    public int acelerar(int valor) throws Exception {        
        
        int acelerar = valor;

        if (acelerar <= 0) {
            throw new Exception("O valor de acelerar não pode ser menor ou igual a 0.");
        }

        if (this.motorLigado) {
            System.out.println(" ----- ACELERANDO O " + this.getTipoVeiculo());
            this.velocidade += valor;
            System.out.println("O " + this.modelo + " acelerou    --> " + valor + " km/h\n"
                    + "Velocidade atual           --> " + this.getVelocidade() + " km/h - if");
        } else {
            System.out.println("Ligando o motor do " + this.getModelo() + " para poder acelerar.");
            this.motorLigado = true;
            System.out.println("O " + this.modelo + " está com o motor ligado.");
            System.out.println(" ----- ACELERANDO O " + this.getTipoVeiculo());
            this.velocidade += valor;
            System.out.println("O " + this.modelo + " acelerou    --> " + valor + " km/h\n"
                    + "Velocidade atual           --> " + this.getVelocidade() + " km/h");
        }
        return acelerar;
    }

    @Override
    public int frear(int valor) throws Exception {        
        
        int frear = valor;

        if (this.velocidade < 0 && frear > this.velocidade) {
            throw new Exception("O valor da frenagem não pode ser maior que na velocidade.");
        }
        
            System.out.println(" ----- FREANDO O " + this.getTipoVeiculo());
            velocidade -= valor;
            System.out.println("O " + this.modelo + " frenou      --> " + valor + " km/h\n"
                    + "Velocidade atual           --> " + this.getVelocidade() + " km/h - if");
            if (this.velocidade == 0) {
                this.motorLigado = false;
                System.out.println("Desligando o motor " + this.modelo);
            }
       
        return frear;
    }

    @Override
    public String virar(String lado) {       
        
        String dir = "direita";
        String esq = "esquerda";
        String reto = "alinhar";

        if (this.velocidade > 0 && this.velocidade <= 50) {
             System.out.println(" ----- CONVERGINDO O " + this.getTipoVeiculo());
            if (lado.equals(dir)) {
                System.out.println("Fazer conversão:  -----  À " + dir + " ----- ");
            } else if (lado.equals(esq)) {
                System.out.println("Fazer conversão:  -----  À " + esq + " ----- ");
            }else {
                System.out.println("Alinhar o veículo:  ----- " + reto + " ----- ");
            }
        } else {
            System.out.println("Fazer conversão: ----- VELOCIDADE ACIMA DE 50 km, NÃO É POSSIVEL FAZER CONVERSÃO ----- ");

        }

        return null;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = false;
    }  

}
