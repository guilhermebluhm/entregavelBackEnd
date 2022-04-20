package br.java.EntregavelBackEnd.Service;

import br.java.EntregavelBackEnd.Model.Aluno;
import br.java.EntregavelBackEnd.Model.DTO.AlunoDTO;
import br.java.EntregavelBackEnd.Repositories.AlunoRepository;
import br.java.EntregavelBackEnd.Service.Exception.ObjectNotFoundException;
import br.java.EntregavelBackEnd.Service.Impl.RepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService implements RepositoryImpl {

    @Autowired
    private AlunoRepository aluno_repository;

    @Override
    public List<AlunoDTO> getAllStudents() {
        return AlunoDTO.generateListBaseModelAluno(this.aluno_repository.findAll());
    }

    @Override
    public AlunoDTO findStudent(int id) {
        Optional<Aluno> studentId = this.aluno_repository.findById(id);
        if(studentId.isPresent()){
            AlunoDTO studentDTO = new AlunoDTO(studentId.get());
            return studentDTO;
        }
        throw new ObjectNotFoundException("objeto nao localizado = " + Aluno.class + " para o ID + " + id);
    }

    @Override
    public void removeStudent(int id) {
        this.aluno_repository.deleteById(id);
    }

    @Override
    public AlunoDTO createStudent(Aluno aluno) {
        Aluno new_student = this.aluno_repository.save(aluno);
        return new AlunoDTO(new_student);
    }

    @Override
    public AlunoDTO updateExistStudent(int id, Aluno aluno) {
        Optional<Aluno> udt_student = this.aluno_repository.findById(id);
        if(udt_student.isPresent()){
            udt_student.get().setCursoMatriculado(aluno.getCursoMatriculado());
            Aluno commit_student = this.aluno_repository.save(udt_student.get());
            return new AlunoDTO(commit_student);
        }
        throw new ObjectNotFoundException("Objeto nao localizado = " + Aluno.class + " para o ID: " + id);
    }
}
