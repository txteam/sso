package com.tx.sso.auth.model;


 /**
  * <项目系统权限>
  * <功能详细描述>
  * 
  * @author  PengQingyang
  * @version  [版本号, 2012-10-5]
  * @see  [相关类/方法]
  * @since  [产品/模块版本]
  */
public class ProAuth extends Auth
{

    public ProAuth()
    {
        super();
        setType(TYPE_PROJECT);
    }
}
