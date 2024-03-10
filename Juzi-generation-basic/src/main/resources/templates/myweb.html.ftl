<!DOCTYPE html>
<html lang="en">
<head>
    <title>鱼皮官网</title>
</head>
<body>

<h1>欢迎来到我的网站</h1>
<ul>
    <#-- 循环渲染导航条 -->
    <#list menuItems as item>
        <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>
<!-- 尾部区 -->
<footer>
    <#--    版权信息-->
   ${currentYear} 鱼皮官网. All rights reservered.
</footer>
</body>
</html>