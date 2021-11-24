package com.arjun.badcode;

/* This is violating the Interface Segregation Principle as not every engineer is
 eligible for all the reimbursements and hence there is no need to inherit all
 the methods */

public interface Reimbursement {
    void laptopReimbursement();
    void transportReimbursement();
    void uniformReimbursement();
    void relocationReimbursement();
}
