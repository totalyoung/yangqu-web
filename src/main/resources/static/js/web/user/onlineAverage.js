var pageii = null;
var grid = null;
$(function() {

    $("#search").click("click", function() {// 绑定查询按扭
        var onlineNumber = $("#onlineNumber").attr("value");
        //var numbers = JSON.parse($("#numbers").attr("value"));
        var myChart = echarts.init(document.getElementById('main'));
        option = {
            title : {
                text: '平均在线时长',
                subtext: '单位：分钟'
            },
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['最高在线人数','最低在线人数']
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : false,
                    data : ['06-06','06-07','06-08','06-09','06-10','06-11','06-12']
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value}'
                    }
                }
            ],
            series : [
                {
                    name:'最高在线人数',
                    type:'line',
                    data:[11, 11, 15, 13, 12, 13, 10],
                    markPoint : {
                        data : [
                            {type : 'max', name: '最大值'},
                            {type : 'min', name: '最小值'}
                        ]
                    },
                    markLine : {
                        data : [
                            {type : 'average', name: '平均值'}
                        ]
                    }
                },
                {
                    name:'最低在线人数',
                    type:'line',
                    data:[1, -2, 2, 5, 3, 2, 0],
                    markPoint : {
                        data : [
                            {name : '周最低', value : -2, xAxis: 1, yAxis: -1.5}
                        ]
                    },
                    markLine : {
                        data : [
                            {type : 'average', name : '平均值'}
                        ]
                    }
                }
            ]
        };

        myChart.setOption(option);
        var searchParams = $("#searchForm").serializeJson();// 初始化传参数
        grid = lyGrid({
            //pagId : 'paging',
            l_column : [  {
                colkey : "date",
                name : "日期"
            }, {
                colkey : "onlineTime",
                name : "平均在线时长（单位：分钟）"
            }],
            jsonUrl : rootPath + '/user/activeList.htm',
            checkbox : true,
            serNumber : true,
            usePage:false,
            data : searchParams
        });

    });


});