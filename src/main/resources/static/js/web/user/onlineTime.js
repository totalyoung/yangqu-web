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
                colkey : "accountId",
                name : "日期"
            }, {
                colkey : "vip",
                name : "在线时长（单位：分钟）"
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


