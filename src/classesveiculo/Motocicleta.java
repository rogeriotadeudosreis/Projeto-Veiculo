package classesveiculo;

public class Motocicleta extends Automovel {

    private boolean bauAberto = false;

    public Motocicleta() throws Exception {
        this.bauAberto = false;
    }

    public Motocicleta(String fabricante, String modelo, String cor, String tipoVeiculo,
            int velocidade, boolean motorLigado, boolean bauAberto) throws Exception {
        super(fabricante, modelo, cor, tipoVeiculo, velocidade, motorLigado);
        this.bauAberto = false;
    }

    @Override
    public int acelerar(int valor) throws Exception {        

        int acelerar = valor;

        if (acelerar <= 0) {
            throw new Exception("O valor de acelerar não pode ser menor ou igual a 0.");
        } else {

            if (this.bauAberto == false) {

                if (this.motorLigado) {
                    System.out.println(" ----- ACELERANDO A " + this.getTipoVeiculo());
                    this.velocidade += valor;
                    System.out.println("Veículo acelerou --> " + valor + " km/h\n"
                            + "Velocidade atual --> " + this.getVelocidade() + " km/h - if");
                } else {
                    System.out.println("Ligando o motor do " + this.getModelo() + " para poder acelerar.");
                    this.motorLigado = true;
                    System.out.println("O " + this.modelo + " está com o motor ligado.");
                    System.out.println(" ----- ACELERANDO A " + this.getTipoVeiculo());
                    this.velocidade += valor;
                    System.out.println("O " + this.modelo + " acelerou --> " + valor + " km/h\n"
                            + "Velocidade atual --> " + this.getVelocidade() + " km/h");
                }
            } else {
                throw new Exception("O BAÚ TRASEIRO ESTÁ ABERTO, VEÍCULO NÃO PODE SAIR.");
            }
        }
        return acelerar;
    }

    @Override
    public int frear(int valor) throws Exception {
       
        int frear = valor;

        if (this.velocidade <= 0 && valor > this.velocidade) {
            throw new Exception("O valor da frenagem não pode ser maior que a velocidade.");
        }
        System.out.println(" ----- FREANDO A " + this.getTipoVeiculo());
        this.velocidade -= valor;
        System.out.println("Veículo freando  --> " + valor+ " km/h" );
        System.out.println("Velocidade atual --> " + this.getVelocidade()+ " km/h");
        
        if (this.getVelocidade() == 0) {
            this.motorLigado = false;
            System.out.println(" ----- DESLIGANDO O MOTOR DA " + this.getModelo());
        }
        
        return frear;
    }

    @Override
    public String virar(String lado) {
        
        
        String dir = "direita";
        String esq = "esquerda";
        String reto = "alinhar";

        if (this.velocidade <= 50) {
            System.out.println(" ----- CONVERGINDO A " + this.getTipoVeiculo());
            if (lado == dir) {
                System.out.println("Fazer conversão:  -----  À " + dir + " ----- ");
            } else if (lado == esq) {
                System.out.println("Fazer conversão:  -----  À " + esq + " ----- ");
            }else {
                System.out.println("Alinhar o veículo:  ----- " + reto + " ----- ");
            }
        } else {
            System.out.println("Fazer conversão: ----- VELOCIDADE ACIMA DE 50 km, NÃO É POSSIVEL FAZER CONVERSÃO ----- ");

        }

        return null;
        
    }

    public boolean isBau() {
        return bauAberto;
    }

    public void setBau(boolean bau) {
        this.bauAberto = false;
    }

}
