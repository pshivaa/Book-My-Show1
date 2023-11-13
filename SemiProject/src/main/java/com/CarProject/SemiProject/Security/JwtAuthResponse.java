package com.CarProject.SemiProject.Security;

import lombok.Data;
import java.util.*;

import com.CarProject.SemiProject.Entity.UserLogin;
import com.CarProject.SemiProject.Entity.UserRegister;

@Data
public class JwtAuthResponse {
	Optional<UserLogin> User=Optional.empty();
	UserRegister userRegisterData;
    private String auth;

}
