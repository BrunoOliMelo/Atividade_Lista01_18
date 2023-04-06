import java.util.Scanner;

public class Lista18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = input.nextDouble();

        System.out.println("Digite a velocidade da conexão em Mbps: ");
        double velocidadeConexao = input.nextDouble();

        double tempoDownloadSegundos = tamanhoArquivo * 8 / velocidadeConexao;
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;

        System.out.printf("O tempo de download aproximado é %.2f minutos.%n", tempoDownloadMinutos);

        input.close();
    }
}
