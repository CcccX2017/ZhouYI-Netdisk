package cn.codex.netdisk.common.constants;

/**
 * 定义系统常量
 *
 * @author CodeX
 * @since 2020-11-03 22:00:49
 */
public class Const {
    /**
     * 虚拟目录
     */
    public static final String VIRTUAL_DIRECTORY = "/rs/";
    
    public static final String CUSTOMER = "普通用户";
    
    public static final String REGULAR_MEMBERS = "普通会员";
    
    public static final String SUPER_MEMBERS = "超级会员";
    
    /**
     * 验证码key
     */
    public static final String CAPTCHA_KEY = "captcha_key_";
    
    /**
     * 验证码有效期（分钟）
     */
    public static final Integer CAPTCHA_EXPIRATION = 10;
    
    /**
     * 验证码错误
     */
    public static final String CAPTCHA_ERROR = "验证码错误";
    
    /**
     * 验证码已失效
     */
    public static final String CAPTCHA_EXPIRE = "验证码已失效";
    
    /**
     * 用户信息key
     */
    public static final String LOGIN_USER_KEY = "login_user_key";
    
    /**
     * 登录用户token key
     */
    public static final String LOGIN_TOKEN_KEY = "login_token_";
    
    /**
     * 用户名或密码错误
     */
    public static final String USERNAME_PASSWORD_ERROR = "用户名不存在或密码错误";
    
    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "登录成功";
}
