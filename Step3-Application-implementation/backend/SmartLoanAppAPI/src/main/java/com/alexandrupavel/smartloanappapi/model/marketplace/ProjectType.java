package com.alexandrupavel.smartloanappapi.model.marketplace;

import jakarta.persistence.*;

@Entity
@Table(name = "project_types")
public class ProjectType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectTypeId;

    @Column(nullable = false, unique = true)
    private String name;

    public ProjectType() {}

    public ProjectType(Long projectTypeId, String name) {
        this.projectTypeId = projectTypeId;
        this.name = name;
    }

    public Long getProjectTypeId() {
        return projectTypeId;
    }

    public void setProjectTypeId(Long projectTypeId) {
        this.projectTypeId = projectTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
