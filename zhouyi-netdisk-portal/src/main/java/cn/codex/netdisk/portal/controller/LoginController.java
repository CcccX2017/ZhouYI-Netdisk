package cn.codex.netdisk.portal.controller;

import cn.codex.netdisk.common.constants.Const;
import cn.codex.netdisk.common.dtos.LoginDto;
import cn.codex.netdisk.common.dtos.ServerResponse;
import cn.codex.netdisk.portal.dtos.RegisterDto;
import cn.codex.netdisk.portal.pojo.LoginUser;
import cn.codex.netdisk.portal.service.LoginService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 登录、注册、用户信息
 *
 * @author codex
 * @since 2021-02-12
 */
@Api(tags = "登录、注册、忘记密码、用户信息")
@RestController
@RequestMapping("/portal")
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "登录并返回token")
    @PostMapping("/login")
    public ServerResponse<Map<String, Object>> login(@RequestBody LoginDto loginDto) {
        // 获取令牌
        String token = loginService.login(loginDto);
        
        Map<String, Object> map = Maps.newHashMap();
        map.put("tokenHead", tokenHead);
        map.put("token", token);
        
        return ServerResponse.createBySuccess(Const.LOGIN_SUCCESS, map);
    }

    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ServerResponse<String> register(@RequestBody RegisterDto registerDto){
        return loginService.register(registerDto);
    }

    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "忘记密码")
    @PostMapping("/forgot")
    public ServerResponse<String> forgot(){
        return null;
    }

    @ApiOperationSupport(order = 4)
    @ApiOperation(value = "获取登录用户信息")
    @GetMapping("/userInfo")
    public ServerResponse<LoginUser> getLoginUserInfo(HttpServletRequest request){
        return loginService.getLoginUserInfo(request);
    }
}
