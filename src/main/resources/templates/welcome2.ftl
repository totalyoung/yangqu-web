<!DOCTYPE html>
<html lang="en" class="app">
<head>
<#include "common/header.ftl">
    <script type="text/javascript" src="../static/js/system/user/updatePassword.js"></script>
    <script type="text/javascript" src="../static/js/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">
        $(function () {
            //修改时间2015年10月13日14:32:57
            //修改在手机上点击菜单后菜单不关闭问题
            //修改人赵雷
            var winwidth = $("body").width();
            if (winwidth < 770) {
                $("#nav ul.lt li").click(function () {
                    $("#nav").removeClass("nav-off-screen");
                });
            }
            //---------修改人赵雷完毕----------
            var tb = $("#loadhtml");
            tb.html(CommnUtil.loadingImg());
            tb.load(rootPath + "/monitor/monitor.shtml");
            $("[nav-n]").each(function () {
                $(this).bind("click", function () {
                    var nav = $(this).attr("nav-n");
                    var sn = nav.split(",");
                    var html = '<li><i class="fa fa-home"></i>';
                    html += '<a href="index.shtml">Home</a></li>';
                    for (var i = 0; i < 2; i++) {
                        html += '<li><a href="javascript:void(0)">' + sn[i] + '</a></li>';
                    }
                    $("#topli").html(html);
                    var tb = $("#loadhtml");
                    tb.html(CommnUtil.loadingImg());
                    tb.load(rootPath + sn[2]);
                });
            });
        });
    </script>
</head>
<body class="" style="">
<section class="vbox">
    <header class="bg-dark dk header navbar navbar-fixed-top-xs">
        <div class="navbar-header aside-md">
            <a class="btn btn-link visible-xs"
               data-toggle="class:nav-off-screen,open" data-target="#nav,html">
                <i class="fa fa-bars"></i>
            </a>
        <div class="navbar-brand">足球后台系统</div>
            <a class="btn btn-link visible-xs" data-toggle="dropdown"
               data-target=".nav-user"> <i class="fa fa-cog"></i>
            </a>
        </div>
        <ul class="nav navbar-nav hidden-xs">

        </ul>
        <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
            <li class="hidden-xs"><a href="index.html#"
                                     class="dropdown-toggle dk" data-toggle="dropdown">
            </a>
                <section class="dropdown-menu aside-xl">
                    <section class="panel bg-white">
                    </section>
                </section>
            </li>


            <li class="dropdown"><a href="index.html#"
                                    class="dropdown-toggle" data-toggle="dropdown"> <span
                    class="thumb-sm avatar pull-left"> <img
                    src="/pbus/notebook/notebook_files/avatar.jpg">
					</span> admin <b class="caret"></b>
            </a>
                <ul class="dropdown-menu animated fadeInRight">
                    <span class="arrow top"></span>
                    <li><a href="#" onclick="javascript:updatePasswordLayer();">密码修改</a></li>
                    <li><a href="logout.shtml">Logout</a></li>
                </ul>
            </li>
        </ul>
    </header>
    <section>
        <section class="hbox stretch">
            <!-- .aside -->
            <aside class="bg-dark lter aside-md hidden-print hidden-xs" id="nav">
                <section class="vbox">
                    <section class="w-f scrollable">
                        <div class="slim-scroll" data-height="auto"
                             data-disable-fade-out="true" data-distance="0" data-size="5px"
                             data-color="#333333">
                            <!-- nav -->
                            <nav class="nav-primary hidden-xs">
                                <ul class="nav">

                                    <!-- <li class="active"> 某一项展开-->

                                    <!-- <li class="active"> 某一项展开-->


                                    <!-- <li class="active"> 某一项展开-->
                                    <li  class="active">
                                        <a
                                                href="javascript:void(0)"
                                        >      <span class="pull-right"> <i
                                                class="fa fa-angle-down text"></i> <i
                                                class="fa fa-angle-up text-active"></i>
												</span> <span>系统基础管理</span>
                                        </a>

                                        <ul class="nav lt">

                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,注册用户,/user/active"> <i
                                                    class="fa fa-angle-right"></i> <span>注册用户</span>
                                            </a></li>

                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,用户管理,/user/onlineTime"> <i
                                                    class="fa fa-angle-right"></i> <span>用户管理</span>
                                            </a></li>

                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,角色管理,/user/onlineNumber"> <i
                                                    class="fa fa-angle-right"></i> <span>角色管理</span>
                                            </a></li>

                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,菜单管理,/user/onlineAverage"> <i
                                                    class="fa fa-angle-right"></i> <span>菜单管理</span>
                                            </a></li>
                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,玩家等级,/user/level"> <i
                                                    class="fa fa-angle-right"></i> <span>玩家等级</span>
                                            </a></li>
                                            <li class="active"><a
                                                    href="javascript:void(0)"
                                                    class="active" nav-n="系统基础管理,用户基本信息,/user/info"> <i
                                                    class="fa fa-angle-right"></i> <span>用户基本信息</span>
                                            </a></li>

                                        </ul>
                                    </li>

                                    <!-- <li class="active"> 某一项展开-->

                                </ul>
                            </nav>
                            <!-- / nav -->
                        </div>
                    </section>
                    <footer class="footer lt hidden-xs b-t b-dark">
                        <div id="chat" class="dropup">
                            <section class="dropdown-menu on aside-md m-l-n">
                                <section class="panel bg-white">
                                    <header class="panel-heading b-b b-light">Active
                                        chats
                                    </header>
                                    <div class="panel-body animated fadeInRight">
                                        <p class="text-sm">No active chats.</p>
                                        <p>
                                            <a href="#" class="btn btn-sm btn-default">Start a chat</a>
                                        </p>
                                    </div>
                                </section>
                            </section>
                        </div>
                        <div id="invite" class="dropup">
                            <section class="dropdown-menu on aside-md m-l-n">
                                <section class="panel bg-white">
                                </section>
                            </section>
                        </div>
                    </footer>
                </section>
            </aside>
            <!-- /.aside -->
            <section id="content">
                <section id="id_vbox" class="vbox">
                    <ul class="breadcrumb no-border no-radius b-b b-light" id="topli">
                    </ul>
                    <section class="scrollable" style="margin-top: 35px;">
                        <div id="loadhtml"></div>
                    </section>
                </section>
            </section>
            <aside class="bg-light lter b-l aside-md hide" id="notes">
                <div class="wrapper">Notification</div>
            </aside>
        </section>
    </section>
</section>
<!-- Bootstrap -->
<div id="flotTip" style="display: none; position: absolute;"></div>


</body>
</html>