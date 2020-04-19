package com.investmeinc.fs.domain.tDAmeritrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TDAmeritradeResponse {

    @JsonProperty("securitiesAccount")
    private SecuritiesAccount securitiesAccount;

    public TDAmeritradeResponse() {
    }

    public TDAmeritradeResponse(SecuritiesAccount securitiesAccount) {
        this.securitiesAccount = securitiesAccount;
    }

    public SecuritiesAccount getSecuritiesAccount() {
        return securitiesAccount;
    }

    public void setSecuritiesAccount(SecuritiesAccount securitiesAccount) {
        this.securitiesAccount = securitiesAccount;
    }

    @Override
    public String toString() {
        return "TDAmeritradeResponse{" +
                "securitiesAccount=" + securitiesAccount +
                '}';
    }
}
