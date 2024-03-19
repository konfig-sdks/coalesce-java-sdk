package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://app.coalescesoftware.io";
        
        // Configure HTTP bearer authorization: BearerAuth
        configuration.token = "BEARER TOKEN";
        
        configuration.sec0  = "YOUR API KEY";
        Coalesce client = new Coalesce(configuration);
        assertNotNull(client);
    }
}
