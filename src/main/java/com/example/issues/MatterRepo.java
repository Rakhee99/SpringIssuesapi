package com.example.issues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.issues.model.Matter;

@RepositoryRestResource(collectionResourceRel="rakesh", path="issue")
public interface MatterRepo extends JpaRepository<Matter, Integer>
{
		
}
