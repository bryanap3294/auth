package com.bryan.promopack.Auth.service.impl;

import com.bryan.promopack.Auth.model.User;
import com.bryan.promopack.Auth.repository.UserRepository;
import com.bryan.promopack.Auth.service.CustomAuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomAuthenticationServiceImpl implements CustomAuthenticationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomAuthenticationServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication customToken(Authentication authentication) {
        String userName = (String) authentication.getPrincipal();
        String password = (String)authentication.getCredentials();
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        UsernamePasswordAuthenticationToken customToken = new UsernamePasswordAuthenticationToken(userName, null, grantedAuthorityList);
        User user = userRepository.findByUsernameAndPassword(userName, password);
        if(user!=null){
            return customToken;
        }else{
            return null;
        }
    }
}
