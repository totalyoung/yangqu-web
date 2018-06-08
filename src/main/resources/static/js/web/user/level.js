$(function() {
    // <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
    // Step:3 echarts & zrender as a Global Interface by the echarts-plain.js.
    // Step:3 echarts和zrender被echarts-plain.js写入为全局接口
    //var onlineNumber = $("#onlineNumber").attr("value");
    //var numbers = JSON.parse($("#numbers").attr("value"));
    var myChart = echarts.init(document.getElementById('main'));
    option = {
        title : {
            text: '玩家等级'

        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['玩家等级']
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : ['1-10','11-20','21-30','31-40']
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
                name:'玩家等级',
                type:'line',
                data:[1,2,3],
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