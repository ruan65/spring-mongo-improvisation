package org.premiumapp.regrobot.referrer;

public class ClaimantDetails {

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

    @Override
    public String toString() {
        return "ClaimantDetails{" +
                "gender='" + gender + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", nin='" + nin + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", contactTime='" + contactTime + '\'' +
                ", occupation='" + occupation + '\'' +
                ", twoPhotoIds=" + twoPhotoIds +
                '}';
    }
}
