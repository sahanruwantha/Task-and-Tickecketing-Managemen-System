package com.sahan.springdatajpa.Repository;

import com.sahan.springdatajpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student, Long>
{

}
