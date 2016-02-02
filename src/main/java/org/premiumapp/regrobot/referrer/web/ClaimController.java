package org.premiumapp.regrobot.referrer.web;

import org.premiumapp.regrobot.referrer.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    @Autowired ClaimService claimService;


    @RequestMapping(value = "/register/claim", method = RequestMethod.POST)
    public ClaimRegistrationResponse registerClaim(@RequestBody Claim request) {

        return new ClaimRegistrationResponse(claimService.registerClaim(request));
    }
}
