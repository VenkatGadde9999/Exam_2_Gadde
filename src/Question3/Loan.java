/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Venkateswararao Gadde
 */
public class Loan {
        private int terms;
    private double loanAmount;
    private boolean isjoint;
    private String loanType;

    public Loan(int terms, double loanAmount, boolean isjoint, String loanType) {
        this.terms = terms;
        this.loanAmount = loanAmount;
        this.isjoint = isjoint;
        this.loanType = loanType;
    }

    @Override
    public String toString() {
        return "Loan{" + "terms=" + terms + ", loanAmount=" + loanAmount + ", isjoint=" + isjoint + ", loanType=" + loanType + '}';
    }



}
