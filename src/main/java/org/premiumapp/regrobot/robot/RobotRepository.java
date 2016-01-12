package org.premiumapp.regrobot.robot;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface RobotRepository extends MongoRepository<Robot, String> {}
