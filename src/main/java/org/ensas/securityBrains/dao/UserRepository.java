package org.ensas.securityBrains.dao;

import org.ensas.securityBrains.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String userame);
}
