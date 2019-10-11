<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<shiro:principal/>，欢迎您！
[用户角色：<shiro:hasRole name="manager">admin</shiro:hasRole>
<shiro:hasRole name="user">普通用户</shiro:hasRole>
<shiro:hasRole name="cmanager">cmanager</shiro:hasRole>
<shiro:hasRole name="mmanager">mmanager</shiro:hasRole>
<shiro:hasRole name="xmanager">xmanager</shiro:hasRole>]
<br>
C模块
<ul>
    <shiro:hasPermission name="sys:c:save"><li>添加C</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:c:delete"><li>删除C</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:c:update"><li>修改C</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:c:find"><li>查询C</li></shiro:hasPermission>
</ul>
X模块
<ul>
    <shiro:hasPermission name="sys:x:save"><li>添加X</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:x:delete"><li>删除X</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:x:update"><li>修改X</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:x:find"><li>查询X</li></shiro:hasPermission>
</ul>
M模块
<ul>
    <shiro:hasPermission name="sys:m:save"><li>添加M</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:m:delete"><li>删除M</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:m:update"><li>修改M</li></shiro:hasPermission>
    <shiro:hasPermission name="sys:m:find"><li>查询M</li></shiro:hasPermission>
</ul>
</body>
</html>
