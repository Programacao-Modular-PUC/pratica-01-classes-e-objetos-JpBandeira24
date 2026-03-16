/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01_02;

/**
 *    import java.time.LocalDate;
 * @author 1593655
 */
public class Pessoa {


public class Pessoa {

    private String nome;
    private String sobrenome;
    private double peso;
    private double altura;
    private Data dataNascimento;

    public Pessoa(String nome, String sobrenome, double peso, double altura, Data dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public int calculaIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getAno();

        if (hoje.getMonthValue() < dataNascimento.getMes() ||
           (hoje.getMonthValue() == dataNascimento.getMes() && hoje.getDayOfMonth() < dataNascimento.getDia())) {
            idade--;
        }

        return idade;
    }

    public double calculaIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {

        double imc = calculaIMC();

        if (imc < 18.5)
            return "Abaixo do peso";
        else if (imc < 25)
            return "Peso normal";
        else if (imc < 30)
            return "Sobrepeso";
        else if (imc < 35)
            return "Obesidade grau I";
        else if (imc < 40)
            return "Obesidade grau II";
        else
            return "Obesidade grau III";
    }

    public String nomeReferencia() {
        return sobrenome + ", " + nome.toUpperCase();
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
}
