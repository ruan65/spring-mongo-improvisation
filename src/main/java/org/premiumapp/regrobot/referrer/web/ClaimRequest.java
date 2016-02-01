package org.premiumapp.regrobot.referrer.web;

import java.util.Set;

public class ClaimRequest {

    String didYouVisitOther;

    public Set<String> getInjuresSet() {
        return injuresSet;
    }

    public void setInjuresSet(Set<String> injuresSet) {
        this.injuresSet = injuresSet;
    }

    Set<String> injuresSet;

    public String getDidYouVisitOther() {
        return didYouVisitOther;
    }

    public void setDidYouVisitOther(String didYouVisitOther) {
        this.didYouVisitOther = didYouVisitOther;
    }
}
