package br.java.EntregavelBackEnd.Controller;

import br.java.EntregavelBackEnd.Model.Aluno;
import br.java.EntregavelBackEnd.Model.DTO.AlunoDTO;
import br.java.EntregavelBackEnd.Service.AlunoService;
import br.java.EntregavelBackEnd.Service.Impl.AlunoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoImpl aluno_service;

    @GetMapping("/listar")
    public List<AlunoDTO> listAllStudents(){
        return aluno_service.getAllStudents();
    }

    @GetMapping("/listar/{id}")
    public AlunoDTO findStudent(@PathVariable("id") int id){
        return this.aluno_service.findStudent(id);
    }

    @PostMapping("/create")
    public AlunoDTO createNewStudent(@RequestBody Aluno aluno){
        return this.aluno_service.createStudent(aluno);
    }

    @DeleteMapping("/delete/{id}")
    public void removeStudent(@PathVariable("id") int id){
        this.aluno_service.removeStudent(id);
    }

    @PutMapping("/atualizar/{id}")
    public AlunoDTO updateStudent(@PathVariable("id") int id, @RequestBody Aluno aluno){
        return this.aluno_service.updateExistStudent(id,aluno);
    }
}
