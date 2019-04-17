package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FinancingOption {

    @SerializedName("loan_term")
    @Expose
    private Integer loanTerm;
    @SerializedName("loan_apr")
    @Expose
    private Integer loanApr;
    @SerializedName("down_payment_percentage")
    @Expose
    private Integer downPaymentPercentage;

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public Integer getLoanApr() {
        return loanApr;
    }

    public void setLoanApr(Integer loanApr) {
        this.loanApr = loanApr;
    }

    public Integer getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(Integer downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

}
