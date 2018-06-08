var pageii = null;
var grid = null;
$(function() {

    $("#search").click("click", function() {// 绑定查询按扭
        var searchParams = $("#searchForm").serializeJson();// 初始化传参数
        grid = lyGrid({
            //pagId : 'paging',
            l_column : [ {
                colkey : "userId",
                name : "日期"
            }, {
                colkey : "accountId",
                name : "新增用户"
            }, {
                colkey : "vip",
                name : "日活跃数量"
            }, {
                colkey : "gold",
                name : "次日留存",
            }, {
                colkey : "ST",
                name : "7日留存",
            }, {
                colkey : "BP",
                name : "30日留存",
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

    $("#giveCoupon").click("click", function() {
        giveCoupon();
    });
    $("#editFun").click("click", function() {
        editAccount();
    });
});

function giveCoupon() {
    var cbox = grid.getSelectedCheckbox();
    if (cbox == "") {
        layer.msg("请选择赠送人");
        return;
    }
    pageii = layer.open({
        title : "编辑",
        type : 2,
        area : [ "600px", "80%" ],
        content : rootPath + '/coupon/addUI.shtml?ids=' + cbox.join(",")
    });
}


function editAccount() {
    var cbox = grid.getSelectedCheckbox();
    if (cbox.length > 1 || cbox == "") {
        layer.msg("只能选中一个");
        return;
    }
    pageii = layer.open({
        title : "编辑",
        type : 2,
        area : [ "600px", "80%" ],
        content : rootPath + '/wechatuser/editUI.shtml?id=' + cbox
    });
}
