package enit.pfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enit.pfa.entities.User;

public interface user_repo extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
