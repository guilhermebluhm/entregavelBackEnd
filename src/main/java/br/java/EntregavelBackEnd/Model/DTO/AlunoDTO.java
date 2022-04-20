package br.java.EntregavelBackEnd.Model.DTO;

import br.java.EntregavelBackEnd.Model.Aluno;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class AlunoDTO {

    private int id;
    private String nomeAluno;
    private String numeroMatricula;
    private String cursoMatriculado;

    public AlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nomeAluno = aluno.getNomeAluno();
        this.numeroMatricula = aluno.getNumeroMatricula();
        this.cursoMatriculado = aluno.getCursoMatriculado();
    }

    public static List<AlunoDTO> generateListBaseModelAluno(List<Aluno> aluno){
        return aluno.stream().map(AlunoDTO::new).collect(Collectors.toList());
    }
}
