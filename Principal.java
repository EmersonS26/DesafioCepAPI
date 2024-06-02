import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConssultaCep consultaCep = new ConssultaCep();

        System.out.println("Digite seu cep: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereço = consultaCep.buscaEnderco(cep);
            System.out.println(novoEndereço);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereço);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação!");
        }
    }
}
