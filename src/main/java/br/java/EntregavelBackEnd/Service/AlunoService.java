package br.java.EntregavelBackEnd.Service;

import br.java.EntregavelBackEnd.Model.Aluno;
import br.java.EntregavelBackEnd.Model.DTO.AlunoDTO;
import br.java.EntregavelBackEnd.Repositories.AlunoRepository;
import br.java.EntregavelBackEnd.Service.Exception.ObjectNotFoundException;
import br.java.EntregavelBackEnd.Service.Impl.AlunoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AlunoService{

    List<AlunoDTO> getAllStudents();
    AlunoDTO findStudent(int id);
    void removeStudent(int id);
    AlunoDTO createStudent(Aluno aluno);
    AlunoDTO updateExistStudent(int id, Aluno aluno);

}
