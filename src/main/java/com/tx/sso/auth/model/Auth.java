package com.tx.sso.auth.model;


 /**
  * <权限实体类>
  * <功能详细描述>
  * 
  * @author  PengQingyang
  * @version  [版本号, 2012-10-5]
  * @see  [相关类/方法]
  * @since  [产品/模块版本]
  */
public class Auth
{
    /** 权限类型：操作权限 */
    public static final String TYPE_OPERATE = "1";
    
    /** 权限类型：项目权限 */
    public static final String TYPE_PROJECT = "2";
    
    /** 权限ID */
    private String id;
    
    /** 上级权限id */
    private String parentId = "-1";
    
    /** 权限编码 */
    private String code;
    
    /** 权限名 */
    private String name;
    
    /** 权限描述 */
    private String descInfo;
    
    /** 是否有效 */
    private String isValid;
    
    /** 权限类型 */
    private String type = TYPE_OPERATE;

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
     * @return 返回 parentId
     */
    public String getParentId()
    {
        return parentId;
    }

    /**
     * @param 对parentId进行赋值
     */
    public void setParentId(String parentId)
    {
        this.parentId = parentId;
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
     * @return 返回 descInfo
     */
    public String getDescInfo()
    {
        return descInfo;
    }

    /**
     * @param 对descInfo进行赋值
     */
    public void setDescInfo(String descInfo)
    {
        this.descInfo = descInfo;
    }

    /**
     * @return 返回 isValid
     */
    public String getIsValid()
    {
        return isValid;
    }

    /**
     * @param 对isValid进行赋值
     */
    public void setIsValid(String isValid)
    {
        this.isValid = isValid;
    }

    /**
     * @return 返回 type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param 对type进行赋值
     */
    public void setType(String type)
    {
        this.type = type;
    }
}
