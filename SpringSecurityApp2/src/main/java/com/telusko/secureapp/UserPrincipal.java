package com.telusko.secureapp;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {
	
	private SpringSecurity springSecurity;

	public UserPrincipal(SpringSecurity springSecurity) {
		super();
		this.springSecurity = springSecurity;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 
		return Collections.singleton(new SimpleGrantedAuthority("SpringSecurity"));
	}

	@Override
	public String getPassword() {
		
		return springSecurity.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return springSecurity.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
