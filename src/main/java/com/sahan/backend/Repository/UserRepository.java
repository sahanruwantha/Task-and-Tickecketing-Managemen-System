package com.sahan.backend.Repository;

import com.sahan.backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>
{

}
