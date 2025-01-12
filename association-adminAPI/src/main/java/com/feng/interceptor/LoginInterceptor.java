package com.feng.interceptor;

import com.feng.enums.ErroEnum;
import com.feng.exception.AuthenticationFailException;
import com.feng.service.UserSessionService;
import com.feng.util.UserTokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rf on 2019/4/23.
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserSessionService userSessionService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = UserTokenUtils.getUserToken(request);

        if (!StringUtils.isEmpty(token)) {
            boolean exist = userSessionService.isUserTokenExist(token);
            if (exist) {
                return true;
            }
        }

        throw new AuthenticationFailException(ErroEnum.USER_NOT_LOGIN);

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        /**
         * 更新用户session时间
         */
        String token = UserTokenUtils.getUserToken(request);
        userSessionService.updateUserSession(token);
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
