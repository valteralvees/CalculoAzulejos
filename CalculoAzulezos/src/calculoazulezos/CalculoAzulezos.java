package calculoazulezos;
import java.util.Scanner;
public class CalculoAzulezos {

    public static void main(String[] args) {
        // Declaração de variáveis
        float alturaParede = 0, larguraParede=0, alturaAzulejo=0, larguraAzulejo=0, quantidadeTotalAzulejos=0;
        
        
        //Teclado & afins
        Scanner teclado = new Scanner(System.in);
        
        //Programa
        System.out.println("Bem vindo! Simularemos a quantidade de azulejos necessária para cobrir a sua parede.");
        System.out.println("Digite a altura da sua parede, em M(Metros):");
        alturaParede = teclado.nextFloat();
        System.out.println("Digite a largura da sua parede, em M(Metros):");
        larguraParede = teclado.nextFloat();
        System.out.println("Certo!");
        System.out.println("Agora, digite a altura do seu azulejo, em CM(Centímetros):");
        alturaAzulejo = teclado.nextFloat();
        System.out.println("Digite a largura do seu azulejo, em CM(Centímetros):");
        larguraAzulejo= teclado.nextFloat();
        float preencherAltura = (alturaParede*100) / alturaAzulejo;
        float preencherLargura = (larguraParede*100)/ larguraAzulejo;
        quantidadeTotalAzulejos = preencherAltura * preencherLargura;
        System.out.println("Você precisará de um total de "+quantidadeTotalAzulejos+ " azulejos para preencher toda a sua parede");
        
        
    }
    
}
