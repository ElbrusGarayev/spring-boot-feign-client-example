package com.azercell.subscriptions.service.impl;

import com.azercell.subscriptions.client.AzercellClient;
import com.azercell.subscriptions.model.AzercellApiResponse;
import com.azercell.subscriptions.service.AzercellService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AzercellServiceImpl implements AzercellService {

    private final AzercellClient azercellClient;

    @Override
    public AzercellApiResponse getBody() {
        AzercellApiResponse apiResponse = azercellClient.getSubscriptions();
        return apiResponse;
    }
}
