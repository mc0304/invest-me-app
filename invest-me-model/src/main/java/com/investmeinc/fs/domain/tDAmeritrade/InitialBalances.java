package com.investmeinc.fs.domain.tDAmeritrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialBalances {

    @JsonProperty("accruedInterest")
    private double accruedInterest;
    @JsonProperty("cashAvailableForTrading")
    private double cashAvailableForTrading;
    @JsonProperty("cashAvailableForWithdrawal")
    private double cashAvailableForWithdrawal;
    @JsonProperty("cashBalance")
    private double cashBalance;
    @JsonProperty("bondValue")
    private double bondValue;
    @JsonProperty("cashReceipts")
    private double cashReceipts;
    @JsonProperty("liquidationValue")
    private double liquidationValue;
    @JsonProperty("longOptionMarketValue")
    private double longOptionMarketValue;
    @JsonProperty("longStockValue")
    private double longStockValue;
    @JsonProperty("moneyMarketFund")
    private double moneyMarketFund;
    @JsonProperty("mutualFundValue")
    private double mutualFundValue;
    @JsonProperty("shortOptionMarketValue")
    private double shortOptionMarketValue;
    @JsonProperty("shortStockValue")
    private double shortStockValue;
    @JsonProperty("isInCall")
    private boolean isInCall;
    @JsonProperty("unsettledCash")
    private double unsettledCash;
    @JsonProperty("cashDebitCallValue")
    private double cashDebitCallValue;
    @JsonProperty("pendingDeposits")
    private double pendingDeposits;
    @JsonProperty("accountValue")
    private double accountValue;

    public InitialBalances() {
    }

    public InitialBalances(double accruedInterest, double cashAvailableForTrading, double cashAvailableForWithdrawal, double cashBalance, double bondValue, double cashReceipts, double liquidationValue, double longOptionMarketValue, double longStockValue, double moneyMarketFund, double mutualFundValue, double shortOptionMarketValue, double shortStockValue, boolean isInCall, double unsettledCash, double cashDebitCallValue, double pendingDeposits, double accountValue) {
        this.accruedInterest = accruedInterest;
        this.cashAvailableForTrading = cashAvailableForTrading;
        this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
        this.cashBalance = cashBalance;
        this.bondValue = bondValue;
        this.cashReceipts = cashReceipts;
        this.liquidationValue = liquidationValue;
        this.longOptionMarketValue = longOptionMarketValue;
        this.longStockValue = longStockValue;
        this.moneyMarketFund = moneyMarketFund;
        this.mutualFundValue = mutualFundValue;
        this.shortOptionMarketValue = shortOptionMarketValue;
        this.shortStockValue = shortStockValue;
        this.isInCall = isInCall;
        this.unsettledCash = unsettledCash;
        this.cashDebitCallValue = cashDebitCallValue;
        this.pendingDeposits = pendingDeposits;
        this.accountValue = accountValue;
    }

    public double getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(double accruedInterest) {
        this.accruedInterest = accruedInterest;
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

    public double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public double getBondValue() {
        return bondValue;
    }

    public void setBondValue(double bondValue) {
        this.bondValue = bondValue;
    }

    public double getCashReceipts() {
        return cashReceipts;
    }

    public void setCashReceipts(double cashReceipts) {
        this.cashReceipts = cashReceipts;
    }

    public double getLiquidationValue() {
        return liquidationValue;
    }

    public void setLiquidationValue(double liquidationValue) {
        this.liquidationValue = liquidationValue;
    }

    public double getLongOptionMarketValue() {
        return longOptionMarketValue;
    }

    public void setLongOptionMarketValue(double longOptionMarketValue) {
        this.longOptionMarketValue = longOptionMarketValue;
    }

    public double getLongStockValue() {
        return longStockValue;
    }

    public void setLongStockValue(double longStockValue) {
        this.longStockValue = longStockValue;
    }

    public double getMoneyMarketFund() {
        return moneyMarketFund;
    }

    public void setMoneyMarketFund(double moneyMarketFund) {
        this.moneyMarketFund = moneyMarketFund;
    }

    public double getMutualFundValue() {
        return mutualFundValue;
    }

    public void setMutualFundValue(double mutualFundValue) {
        this.mutualFundValue = mutualFundValue;
    }

    public double getShortOptionMarketValue() {
        return shortOptionMarketValue;
    }

    public void setShortOptionMarketValue(double shortOptionMarketValue) {
        this.shortOptionMarketValue = shortOptionMarketValue;
    }

    public double getShortStockValue() {
        return shortStockValue;
    }

    public void setShortStockValue(double shortStockValue) {
        this.shortStockValue = shortStockValue;
    }

    public boolean isInCall() {
        return isInCall;
    }

    public void setInCall(boolean inCall) {
        isInCall = inCall;
    }

    public double getUnsettledCash() {
        return unsettledCash;
    }

    public void setUnsettledCash(double unsettledCash) {
        this.unsettledCash = unsettledCash;
    }

    public double getCashDebitCallValue() {
        return cashDebitCallValue;
    }

    public void setCashDebitCallValue(double cashDebitCallValue) {
        this.cashDebitCallValue = cashDebitCallValue;
    }

    public double getPendingDeposits() {
        return pendingDeposits;
    }

    public void setPendingDeposits(double pendingDeposits) {
        this.pendingDeposits = pendingDeposits;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    @Override
    public String toString() {
        return "InitialBalances{" +
                "accruedInterest=" + accruedInterest +
                ", cashAvailableForTrading=" + cashAvailableForTrading +
                ", cashAvailableForWithdrawal=" + cashAvailableForWithdrawal +
                ", cashBalance=" + cashBalance +
                ", bondValue=" + bondValue +
                ", cashReceipts=" + cashReceipts +
                ", liquidationValue=" + liquidationValue +
                ", longOptionMarketValue=" + longOptionMarketValue +
                ", longStockValue=" + longStockValue +
                ", moneyMarketFund=" + moneyMarketFund +
                ", mutualFundValue=" + mutualFundValue +
                ", shortOptionMarketValue=" + shortOptionMarketValue +
                ", shortStockValue=" + shortStockValue +
                ", isInCall=" + isInCall +
                ", unsettledCash=" + unsettledCash +
                ", cashDebitCallValue=" + cashDebitCallValue +
                ", pendingDeposits=" + pendingDeposits +
                ", accountValue=" + accountValue +
                '}';
    }
}
