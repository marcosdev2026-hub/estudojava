import java.io.*;

class JUtil {
    public static String readString() throws Exception {
        DataInputStream A = new DataInputStream(System.in);
        return (A.readLine());
    }

    public static int readInt() throws Exception {
        return (Integer.valueOf(readString()).intValue());
    }

    public static float readFloat() throws Exception {
        return (Float.valueOf(readString()).floatValue());
    }

    public static double readDouble() throws Exception {
        return (Double.valueOf(readString()).doubleValue());
    }

    public static void pause() throws Exception {
        String a = readString();
    }
}

class controleEstoque {
    private int codigo;
    private String nome;
    private String categoria;
    private double precoCusto;
    private double precoVenda;
    private int quantidadeEstoque;
    private int quantidadeMinima;

    // Get para atributos privados
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    // Construtor
    public controleEstoque(int codigo, String nome, double precoCusto, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = 0.0;
        this.quantidadeEstoque = 0;
        this.categoria = "NaoDefinida";
        this.precoVenda = precoCusto * 1.5;
        this.quantidadeMinima = 0;
    }

    // Set para atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double alterarPrecoCusto(double novoPreco) {
        if (novoPreco > 0) {
            precoCusto = novoPreco;
            System.out.println("Preco de custo redefinido com sucesso! ");

        } else {
            System.out.println("Erro ao alterar preco de custo");
        }
        return precoCusto;
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    public int setQuantiEstoque(int quantidade) {
        if (quantidade != 0) {
            this.quantidadeEstoque = quantidade;
        }
        return quantidade;
    }

}

public class Main {
    public static void main(String[] args) throws Exception{
        controleEstoque produto = new controleEstoque(0, null, 0, 0);
		int opcao;
        do{
            System.out.println("=== SISTEMA DE CONTROLE DE ESTOQUE ===");
            System.out.println("1-Cadastrar novo produto");
            System.out.println("2-Listar todos os Produtos");
            System.out.println("3-Buscar por codigo");
            System.out.println("4-Alterar preço de custo");
            System.out.println("5-Ver produto com estoque baixo");
            System.out.println("6-Calcular valor total de todos os produtos");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");
			opcao = JUtil.readInt();

			switch(opcao){
				case 1:
					System.out.println("Informe o nome do produto: ");
					produto.setNome(JUtil.readString());
					System.out.println("Informe o codigo que deseja cadastrar o produto: ");
					produto.setCodigo(JUtil.readInt());
					System.out.println("Informe o preco do custo: ");
					produto.alterarPrecoCusto(JUtil.readDouble());
					System.out.println("Informe a categoria do produto: ");
					produto.setCategoria(JUtil.readString());
									
					break;
				case 2:
					//codigo aqui
					break;
				case 3:
					//codigo aqui
					break;
				case 4:
					//codigo aqui
					break;
				case 5:
					//codigo aqui
					break;
				case 6:
					//caodigo aqui
					break;
				default:
					System.out.println("Opcao Invalida");
			}
		}while(opcao !=0);
    }
}