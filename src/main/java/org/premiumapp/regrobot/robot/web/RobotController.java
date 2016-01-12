package org.premiumapp.regrobot.robot.web;

import org.premiumapp.regrobot.robot.Robot;
import org.premiumapp.regrobot.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @Autowired
    RobotService robotService;

    @RequestMapping(value = "/register/robot", method = RequestMethod.POST)
    public RegistrationResponse registerRobot(@RequestBody RegistrationRequest request) {
        Robot robot = new Robot();
        robot.setName(request.getName());
        robot.setAddress(request.getAddress());

        return new RegistrationResponse(robotService.registerRobot(robot));
    }
}