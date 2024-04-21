package com.example.neo4j_interest_project.repo;

import com.example.neo4j_interest_project.domain.Item;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ItemRepository extends Neo4jRepository<Item, Long> {
}
