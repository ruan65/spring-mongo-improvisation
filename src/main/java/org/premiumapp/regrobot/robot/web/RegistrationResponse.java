package org.premiumapp.regrobot.robot.web;

/**
 * Created by a on 1/12/16.
 */
public class RegistrationResponse {

    private String robotId;

    public String getRobotId() {
        return robotId;
    }

    public RegistrationResponse(String robotId) {

        this.robotId = robotId;
    }
}
