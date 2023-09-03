package br.com.experian.loadbatchhonda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.experian.loadbatchhonda.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
