package org.ensas.securityBrains.security;

import org.ensas.securityBrains.dao.UserRepository;
import org.ensas.securityBrains.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	User user =	userRepository.findByUsername(username);
	if(user!=null) {
		
	
	return new MyUserDetails(user);
	}else {
		throw new UsernameNotFoundException("user not found");
	}
	}

}
