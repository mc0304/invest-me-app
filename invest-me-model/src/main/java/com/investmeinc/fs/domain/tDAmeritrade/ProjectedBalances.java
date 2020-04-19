package com.investmeinc.fs.domain.tDAmeritrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectedBalances {

    @JsonProperty("cashAvailableForTrading")
    private double cashAvailableForTrading;
    @JsonProperty("cashAvailableForWithdrawal")
    private double cashAvailableForWithdrawal;

    public ProjectedBalances() {
    }

    public ProjectedBalances(double cashAvailableForTrading, double cashAvailableForWithdrawal) {
        this.cashAvailableForTrading = cashAvailableForTrading;
        this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
    }

    public double getCashAvailableForTrading() {
        return cashAvailableForTrading;
    }

    public void setCashAvailableForTrading(double cashAvailableForTrading) {
        this.cashAvailableForTrading = cashAvailableForTrading;
    }

    public double getCashAvailableForWithdrawal() {
        return cashAvailableForWithdrawal;
    }

    public void setCashAvailableForWithdrawal(double cashAvailableForWithdrawal) {
        this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
    }

    @Override
    public String toString() {
        return "ProjectedBalances{" +
                "cashAvailableForTrading=" + cashAvailableForTrading +
                ", cashAvailableForWithdrawal=" + cashAvailableForWithdrawal +
                '}';
    }
}
