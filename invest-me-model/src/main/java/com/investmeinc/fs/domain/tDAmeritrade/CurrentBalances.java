package com.investmeinc.fs.domain.tDAmeritrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentBalances {

    @JsonProperty("accruedInterest")
    private double accruedInterest;
    @JsonProperty("cashBalance")
    private double cashBalance;
    @JsonProperty("cashReceipts")
    private double cashReceipts;
    @JsonProperty("longOptionMarketValue")
    private double longOptionMarketValue;
    @JsonProperty("liquidationValue")
    private double liquidationValue;
    @JsonProperty("longMarketValue")
    private double longMarketValue;
    @JsonProperty("moneyMarketFund")
    private double moneyMarketFund;
    @JsonProperty("savings")
    private double savings;
    @JsonProperty("shortMarketValue")
    private double shortMarketValue;
    @JsonProperty("pendingDeposits")
    private double pendingDeposits;
    @JsonProperty("cashAvailableForTrading")
    private double cashAvailableForTrading;
    @JsonProperty("cashAvailableForWithdrawal")
    private double cashAvailableForWithdrawal;
    @JsonProperty("cashCall")
    private double cashCall;
    @JsonProperty("longNonMarginableMarketValue")
    private double longNonMarginableMarketValue;
    @JsonProperty("totalCash")
    private double totalCash;
    @JsonProperty("shortOptionMarketValue")
    private double shortOptionMarketValue;
    @JsonProperty("bondValue")
    private double bondValue;
    @JsonProperty("cashDebitCallValue")
    private double cashDebitCallValue;
    @JsonProperty("unsettledCash")
    private double unsettledCash;

    public CurrentBalances() {
    }

    public CurrentBalances(double accruedInterest, double cashBalance, double cashReceipts, double longOptionMarketValue, double liquidationValue, double longMarketValue, double moneyMarketFund, double savings, double shortMarketValue, double pendingDeposits, double cashAvailableForTrading, double cashAvailableForWithdrawal, double cashCall, double longNonMarginableMarketValue, double totalCash, double shortOptionMarketValue, double bondValue, double cashDebitCallValue, double unsettledCash) {
        this.accruedInterest = accruedInterest;
        this.cashBalance = cashBalance;
        this.cashReceipts = cashReceipts;
        this.longOptionMarketValue = longOptionMarketValue;
        this.liquidationValue = liquidationValue;
        this.longMarketValue = longMarketValue;
        this.moneyMarketFund = moneyMarketFund;
        this.savings = savings;
        this.shortMarketValue = shortMarketValue;
        this.pendingDeposits = pendingDeposits;
        this.cashAvailableForTrading = cashAvailableForTrading;
        this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
        this.cashCall = cashCall;
        this.longNonMarginableMarketValue = longNonMarginableMarketValue;
        this.totalCash = totalCash;
        this.shortOptionMarketValue = shortOptionMarketValue;
        this.bondValue = bondValue;
        this.cashDebitCallValue = cashDebitCallValue;
        this.unsettledCash = unsettledCash;
    }

    public double getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(double accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public double getCashReceipts() {
        return cashReceipts;
    }

    public void setCashReceipts(double cashReceipts) {
        this.cashReceipts = cashReceipts;
    }

    public double getLongOptionMarketValue() {
        return longOptionMarketValue;
    }

    public void setLongOptionMarketValue(double longOptionMarketValue) {
        this.longOptionMarketValue = longOptionMarketValue;
    }

    public double getLiquidationValue() {
        return liquidationValue;
    }

    public void setLiquidationValue(double liquidationValue) {
        this.liquidationValue = liquidationValue;
    }

    public double getLongMarketValue() {
        return longMarketValue;
    }

    public void setLongMarketValue(double longMarketValue) {
        this.longMarketValue = longMarketValue;
    }

    public double getMoneyMarketFund() {
        return moneyMarketFund;
    }

    public void setMoneyMarketFund(double moneyMarketFund) {
        this.moneyMarketFund = moneyMarketFund;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public double getShortMarketValue() {
        return shortMarketValue;
    }

    public void setShortMarketValue(double shortMarketValue) {
        this.shortMarketValue = shortMarketValue;
    }

    public double getPendingDeposits() {
        return pendingDeposits;
    }

    public void setPendingDeposits(double pendingDeposits) {
        this.pendingDeposits = pendingDeposits;
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

    public double getCashCall() {
        return cashCall;
    }

    public void setCashCall(double cashCall) {
        this.cashCall = cashCall;
    }

    public double getLongNonMarginableMarketValue() {
        return longNonMarginableMarketValue;
    }

    public void setLongNonMarginableMarketValue(double longNonMarginableMarketValue) {
        this.longNonMarginableMarketValue = longNonMarginableMarketValue;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public double getShortOptionMarketValue() {
        return shortOptionMarketValue;
    }

    public void setShortOptionMarketValue(double shortOptionMarketValue) {
        this.shortOptionMarketValue = shortOptionMarketValue;
    }

    public double getBondValue() {
        return bondValue;
    }

    public void setBondValue(double bondValue) {
        this.bondValue = bondValue;
    }

    public double getCashDebitCallValue() {
        return cashDebitCallValue;
    }

    public void setCashDebitCallValue(double cashDebitCallValue) {
        this.cashDebitCallValue = cashDebitCallValue;
    }

    public double getUnsettledCash() {
        return unsettledCash;
    }

    public void setUnsettledCash(double unsettledCash) {
        this.unsettledCash = unsettledCash;
    }

    @Override
    public String toString() {
        return "CurrentBalances{" +
                "accruedInterest=" + accruedInterest +
                ", cashBalance=" + cashBalance +
                ", cashReceipts=" + cashReceipts +
                ", longOptionMarketValue=" + longOptionMarketValue +
                ", liquidationValue=" + liquidationValue +
                ", longMarketValue=" + longMarketValue +
                ", moneyMarketFund=" + moneyMarketFund +
                ", savings=" + savings +
                ", shortMarketValue=" + shortMarketValue +
                ", pendingDeposits=" + pendingDeposits +
                ", cashAvailableForTrading=" + cashAvailableForTrading +
                ", cashAvailableForWithdrawal=" + cashAvailableForWithdrawal +
                ", cashCall=" + cashCall +
                ", longNonMarginableMarketValue=" + longNonMarginableMarketValue +
                ", totalCash=" + totalCash +
                ", shortOptionMarketValue=" + shortOptionMarketValue +
                ", bondValue=" + bondValue +
                ", cashDebitCallValue=" + cashDebitCallValue +
                ", unsettledCash=" + unsettledCash +
                '}';
    }
}
