package com.vivekanandpv.behavioral.strategy;

public interface BillingStrategy {
    double getBillingPrice(Server server, int minutes);
}
