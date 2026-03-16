/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica01_02;

/**
 *
 * @author 1593655
 */
import java.util.Scanner;
public class Pratica01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[10];
        
        int i;
        
        for (i=0; i<10; i++){
            
            System.out.println("Cadastro " + (i+1));
            
            
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Sobrenome: ");
            String sobrenome = sc.nextLine();
            
            System.out.println("Peso: ");
            double peso  = sc.nextDouble();
            
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            
            System.out.println("Data de Nascimento (dd mm aaaa): ");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int ano = sc.nextInt();
            
            sc.nextLine();
            
            Data data = new Data(dia, mes, ano);
            
            pessoas[i] = new Pessoa(nome, sobrenome, peso, altura, data);
            
            if(i < 0){
                if(pessoas[i].nomeCompleto().equalsIgnoreCase(pessoas[i - 1].nomeCompleto())){
                    break;
                }
            }
        }
        
        System.out.println("\n--- Dados Cadastrados ---\n");
        
        for (int j=0; j <= i && pessoas[j] != null; j++){
            System.out.println("Cadastro " + (j + 1) + ":");
            
            System.out.println("Nome Completo: " + pessoas[j].nomeCompleto());
            
            System.out.println("Nome de Referencia: " + pessoas[j].nomeReferencia());
             
            System.out.println("Idade : " + pessoas[j].calculaIdade());
            
                        System.out.println("Peso: " + pessoas[j].getPeso());

            System.out.println("Altura: " + pessoas[j].getAltura());

            System.out.println("IMC: " + pessoas[j].calculaIMC());

            System.out.println("Classificação: " + pessoas[j].classificacaoIMC());

            System.out.println();
        }

        sc.close();
        }
    }
    
