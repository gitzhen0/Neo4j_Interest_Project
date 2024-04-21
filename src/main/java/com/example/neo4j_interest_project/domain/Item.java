package com.example.neo4j_interest_project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Item {

    @Id @GeneratedValue private Long id;

    private String title;

    private String rid;
}
