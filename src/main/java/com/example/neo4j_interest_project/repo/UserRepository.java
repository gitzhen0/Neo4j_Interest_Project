package com.example.neo4j_interest_project.repo;

import com.example.neo4j_interest_project.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {
}
