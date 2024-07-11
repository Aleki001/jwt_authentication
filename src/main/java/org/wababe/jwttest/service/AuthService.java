package org.wababe.jwttest.service;

import org.wababe.jwttest.dtos.LoginDto;
import org.wababe.jwttest.dtos.RegisterDto;
import org.wababe.jwttest.models.User;

public interface AuthService {
    String login(LoginDto loginDto);
    public User signup(RegisterDto input);
}
