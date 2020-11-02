package com.azercell.subscriptions.model;

import lombok.Data;

import java.util.List;

@Data
public class AzercellApiResponse {

    private List<Subscription> subscriptions;
}
