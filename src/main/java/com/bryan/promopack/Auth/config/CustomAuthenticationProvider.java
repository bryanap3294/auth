package com.bryan.promopack.Auth.config;

import com.bryan.promopack.Auth.service.CustomAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomAuthenticationProvider.class);

	@Autowired
	private CustomAuthenticationService customAuthenticationService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Authentication auth;
		auth= this.customAuthenticationService.customToken(authentication);
		return auth;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(
		          UsernamePasswordAuthenticationToken.class);
	}

}
