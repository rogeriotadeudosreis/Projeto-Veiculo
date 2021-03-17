package classesveiculo;

import classesveiculo.Veiculo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StartVeiculo {

    public static void imprimirStatusVeiculo(Veiculo objeto) {
        System.out.println("---------- Status do Veículo ----------" + "\n");
        System.out.println("Fabricante:       " + objeto.getFabricante());
        System.out.println("Modelo:           " + objeto.getModelo());
        System.out.println("Cor:              " + objeto.getCor());
        System.out.println("Tipo de veículo:  " + objeto.getTipoVeiculo());
        System.out.println("Velocidade atual: " + objeto.getVelocidade() + " km/h");
        System.out.println("---------------------------------------");

    }

    public static void main(String[] args) {

        try {
            Automovel auto = new Automovel("HYUNDAI", "SANTA FÉ 2.7", "PRETA", "AUTOMOVEL", 0, false);
            Motocicleta moto = new Motocicleta("SUZUKI", "V-STROM 650DL", "BRANCA", "MOTOCICLETA",
                    0, true, true);
            Bicicleta bike = new Bicicleta("CALOI", "MONTAIN", "AZUL", "BICICLETA", 0, false);
            
            imprimirStatusVeiculo(auto);
            auto.acelerar(30);
            auto.acelerar(20);
            auto.acelerar(10);
            auto.virar("esquerda");
            auto.frear(15);
            auto.virar("direita");
            auto.virar("alinhar");
            auto.frear(45);
           
            System.out.println("---------------------------------------\n");
            
            imprimirStatusVeiculo(moto);
            moto.acelerar(50);
            moto.acelerar(20);
            moto.acelerar(10);
            moto.virar("esquerda");
            moto.frear(30);
            moto.virar("direita");
            moto.virar("alinhar");
            moto.frear(50);           
            System.out.println("---------------------------------------\n");
             
            imprimirStatusVeiculo(bike);
            bike.acelerar(20);
            bike.acelerar(15);
            bike.frear(30);
            bike.frear(5);
            bike.acelerar(50);
            bike.virar("esquerda");
            bike.frear(7);
            bike.virar("direita");
            bike.frear(43);
                      
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }      

    }

}
