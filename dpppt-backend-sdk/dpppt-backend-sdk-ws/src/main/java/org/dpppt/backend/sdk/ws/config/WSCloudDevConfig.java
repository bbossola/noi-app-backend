package org.dpppt.backend.sdk.ws.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud-dev")
public class WSCloudDevConfig extends WSCloudBaseConfig {
	@Value("${vcap.services.ecdsa_dev.credentials.privateKey}")
	private String privateKey;
	@Value("${vcap.services.ecdsa_dev.credentials.publicKey}")
    public String publicKey;
    
    @Override
    String getPrivateKey() {
        return privateKey;
    }
    @Override
    String getPublicKey() {
        return publicKey;
    }
}