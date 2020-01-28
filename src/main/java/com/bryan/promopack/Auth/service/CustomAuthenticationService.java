package com.bryan.promopack.Auth.service;

import org.springframework.security.core.Authentication;

public interface CustomAuthenticationService {

    Authentication customToken(Authentication authentication);
}
