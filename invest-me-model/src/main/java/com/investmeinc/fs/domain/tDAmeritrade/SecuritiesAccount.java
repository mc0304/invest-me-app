package com.investmeinc.fs.domain.tDAmeritrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SecuritiesAccount {

    @JsonProperty("type")
    private String type;
    @JsonProperty("accountId")
    private long accountId;
    @JsonProperty("roundTrips")
    private double roundTrips;
    @JsonProperty("isDayTrader")
    private boolean isDayTrader;
    @JsonProperty("isClosingOnlyRestricted")
    private boolean isClosingOnlyRestricted;
    @JsonProperty("initialBalances")
    private InitialBalances initialBalances;
    @JsonProperty("currentBalances")
    private CurrentBalances currentBalances;
    @JsonProperty("projectedBalances")
    private ProjectedBalances projectedBalances;

    public SecuritiesAccount() {
    }

    public SecuritiesAccount(String type, long accountId, double roundTrips, boolean isDayTrader, boolean isClosingOnlyRestricted, InitialBalances initialBalances, CurrentBalances currentBalances, ProjectedBalances projectedBalances) {
        this.type = type;
        this.accountId = accountId;
        this.roundTrips = roundTrips;
        this.isDayTrader = isDayTrader;
        this.isClosingOnlyRestricted = isClosingOnlyRestricted;
        this.initialBalances = initialBalances;
        this.currentBalances = currentBalances;
        this.projectedBalances = projectedBalances;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getRoundTrips() {
        return roundTrips;
    }

    public void setRoundTrips(double roundTrips) {
        this.roundTrips = roundTrips;
    }

    public boolean isDayTrader() {
        return isDayTrader;
    }

    public void setDayTrader(boolean dayTrader) {
        isDayTrader = dayTrader;
    }

    public boolean isClosingOnlyRestricted() {
        return isClosingOnlyRestricted;
    }

    public void setClosingOnlyRestricted(boolean closingOnlyRestricted) {
        isClosingOnlyRestricted = closingOnlyRestricted;
    }

    public InitialBalances getInitialBalances() {
        return initialBalances;
    }

    public void setInitialBalances(InitialBalances initialBalances) {
        this.initialBalances = initialBalances;
    }

    public CurrentBalances getCurrentBalances() {
        return currentBalances;
    }

    public void setCurrentBalances(CurrentBalances currentBalances) {
        this.currentBalances = currentBalances;
    }

    public ProjectedBalances getProjectedBalances() {
        return projectedBalances;
    }

    public void setProjectedBalances(ProjectedBalances projectedBalances) {
        this.projectedBalances = projectedBalances;
    }

    @Override
    public String toString() {
        return "SecuritiesAccount{" +
                "type='" + type + '\'' +
                ", accountId=" + accountId +
                ", roundTrips=" + roundTrips +
                ", isDayTrader=" + isDayTrader +
                ", isClosingOnlyRestricted=" + isClosingOnlyRestricted +
                ", initialBalances=" + initialBalances +
                ", currentBalances=" + currentBalances +
                ", projectedBalances=" + projectedBalances +
                '}';
    }
}
