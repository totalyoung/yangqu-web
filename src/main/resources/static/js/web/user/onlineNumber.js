$(function() {
    // <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
    // Step:3 echarts & zrender as a Global Interface by the echarts-plain.js.
    // Step:3 echarts和zrender被echarts-plain.js写入为全局接口
    var onlineNumber = $("#onlineNumber").attr("value");
    var numbers = JSON.parse($("#numbers").attr("value"));
    var myChart = echarts.init(document.getElementById('main'));
    option = {
        title : {
            text: '在线人数：'+onlineNumber

        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['在线人数']
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : ['0:00','1:00','2:00','3:00','4:00','5:00','6:00','7:00','8:00','9:00','10:00','11:00','12:00','13:00','14:00','15:00','16:00','17:00','18:00','19:00','20:00','21:00','22:00','23:00']
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
                name:'在线人数',
                type:'line',
                data:numbers,
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

        ]
    };
    myChart.setOption(option);

});