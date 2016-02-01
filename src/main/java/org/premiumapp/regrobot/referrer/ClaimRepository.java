package org.premiumapp.regrobot.referrer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClaimRepository extends MongoRepository<Claim, String>{}
