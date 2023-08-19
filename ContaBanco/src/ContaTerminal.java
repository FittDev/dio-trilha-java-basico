import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {   
        //TODO: Conhecer e importar a classe Scannner - ok
        // Criando o objeto Scanner;        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário 
        System.out.println("Bem-vindo ao Banco Diginal Inovattion One...");
        //TODO: obter pela classe Scanner os valores digitados no terminal
        int Numero=0;	      
            
        Double Saldo = 1000.00;
        System.out.print("Digite o seu Nome:");
        String Nome = scanner.next();
        System.out.print("Digite a sua Agencia");
        String Agencia = scanner.next();

        System.out.print("Digite a sua Conta");        
        String Conta = scanner.next();

        //Em seguida exibir a mensagem conta criada
        System.out.println("Olá " + Nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ Conta + " e seu saldo "+ Saldo + "já está disponível para saque");

    }
}