

// Lucas Fares Corrêa Auad Pereira
public class TstVeic {
    public static void main(String[] args) {
        Leitura leitura = new Leitura();

        Passeio passeio1 = new Passeio();
        
        System.out.println("=== CADASTRO VEÍCULO DE PASSEIO ===");
        passeio1.setPlaca(leitura.entDados("Placa: "));
        passeio1.setMarca(leitura.entDados("Marca: "));
        passeio1.setModelo(leitura.entDados("Modelo: "));
        passeio1.setCor(leitura.entDados("Cor: "));
        
        String qtdRodasStr = leitura.entDados("Quantidade de rodas: ");
        passeio1.setQtdRodas(Integer.parseInt(qtdRodasStr));
        
        String velocMaxStr = leitura.entDados("Velocidade máxima (km/h): ");
        passeio1.setVelocMax(Integer.parseInt(velocMaxStr));
        
        String qtdPistStr = leitura.entDados("Quantidade de pistões do motor: ");
        passeio1.getMotor().setQtdPist(Integer.parseInt(qtdPistStr));
        
        String potenciaStr = leitura.entDados("Potência do motor: ");
        passeio1.getMotor().setPotencia(Integer.parseInt(potenciaStr));
        
        String passageirosStr = leitura.entDados("Quantidade de passageiros: ");
        passeio1.setQtdePassageiro(Integer.parseInt(passageirosStr));
        
        passeio1.setDataCadastro(leitura.entDados("Data de cadastro: "));
        
        // Exibindo resultados
        System.out.println("\n=== VEÍCULO DE PASSEIO ===");
        System.out.println("Placa: " + passeio1.getPlaca());
        System.out.println("Velocidade em M/h: " + passeio1.calcVel());
        System.out.println("Cálculo (soma letras): " + passeio1.calcular());
        
        // Criando veículo de carga
        Carga carga1 = new Carga();
        
        System.out.println("\n=== CADASTRO VEÍCULO DE CARGA ===");
        carga1.setPlaca(leitura.entDados("Placa: "));
        carga1.setMarca(leitura.entDados("Marca: "));
        carga1.setModelo(leitura.entDados("Modelo: "));
        carga1.setCor(leitura.entDados("Cor: "));
        
        qtdRodasStr = leitura.entDados("Quantidade de rodas: ");
        carga1.setQtdRodas(Integer.parseInt(qtdRodasStr));
        
        velocMaxStr = leitura.entDados("Velocidade máxima (km/h): ");
        carga1.setVelocMax(Integer.parseInt(velocMaxStr));
        
        qtdPistStr = leitura.entDados("Quantidade de pistões do motor: ");
        carga1.getMotor().setQtdPist(Integer.parseInt(qtdPistStr));
        
        potenciaStr = leitura.entDados("Potência do motor: ");
        carga1.getMotor().setPotencia(Integer.parseInt(potenciaStr));
        
        String taraStr = leitura.entDados("Tara: ");
        carga1.setTara(Integer.parseInt(taraStr));
        
        String cargaMaxStr = leitura.entDados("Carga máxima: ");
        carga1.setCargaMax(Integer.parseInt(cargaMaxStr));
        
        carga1.setDataCadastro(leitura.entDados("Data de cadastro: "));
        
        // Exibindo resultados
        System.out.println("\n=== VEÍCULO DE CARGA ===");
        System.out.println("Placa: " + carga1.getPlaca());
        System.out.println("Velocidade em Cm/h: " + carga1.calcVel());
        System.out.println("Cálculo (soma numérica): " + carga1.calcular());
    }
}