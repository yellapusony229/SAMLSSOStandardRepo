package com.zensar.cio;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.saml.provider.SamlServerConfiguration;
import org.springframework.security.saml.provider.service.config.SamlServiceProviderServerBeanConfiguration;

@Configuration
public class BeanConfig extends SamlServiceProviderServerBeanConfiguration {

	private final AppConfig config;

	public BeanConfig(AppConfig config) {
		this.config = config;
	}

	@Override
	protected SamlServerConfiguration getDefaultHostSamlServerConfiguration() {
		return config;
	}
}
