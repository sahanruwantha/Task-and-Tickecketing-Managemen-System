package com.sahan.backend.Repository;

import com.sahan.backend.Entity.ProjectRelated.MicroTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MicroTaskRepository extends JpaRepository<MicroTask, Long> {
}
