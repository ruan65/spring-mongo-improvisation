package org.premiumapp.regrobot.referrer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document
public class Claim {

    @Id
    String id;

    public String gender;

    public String forename;
    public String surname;
    public String dob;

    public String nin;

    public String address1;
    public String address2;
    public String address3;

    public String city;
    public String postCode;

    public String phone;
    public String mobile;
    public String email;

    public String contactTime;

    public String occupation;

    public boolean twoPhotoIds;

    /**
     *  Accident details
     */

    public String date;
    public String placeInCar;

    public Set<String> damages = new HashSet<>(4);
    public Set<String> damageType = new HashSet<>(3);

    public String description;

    public int numberOfPassengers;

    public Set<String> injuresSet = new HashSet<>(4);
    public String otherInjuries;

    public Set<String> psychologicalSet = new HashSet<>(3);

    public Set<String> didYouVisit = new HashSet<>(4);
    public String didYouVisitOther;

    public Set<String> problemsAtHome = new HashSet<>(5);
    public Set<String> problemsAtWork = new HashSet<>(5);

    public Set<String> areYouWilling = new HashSet<>(7);

    public boolean anotherAccident;

    public String getClaimId() {
        return id;
    }
}
