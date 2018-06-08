
<script src="../static/echarts/esl/esl.js"
        type="text/javascript"></script>
<script src="../static/echarts/echarts-all.js"
        type="text/javascript"></script>
<script type="text/javascript"
        src="../static/js/web/user/onlineAverage.js"></script>
<div class="m-b-md">
    <form class="form-inline" role="form" id="searchForm"
          name="searchForm">
        <div class="form-group">
            <label class="control-label"> <span
                    class="h4 font-thin v-middle"></span></label> 时间&nbsp;
            <input
                class="input-medium ui-autocomplete-input" id="minRegisterDate"
                name="minRegisterDate" onclick="WdatePicker()">
            -
            <input
                    class="input-medium ui-autocomplete-input" id="maxRegisterDate"
                    name="maxRegisterDate" onclick="WdatePicker()">
        </div>
        <a href="javascript:void(0)" class="btn btn-default" id="search">查询</a>
    </form>



</div>
<section class="panel panel-danger portlet-item">
    <header class="panel-heading">
        <i class="fa fa-fire"></i>
    </header>
    <div class="panel-body">
        <div id = "onlineNumber" value ="111"></div>
        <div id = "numbers" value =""></div>
        <div id="main" style="height: 370px;"></div>
    </div>
</section>
<div class="table-responsive">
    <div id="paging" class="pagclass"></div>
</div>

<div class="table-responsive">
    <div id="paging2" class="pagclass"></div>
</div>

<div class="row" style="padding-right: 8px; padding-left: 8px; padding-top: 8ps;">



</div>