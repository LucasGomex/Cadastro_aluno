/**
 * @author Rodrigo Braga Lucas Gomes
 */

import java.awt.event.*;
import java.util.*;
import java.awt.Component;

import javax.swing.*;


public class MostrarAlunoAction implements ActionListener{

    private List<Aluno> alunos;
    private Component _parent;

    public MostrarAlunoAction(Component parent, List<Aluno> listAlunos) {
        super();

        alunos = listAlunos;
        _parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";

        for (Aluno aluno : alunos) {
            mensagem += aluno.toString() + "\n";
        }

        if(alunos.size() == 0){
            mensagem = "Sem registros";
        }
        
        JOptionPane.showMessageDialog (_parent, mensagem);
        
    }
    
}
