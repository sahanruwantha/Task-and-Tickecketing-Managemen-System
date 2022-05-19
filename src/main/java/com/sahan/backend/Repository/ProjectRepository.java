package com.sahan.backend.Repository;

import com.sahan.backend.Entity.ProjectRelated.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long>
{
//    List<Project> findAllByUserID();
}
