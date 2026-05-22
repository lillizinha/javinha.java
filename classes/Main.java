

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        
        String nomeAluno =
                JOptionPane.showInputDialog("Nome do aluno:");

        String telefoneAluno =
                JOptionPane.showInputDialog("Telefone do aluno:");

        String cpfAluno =
                JOptionPane.showInputDialog("CPF do aluno:");

        String matriculaAluno =
                JOptionPane.showInputDialog("Matrícula do aluno:");

        
        Aluno a1 = new Aluno(
                nomeAluno,
                telefoneAluno,
                cpfAluno,
                matriculaAluno
        );

        
        Professor p1 = new Professor(
                "Pedro",
                "98888",
                "456",
                "002",
                "Mestre"
        );

        Funcionario f1 = new Funcionario(
                "Lucas",
                "97777",
                "789",
                "C01",
                "Coordenador"
        );

        Aluno[] alunos = {a1};

        Responsavel r1 = new Responsavel(
                "Carlos",
                "96666",
                "999",
                alunos
        );

        Pessoa[] pessoas = {a1, p1, f1, r1};

        String resultado = "";

        
        for (Pessoa p : pessoas) {

            resultado += p.saudacao() + "\n\n";
        }

        resultado += r1.mostrarAlunos();

        
        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Sistema Escolar",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
