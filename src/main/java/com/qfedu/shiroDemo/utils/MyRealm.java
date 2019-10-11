package com.qfedu.shiroDemo.utils;

import com.qfedu.shiroDemo.dao.PermissionDAO;
import com.qfedu.shiroDemo.dao.RoleDAO;
import com.qfedu.shiroDemo.dao.UserDAO;
import com.qfedu.shiroDemo.pojos.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private PermissionDAO permissionDAO;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String)principalCollection.iterator().next();

        //测试1111

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roleDAO.queryRolesByUserName(username));
        info.setStringPermissions(permissionDAO.queryPermissionByUserName(username));

        return info;
    }


    /**
     * 验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());

        String md5Password = new SimpleHash("md5", password).toHex();

        User user = userDAO.queryUserByName(username);
        if (user == null){
            throw new UnknownAccountException("账号不存在！");
        }else if (!user.getPwd().equals(md5Password)){
            throw new IncorrectCredentialsException("密码错误");
        }

        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
