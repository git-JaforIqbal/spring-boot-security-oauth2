package com.in28minutes.rest.webservices.restfulwebservices.service;

import com.in28minutes.rest.webservices.restfulwebservices.entity.AppUser;
import com.in28minutes.rest.webservices.restfulwebservices.repository.AppUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;
import java.util.Optional;

public class DefaultUserDetailsService implements UserDetailsService {

    private final AppUserRepository appUserRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultUserDetailsService.class);

    public DefaultUserDetailsService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final Optional<AppUser> userEntity = appUserRepository.findById(username);
        LOGGER.info(username);
        if (userEntity.isPresent()) {
            final AppUser appUser = userEntity.get();

            return new User(appUser.getUserEmail(),
                    passwordNoEncoding(appUser),
                    Collections.singletonList(new SimpleGrantedAuthority(appUser.getUserRole())));
        }

        return null;
    }

    private String passwordNoEncoding(AppUser appUser) {
        // you can use one of bcrypt/noop/pbkdf2/scrypt/sha256
        // more: https://spring.io/blog/2017/11/01/spring-security-5-0-0-rc1-released#password-encoding
        return "{bcrypt}" + appUser.getUserPass();
    }
}
