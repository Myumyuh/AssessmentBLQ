package com.rakapm.perpustakaan.service.impl;

import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rakapm.perpustakaan.config.ApplicationProperties;
import com.rakapm.perpustakaan.config.CloudProperties;
import com.rakapm.perpustakaan.service.GreetingService;
import com.rakapm.perpustakaan.web.HelloResources;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	Logger log = LoggerFactory.getLogger(GreetingServiceImpl.class);

	private ApplicationProperties appProperties;
	
	private CloudProperties cloudProperties;
	
	public GreetingServiceImpl(ApplicationProperties appProperties, CloudProperties cloudProperties) {
		super();
		this.appProperties = appProperties;
		this.cloudProperties = cloudProperties;
	}
	
	@Override
	public String sayGreeting() {
		log.debug("This is Log DEBUG");
		log.trace("This is Log TRACE");
		log.info("This is Log INFO");
		log.warn("This is Log WARN");
		log.error("This is Log ERROR");
		System.out.println(cloudProperties.getApiKey());
		// TODO Auto-generated method stub
		TimeZone timezone= TimeZone.getTimeZone(appProperties.getTimezone());
		return appProperties.getWelcomeText()+", Time Zone : "+timezone.getDisplayName()+", Currency : "+appProperties.getCurrency();
	}
	
}
