import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) {
        
        String Agencia = "067-8";
        String NomeCliente  ;  
        int NumeroConta ;
        Double Saldo ;
        boolean AteValorVerdadeiro = true;

        
        while (AteValorVerdadeiro) {
            Scanner Texto = new Scanner(System.in);
            
            System.out.println("Por favor Digite numero da agencia !");
            String seraAgencia = Texto.nextLine();
            
         
            if (seraAgencia.equals(Agencia) ) {
                NomeCliente = "MARIO ANDRADE";
                NumeroConta = 1021 ;
                Saldo = 237.48 ;
                System.out.println("Ola "+ NomeCliente + ",Obrigado por criar  uma conta em nosso banco, sua agencia "+ Agencia +" é ,Conta "+ NumeroConta +" e seu saldo "+ Saldo +" ja esta disponivel para saque");
                AteValorVerdadeiro = false;
            }else{
                System.out.println("Agencia nao encontrada ");
            }

        }
        
        
    }
}
