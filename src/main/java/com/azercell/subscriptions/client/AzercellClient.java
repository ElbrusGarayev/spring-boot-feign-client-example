package com.azercell.subscriptions.client;

import com.azercell.subscriptions.model.AzercellApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "AzercellClient", url = "https://f8e71008-5ad6-4b6f-82bf-bd117c59c947.mock.pstmn.io")
public interface AzercellClient {

    @GetMapping("/azercell/gw/subscription/v1/query/994501234567")
    AzercellApiResponse getSubscriptions();
}
