package com.zensar.cio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.saml.provider.provisioning.SamlProviderProvisioning;
import org.springframework.security.saml.provider.service.ServiceProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class ServiceProviderController {

	private static final Log logger =LogFactory.getLog(ServiceProviderController.class);
	private SamlProviderProvisioning<ServiceProviderService> provisioning;

	@Autowired
	public void setSamlService(SamlProviderProvisioning<ServiceProviderService> provisioning) {
		this.provisioning = provisioning;
	}

	@RequestMapping(value = {"/", "/index", "/logged-in"})
	public String home() {
		logger.info("Sample SP Application - You are logged in!");
		return "logged-in";
	}

}