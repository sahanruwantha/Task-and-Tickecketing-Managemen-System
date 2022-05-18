package com.sahan.backend.Repository;

import com.sahan.backend.Entity.ProjectRelated.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
