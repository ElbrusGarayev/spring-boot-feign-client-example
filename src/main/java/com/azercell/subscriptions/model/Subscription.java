package com.azercell.subscriptions.model;

import lombok.Data;

@Data
public class Subscription {

    private String activationChannel;

    private String lastRenewalDate;

    private String nextChargingDate;

    private String offer;

    private String startDate;

    private String state;

    private String subscriptionEndDate;

    private String subscriptionRequestDate;
}
