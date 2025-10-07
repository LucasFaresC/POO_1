

// Lucas Fares Corrêa Auad Pereira
public class TstVeic {
    public static void main(String[] args) {
        Leitura leitura = new Leitura();
        Passeio passeio = new Passeio();
        Carga carga = new Carga();
        
        System.out.println("\n<< Vamos Cadastrar o veiculo de Pesseio >>");
        passeio.setPlaca(leitura.entDados("Placa: "));
        passeio.setMarca(leitura.entDados("Marca: "));
        passeio.setModelo(leitura.entDados("Modelo: "));
        passeio.setCor(leitura.entDados("Cor: "));
        
        passeio.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas: ")));
        passeio.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade máxima (km/h): ")));
        passeio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de pistões do motor: ")));
        passeio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potência do motor: ")));
        passeio.setQtdePassageiro(Integer.parseInt(leitura.entDados("Quantidade de passageiros: ")));
        passeio.setDataCadastro(leitura.entDados("Data de cadastro: "));
        
        System.out.println("\n<< Veiculo de Passeio >>");
        System.out.println("Placa: " + passeio.getPlaca());
        System.out.println("Velocidade em M/h: " + passeio.calcVel());
        System.out.println("Cálculo (soma letras): " + passeio.calcular());
        
        System.out.println("\n<< Cadastro do veiculo de Carga >>");
        
        carga.setPlaca(leitura.entDados("Placa: "));
        carga.setMarca(leitura.entDados("Marca: "));
        carga.setModelo(leitura.entDados("Modelo: "));
        carga.setCor(leitura.entDados("Cor: "));
        carga.setQtdRodas(Integer.parseInt(leitura.entDados("Quantidade de rodas: ")));
        carga.setVelocMax(Integer.parseInt(leitura.entDados("Velocidade máxima (km/h): ")));
        carga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Quantidade de pistões do motor: ")));
        carga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potência do motor: ")));
        carga.setTara(Integer.parseInt(leitura.entDados("Tara: ")));
        carga.setCargaMax(Integer.parseInt(leitura.entDados("Carga máxima: ")));
        carga.setDataCadastro(leitura.entDados("Data de cadastro: "));
        
        
        
        // Exibindo resultados
        System.out.println("\n<< Veiculo de Carga >>");
        System.out.println("Placa: " + carga.getPlaca());
        System.out.println("Velocidade em Cm/h: " + carga.calcVel());
        System.out.println("Cálculo (soma numérica): " + carga.calcular());
    }
}