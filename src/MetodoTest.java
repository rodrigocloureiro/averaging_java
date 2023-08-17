import java.util.Scanner;

public class MetodoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAlunos;
        double nota, maiorNota = Double.MIN_VALUE, somaNotas = 0;
        String nome, nomeMaiorNota = "";
        CalculadoraDeMedias calc = new CalculadoraDeMedias();

        System.out.print("Digite a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Digite o nome do %d(o) aluno(a): ", i+1);
            nome = sc.nextLine();

            System.out.printf("Digite a nota do %d(o) aluno(a): ", i+1);
            nota = sc.nextFloat();
            somaNotas += nota;
            sc.nextLine();

            if (nota > maiorNota) {
                maiorNota = nota;
                nomeMaiorNota = nome;
            } else if (nota == maiorNota) {
                nomeMaiorNota = nome.compareTo(nomeMaiorNota) < 0 ? nome : nomeMaiorNota;
            }
        }

        double media = calc.calcularMediaAritmetica(somaNotas, qtdAlunos);
        System.out.printf("A média da turma é: %.1f\n", media);
        System.out.printf("A maior nota da turma é: %.1f, do aluno %s\n", maiorNota, nomeMaiorNota);

        sc.close();
    }
}
