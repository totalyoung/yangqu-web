
<script type="text/javascript" src="../static/js/web/user/active.js"></script>
<div class="m-b-md">
    <form class="form-inline" role="form" id="searchForm"
          name="searchForm">
        <div class="form-group">
            <label class="control-label"> <span
                    class="h4 font-thin v-middle"></span></label> 注册时间&nbsp;<input
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
<#--<header class="panel-heading">-->
    <#--<div class="doc-buttons">-->
        <#--<c:forEach items="${res}" var="key">-->
        <#--${key.description}-->
        <#--</c:forEach>-->
    <#--</div>-->
<#--</header>-->
<div class="table-responsive">
    <div id="paging" class="pagclass"></div>
</div>

<div class="table-responsive">
    <div id="paging2" class="pagclass"></div>
</div>
