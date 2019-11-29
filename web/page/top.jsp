<%--
  Created by IntelliJ IDEA.
  User: Cwolf9
  Date: 2019/11/19
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<meta charset="utf-8">
<!-- ZUI 标准版压缩后的 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/zui/1.9.1/css/zui.min.css">

<!-- ZUI Javascript 依赖 jQuery -->
<script src="//cdn.bootcss.com/zui/1.9.1/lib/jquery/jquery.js"></script>
<!-- ZUI 标准版压缩后的 JavaScript 文件 -->
<script src="//cdn.bootcss.com/zui/1.9.1/js/zui.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/statics/css/zui.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/statics/css/font-awesome.min.css">
<style>
    .circle-img_{
        border-radius: 100%;vertical-align: middle;border: 0;box-sizing: border-box;
        line-height: 40px;cursor: pointer;text-align: -webkit-match-parent;
        height: 40px;float: left;
    }
    .mytop_bar{
        height: 40px;
        width: 100%;z-index: 900;position: relative;
        display: block;
        outline: 0;
        list-style: none;
        box-sizing: border-box;
        box-shadow: 0px 0px 0px 3px #93a1a1;}
</style>

<div class="mytop_bar">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- 导航头部 -->
            <div class="navbar-header">
                <!-- 移动设备上的导航切换按钮 -->
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target=".navbar-collapse-example">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- 品牌名称或logo -->
                <a class="navbar-brand" href="#">BookCity</a>
            </div>
            <!-- 导航项目 -->
            <div class="collapse navbar-collapse navbar-collapse-example">
                <!-- 一般导航项目 -->
                <ul class="nav navbar-nav">
                    <li><a href="${pageContext.servletContext.contextPath}/page/welcome.jsp"><i class="icon icon-th"></i>&nbsp;首页</a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/person.do" target="_self"><i
                            class="icon icon-user"></i>个人资料</a></li>
                    <!-- 导航中的下拉菜单 -->
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon icon-qq"></i>用户管理 <b
                                class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="${pageContext.servletContext.contextPath}/findAll.do">查询用户</a></li>
                            <li><a href="${pageContext.servletContext.contextPath}/page/save.jsp">添加用户</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon icon-list-ul"></i>书籍管理 <b
                                class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="${pageContext.servletContext.contextPath}/findAllbook.do">查询书籍</a></li>
                            <li><a href="${pageContext.servletContext.contextPath}/page/savebook.jsp">添加书籍</a></li>
                        </ul>
                    </li>
                    <li><a href="${pageContext.servletContext.contextPath}/orders.do?single=0"><i class="icon icon-book"></i>订单管理</a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/adminers.do"><i class="icon icon-user"></i>系统管理</a></li>
                </ul>
                <!-- 右侧的导航项目 -->
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown active">
                        <img src="${pageContext.servletContext.contextPath}/statics/imgs/admin0.jpg" class="circle-img_" alt="">
                        <a href="#" style="float: left;" class="dropdown-toggle " data-toggle="dropdown">
                            欢迎管理员【${u.name}】登录
                            <b class="caret" style="margin-left: 5px;"></b></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="${pageContext.servletContext.contextPath}/page/avatar.jsp" target="_self">更换头像</a></li>
                            <li><a onclick="AdminLogout()" target="_self">退出 </a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- END .navbar-collapse -->
        </div>
    </nav>
    <%--<script src="${pageContext.servletContext.contextPath}/zui/lib/bootbox/bootbox.js" type="text/javascript" charset="utf-8"></script>--%>
    <script src="${pageContext.servletContext.contextPath}/statics/js/md5.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/statics/js/bg.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/statics/js/changeTitle.js"></script>
</div>
<script>
    function AdminLogout() {
        bootbox.confirm({
            message: "确定要退出后台系统吗?",
            buttons: {
                confirm: {
                    label: '确定',
                    className: 'btn-success'
                },
                cancel: {
                    label: '取消',
                    className: 'btn-danger'
                }
            },
            callback: function (result) {
                if (result) {//确定删除数据
                    window.location.href = "${pageContext.servletContext.contextPath}/adminlogout.do";
                }
            }
        });
    }
</script>
