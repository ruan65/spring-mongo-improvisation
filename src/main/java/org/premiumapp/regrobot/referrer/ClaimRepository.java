package org.premiumapp.regrobot.referrer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "claim", path = "claim")
public interface ClaimRepository extends MongoRepository<Claim, String>{

    List<Claim> findByForename(@Param("forename") String name);
}
