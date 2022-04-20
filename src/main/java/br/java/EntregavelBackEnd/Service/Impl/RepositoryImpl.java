package br.java.EntregavelBackEnd.Service.Impl;

import br.java.EntregavelBackEnd.Model.Aluno;
import br.java.EntregavelBackEnd.Model.DTO.AlunoDTO;

import java.util.List;

public interface RepositoryImpl {

    List<AlunoDTO> getAllStudents();
    AlunoDTO findStudent(int id);
    void removeStudent(int id);
    AlunoDTO createStudent(Aluno aluno);
    AlunoDTO updateExistStudent(int id, Aluno aluno);

}
