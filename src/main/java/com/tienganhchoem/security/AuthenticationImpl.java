package com.tienganhchoem.security;

import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.service.IUserService;
import com.tienganhchoem.service.impl.UserService;
import com.tienganhchoem.utils.SessionUtil;

import javax.servlet.http.HttpServletRequest;

public class AuthenticationImpl implements AuthenticationFilter {
    private IUserService userService;

    private String name;
    private String pass;

    public AuthenticationImpl(String name, String pass) {
        this.name = name;
        this.pass = pass;
        userService = new UserService();
    }
    @Override
    public String urlRedirect(HttpServletRequest request) {

        UserModel model = userService.findByUserNameAndPasswordAndStatus(this.name, this.pass, 1);
        if (model != null) {
            SessionUtil.getInstance().putValue(request, "USERMODEL", model);
            if (model.getRole().getCode().equals("USER")) {
                return "/trang-chu";
            } else if (model.getRole().getCode().equals("ADMIN")||model.getRole().getCode().equals("TEACHER")) {
                return "/admin-home?action=statistical";
            }
        } else {
            return "/dang-nhap?action=loginFalse";
        }
        return null;
    }
}
