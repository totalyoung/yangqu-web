<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Accordion - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="../static/jquery-easyui-1.5.5.2/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../static/jquery-easyui-1.5.5.2/themes/icon.css">
    <#--<link rel="stylesheet" type="text/css" href="../static/jquery-easyui-1.5.5.2/demo.css">-->
    <script type="text/javascript" src="../static/jquery-easyui-1.5.5.2/jquery.min.js"></script>
    <script type="text/javascript" src="../static/jquery-easyui-1.5.5.2/jquery.easyui.min.js"></script>
</head>
<body>

<div style="margin:20px 0;"></div>
<div class="easyui-layout" style="width:50%;height:350px;">
    <div data-options="region:'west'" title="West" style="width:100px;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div id ="0023" title="Title1" data-options="selected:true" style="overflow:auto;padding:10px;">
                <div id="222">
                    content44</div>
            </div>
            <div id ="Title2" title="Title2"  style="padding:10px;">
                content2
            </div>
            <div title="Title3" style="padding:10px">
                content3
            </div>
        </div>
    </div>
    <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
        <div><iframe id="002" src="../userinfo/100000001.htm" name="iframe_a"></iframe></div>

    </div>
</div>
<script>

$("#0023").click(function(){

    $("#002").attr("src","../userinfo/demo2");
})
</script>
</body>

</html>