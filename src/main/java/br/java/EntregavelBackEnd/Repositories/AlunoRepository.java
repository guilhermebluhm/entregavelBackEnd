package br.java.EntregavelBackEnd.Repositories;

import br.java.EntregavelBackEnd.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
