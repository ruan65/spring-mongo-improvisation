package org.premiumapp.regrobot.referrer.web;


import org.premiumapp.regrobot.referrer.Claim;
import org.premiumapp.regrobot.referrer.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public String registerClaim(Claim claim) {
        return claimRepository.save(claim).getClaimId();
    }
}
