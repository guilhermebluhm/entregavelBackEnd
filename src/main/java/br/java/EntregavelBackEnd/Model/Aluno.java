package br.java.EntregavelBackEnd.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_alunos")
@Getter
@Setter
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_aluno")
    private String nomeAluno;
    @Column(name = "numero_matricula", unique = true)
    private String numeroMatricula;
    @Column(name = "senha_cadastro")
    private String senhaCadastrada;
    @Column(name = "curso_matriculado")
    private String cursoMatriculado;

    public Aluno(String nomeAluno, String numeroMatricula, String senhaCadastrada, String cursoMatriculado) {
        this.nomeAluno = nomeAluno;
        this.numeroMatricula = numeroMatricula;
        this.senhaCadastrada = senhaCadastrada;
        this.cursoMatriculado = cursoMatriculado;
    }
}
