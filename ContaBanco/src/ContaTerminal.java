import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        //String Nome;
        //String Sobrenome;
        double Saldo;

        System.out.println("Por favor, digite o número da conta:");
        Numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        Agencia = sc.next();

        // usado para limpar a memória antes de ler o NomeCliente
        sc.nextLine();

        System.out.println("Por favor, digite o seu nome completo:");
        NomeCliente = sc.nextLine(); //vai retornar o conteúdo da linha inteira, mesmo contendo espaços

        //outra opçlão seria ter a variável Nome e Sobrenome e então realizar concatenação em NomeCliente

        //System.out.println("Por favor, digite seu primeiro nome:");
        //Nome = sc.next();

        //System.out.println("Por favor, digite seu sobrenome:");
        //Sobrenome = sc.next();  

        //NomeCliente = Nome.concat(" "+Sobrenome); // alternativa de concatenação
        //NomeCliente = Nome + " " + Sobrenome; //outra alternativa de concatenar


        System.out.println("Por favor, digite o seu saldo:");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
