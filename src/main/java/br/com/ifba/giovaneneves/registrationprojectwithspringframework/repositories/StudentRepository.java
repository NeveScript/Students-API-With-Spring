package br.com.ifba.giovaneneves.registrationprojectwithspringframework.repositories;

import br.com.ifba.giovaneneves.registrationprojectwithspringframework.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
