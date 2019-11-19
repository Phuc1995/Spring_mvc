package com.laptrinhjavaweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
	
	/*
	 * @Bean public AuditorAware<String> auditorProvider() { return new
	 * AuditorAwareImpl(); }
	 */
	/*
	 * public static class AuditorAwareImpl implements AuditorAware<String> {
	 * 
	 * 
	 * @Override //get UserName public String getCurrentAuditor() { Authentication
	 * authentication = SecurityContextHolder.getContext().getAuthentication(); if
	 * (authentication == null) { return null; } return authentication.getName(); }
	 * }
	 */
}
