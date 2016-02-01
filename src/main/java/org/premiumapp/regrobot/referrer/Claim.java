package org.premiumapp.regrobot.referrer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document
public class Claim {

    @Id
    String id;

    private ClaimantDetails claimantDetails;
    private AccidentDetails accidentDetails;

    public Set<String> injuresSet = new HashSet<>(4);
    public String injuresListOther;

    public Set<String> psychologicalSet = new HashSet<>(3);

    public Set<String> didYouVisit = new HashSet<>(4);
    public String didYouVisitOther;

    public Set<String> problemsAtHome = new HashSet<>(5);
    public Set<String> problemsAtWork = new HashSet<>(5);

    public Set<String> areYouWilling = new HashSet<>(7);

    public boolean anotherAccident;

    public ClaimantDetails getClaimantDetails() {
        return claimantDetails;
    }

    public void setClaimantDetails(ClaimantDetails claimantDetails) {
        this.claimantDetails = claimantDetails;
    }

    public AccidentDetails getAccidentDetails() {
        return accidentDetails;
    }

    public void setAccidentDetails(AccidentDetails accidentDetails) {

        this.accidentDetails = accidentDetails;
    }

    public String getClaimId() {
        return id;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimantDetails=" + claimantDetails +
                ", \naccidentDetails=" + accidentDetails +
                ", \ninjuresSet=" + injuresSet +
                ", \ninjuresListOther='" + injuresListOther + '\'' +
                ", \npsychologicalSet=" + psychologicalSet +
                ", \ndidYouVisit=" + didYouVisit +
                ", \ndidYouVisitOther='" + didYouVisitOther + '\'' +
                ", \nproblemsAtHome=" + problemsAtHome +
                ", \nproblemsAtWork=" + problemsAtWork +
                ", \nareYouWilling=" + areYouWilling +
                ", \nanotherAccident=" + anotherAccident +
                '}';
    }
}
