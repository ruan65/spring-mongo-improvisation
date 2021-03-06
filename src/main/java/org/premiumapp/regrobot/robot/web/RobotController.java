package org.premiumapp.regrobot.robot.web;

import org.apache.log4j.Logger;
import org.premiumapp.regrobot.robot.Robot;
import org.premiumapp.regrobot.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @Autowired RobotService robotService;

    @Autowired CounterService counterService;

    private Logger log = Logger.getLogger(RobotController.class);



    @RequestMapping(value = "/register/robot", method = RequestMethod.POST)
    public RegistrationResponse registerRobot(@RequestBody RegistrationRequest request) {
        Robot robot = new Robot();
        robot.setName(request.getName());
        robot.setAddress(request.getAddress());

        counterService.increment("registration.register");

        log.info(String.format("Registering robot %s at address %s", robot.getName(), robot.getAddress()));

        return new RegistrationResponse(robotService.registerRobot(robot));
    }
}
