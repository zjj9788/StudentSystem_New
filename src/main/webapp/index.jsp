<%@ page import="java.util.Date" contentType="text/html;charset=utf-8" %>
<html>
<link rel="stylesheet"
      href="other/node_modules/layui-src/dist/css/layui.css"/>
<link rel="stylesheet"
      href="other/node_modules/bootstrap3/dist/css/bootstrap.min.css"/>
<link rel="stylesheet"
      href="other/node_modules/bootstrap3/dist/css/bootstrap-theme.min.css"/>
<script type="text/javascript" src="other/node_modules/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="other/node_modules/layui-src/dist/layui.all.js"></script>
<script>
    function test() {
        layer.open({
            title: '用户登录',

            skin: 'layui-layer-lan',

            area : ['600px' , '480px'],
            content:'login.html'//弹框显示的url,对应的页面
        });
    }
    test();
</script>
<body>
<h2>Hello World!</h2>
<%=new Date()%>
</body>
</html>
