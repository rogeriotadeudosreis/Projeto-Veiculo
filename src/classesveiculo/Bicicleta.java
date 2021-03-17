package classesveiculo;

public class Bicicleta extends Veiculo {

    private boolean gps = false;

    public Bicicleta() {
    }

    public Bicicleta(String fabricante, String modelo, String cor, String tipoVeiculo,
            int velocidade, boolean gps) throws Exception {
        super(fabricante, modelo, cor, tipoVeiculo, velocidade);
        this.gps = false;
    }

    @Override
    public int acelerar(int valor) throws Exception {
        int pedalar = valor;

        if (pedalar <= 0){
            throw new Exception("O valor da aceleração não pode ser menor ou igual a 0.");
        }
        if (this.gps == false) {

            System.out.println("------------ LIGANDO O GPS ------------ ");
            this.gps = true;
            System.out.println("-------- ACELERANDO A " + this.getTipoVeiculo() + "--------");
           if (this.velocidade >= 0) this.velocidade += pedalar;
            System.out.println(this.getTipoVeiculo() +   " acelerou    --> " + pedalar+ " km/h");
            System.out.println("Velocidade atual      --> " + this.getVelocidade()+ " km/h");

        } else {
            System.out.println("-------- ACELERANDO A " + this.getTipoVeiculo() + "--------");
            if (this.velocidade >= 0) this.velocidade += pedalar;
            System.out.println(this.getTipoVeiculo() +   " acelerou    --> " + pedalar+ " km/h");
            System.out.println("Velocidade atual      --> " + this.getVelocidade()+ " km/h");
        }

        return pedalar;
    }

    @Override
    public int frear(int valor) throws Exception{
        int frear = valor;
        
        if(this.velocidade > 0 && frear <= this.velocidade){
            System.out.println(" ----- FREANDO A " + this.getTipoVeiculo());
            this.velocidade -= frear;
            System.out.println(this.getTipoVeiculo() + " freou       --> " + frear + " km/h");
            System.out.println("Velocidade atual      --> " + this.getVelocidade()+ " km/h");
        }else {
            throw new Exception("Velocidade da bike não pode ser menor ou igual a 0 "
                    + "e o valor da frenagem não pode ser maior que a velocidade.");
        } 
        if (this.velocidade == 0){
            System.out.println("DESLIGANDO O GPS");
            this.gps = false;
            System.out.println("ESTACIONANDO A " + this.getTipoVeiculo());
        }
        
        return frear;
    }

    @Override
    public String virar(String lado)throws Exception {
        String dir = "direita";
        String esq = "esquerda";
        String reto = "alinhar";
        
        if (this.velocidade > 0 && this.velocidade <=50){
             if (lado == dir) {
                System.out.println("Fazer conversão:  -----  À " + dir + " ----- ");
            } else if (lado == esq) {
                System.out.println("Fazer conversão:  -----  À " + esq + " ----- ");
            }else {
                System.out.println("Alinhar o veículo:  ----- " + reto + " ----- ");
            }
        }else {
            throw new Exception("Para convergir, a velocidade deve ser maior que 0 e menor que 51 km/h");
        }       
        
        return null;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = false;
    }

}
