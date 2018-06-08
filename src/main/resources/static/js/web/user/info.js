var pageii = null;
var grid = null;
$(function() {

    $("#search").click("click", function() {// 绑定查询按扭
        var searchParams = $("#searchForm").serializeJson();// 初始化传参数
        grid = lyGrid({
            //pagId : 'paging',
            l_column : [ {
                colkey : "userId",
                name : "用户Id"
            }, {
                colkey : "level",
                name : "等级"
            }, {
                colkey : "accountName",
                name : "登录名称"
            }, {
                colkey : "nickName",
                name : "角色名称"
            }, {
                colkey : "pay",
                name : "累计充值（元）"
            }, {
                colkey : "lastLoginIn",
                name : "最后登录时间"
            }],
            jsonUrl : rootPath + '/user/activeList.htm',
            checkbox : true,
            serNumber : true,
            usePage:false,
            data : searchParams
        });
        // grid.setOptions({
        //
        // });
    });


});


