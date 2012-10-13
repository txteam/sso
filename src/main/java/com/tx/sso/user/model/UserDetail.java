package com.tx.sso.user.model;

import java.util.List;
import java.util.Map;

import com.tx.sso.auth.model.Auth;


 /**
  * 用户详情
  * 
  * @author  PengQingyang
  * @version  [版本号, 2012-10-5]
  * @see  [相关类/方法]
  * @since  [产品/模块版本]
  */
public class UserDetail
{
    /** 用户ID，唯一键 */
    private String id;
    
    /** 用户工号 */
    private String code;
    
    /** 登录名 */
    private String loginname;
    
    /** 登录密码 */
    private String password;
    
    /** 用户姓名 */
    private String name;
    
    /** 用户其他信息 */
    private Map<String, String> userInfo;
    
    /** 权限列表 */
    private List<Auth> authList;

    /**
     * @return 返回 id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param 对id进行赋值
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return 返回 code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @param 对code进行赋值
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * @return 返回 loginname
     */
    public String getLoginname()
    {
        return loginname;
    }

    /**
     * @param 对loginname进行赋值
     */
    public void setLoginname(String loginname)
    {
        this.loginname = loginname;
    }

    /**
     * @return 返回 password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param 对password进行赋值
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return 返回 name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param 对name进行赋值
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return 返回 userInfo
     */
    public Map<String, String> getUserInfo()
    {
        return userInfo;
    }

    /**
     * @param 对userInfo进行赋值
     */
    public void setUserInfo(Map<String, String> userInfo)
    {
        this.userInfo = userInfo;
    }

    /**
     * @return 返回 authList
     */
    public List<Auth> getAuthList()
    {
        return authList;
    }

    /**
     * @param 对authList进行赋值
     */
    public void setAuthList(List<Auth> authList)
    {
        this.authList = authList;
    }
}
