import java.util.Scanner;


public class prova {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Digite o cargo do funcionario: (Cientista, Engenheiro, Zelador, Administrativo): ");
        String cargo = sc.nextLine();

        
        System.out.print("Nível de acesso (1 a 10) ");
        int nivelAcesso = sc.nextInt();

        
        if (nivelAcesso < 1 || nivelAcesso > 10) {
            System.out.println(" Nível de acesso inválido.");
        } else {
            // Req03: Solicitar nível de sigilo apenas se o acesso for válido
            System.out.print("Nível de sigilo da área (1 a 10): ");
            int nivelSigilo = sc.nextInt();

            System.out.println(" RESULTADO DA ANÁLISE ");

            
            System.out.println("Profissional: " + nome + " - Cargo: " + cargo);

            
            if (nivelAcesso >= nivelSigilo) {
                
                System.out.println("ACESSO PERMITIDO");
                
                System.out.println("Nível de autoridade: " + (nivelAcesso - nivelSigilo));
                
            } else

                System.out.println("ACESSO NEGADO");
                
                if (nivelAcesso < 3 && nivelSigilo > 7) {
                    System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
                }
            }
        }

        
    }
