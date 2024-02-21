public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    private static int quantidadeCarrosCriados = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        quantidadeCarrosCriados++; 
    }

    public static int getQuantidadeCarrosCriados() {
        return quantidadeCarrosCriados;
    }
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public static void main(String[] args) {
    
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Honda", "Civic", 2023);
        
        System.out.println("Carro 1:");
        carro1.exibirInformacoes();
        System.out.println();
        System.out.println("Carro 2:");
        carro2.exibirInformacoes();
        System.out.println();
        
        System.out.println("Quantidade de carros criados: " + Carro.getQuantidadeCarrosCriados());
    }
}