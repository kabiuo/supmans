<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 85211
  Date: 2018/6/12
  Time: 11:37
  ile | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页</title>
    <link type="text/css" href="/static/css/nav.css" rel="stylesheet">
    <link type="text/css" href="/static/css/unnav.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/static/fonts/iconfont.css">
    <script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
    <link type="text/css" href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/static/js/nav.js"></script>
    <script src="/static/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
</head>
<body>
<%--修改销售记录模态框--%>
<div class="modal fade" id="Modal_edit_Sold" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新增商品销售记录</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="add_sold_type" class="col-sm-2 control-label">销售商品名称</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="soldnid" id="edit_sold_name"></select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchaddress-input" class="col-sm-2 control-label">销售商品数量</label>
                        <div class="col-sm-10">
                            <input type="text" name="soldnumber" class="form-control" id="edit-soldnumber-input"
                                   placeholder="销售商品数量">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchpd-input" class="col-sm-2 control-label">销售商品金额</label>
                        <div class="col-sm-10">
                            <input type="text" name="soldprice"
                                   class="form-control" id="edit-soldprice-input"
                                   placeholder="销售商品金额">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_sold_type" class="col-sm-2 control-label">销售商品类型</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="soldtid" id="edit_sold_type"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="edit-save-btn">保存</button>
            </div>
        </div>
    </div>
</div>
<%--新增销售记录模态框--%>
<div class="modal fade" id="Modal_Add_Sold" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增商品销售记录</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="add_sold_type" class="col-sm-2 control-label">销售商品名称</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="soldnid" id="add_sold_name"></select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchaddress-input" class="col-sm-2 control-label">销售商品数量</label>
                        <div class="col-sm-10">
                            <input type="text" name="soldnumber" class="form-control" id="add-merchaddress-input"
                                   placeholder="销售商品数量">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchpd-input" class="col-sm-2 control-label">销售商品金额</label>
                        <div class="col-sm-10">
                            <input type="text" name="soldprice"
                                   class="form-control" id="add-merchpd-input"
                                   placeholder="销售商品金额">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_sold_type" class="col-sm-2 control-label">销售商品类型</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="soldtid" id="add_sold_type"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="save-btn">保存</button>
            </div>
        </div>
    </div>
</div>
<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid #37c6c0"><img src="/static/images/mini.png"></div>
    </div>
    <ul>
        <li class="nav-item">
            <a style="text-decoration: none; color: white;" href="javascript:;"><i
                    class="my-icon nav-icon icon_1"></i><span style="left: 50px;position: relative;">员工</span><i
                    class="my-icon nav-more"></i></a>
            <ul>
                <c:if test="${param.isAdmin == 'admin'}">
                    <li>
                        <a style="text-decoration: none; color: white;" href="toadminpage.jsp"><span>员工信息管理</span></a>
                    </li>
                </c:if>
                <li>
                    <a style="text-decoration: none; color: white;" href="tohomepage.jsp"><span>商品信息管理</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="tosoldpage.jsp"><span>商品销售管理</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="tostockpage.jsp"><span>库存管理</span></a>
                </li>
            </ul>
        </li>
    </ul>
</div>
<div class="unnav">
    <h3 style="margin-top: 22px;text-align: center;color: white;">商品销售记录管理</h3>
    <div class="row" style="height: 6%;">
        <div class="col-md-8" style="top: 3px;position: relative;">
            <form class="form-inline">
                <div class="form-group" style="left: 50px; position: relative;">
                    <label for="merchid-input" style="color: white;">商品编号</label>
                    <input type="text" name="merchid" class="form-control" id="merchid-input" placeholder="商品编号">
                </div>
                <button style="left: 110px; position: relative;" type="submit" class="btn btn-info">查询</button>
            </form>
        </div>
        <div class="col-md-4" style="top: 3px;position: relative;">
            <a href="/staff/soldinfo"><button type="button" class="btn btn-info">查询全部商品销售记录</button></a>
            <button type="button" class="btn btn-info" id="add-btn">新增商品销售记录</button>
        </div>
    </div>
    <div class="col-md-12">
        <table class="table">
            <tr>
                <th>销售编号</th>
                <th>销售商品名称</th>
                <th>销售商品数量</th>
                <th>销售商品金额</th>
                <th>销售商品类型</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pageInfosold.list}" var="sold">
                <tr>
                    <td>${sold.soldid}</td>
                    <td>${sold.merch.merchname}</td>
                    <td>${sold.soldnumber}</td>
                    <td>${sold.soldprice}</td>
                    <td>${sold.type.typename}</td>
                    <td>
                        <button class="btn btn-primary btn-sm update-btn" id="edit-btn" href="${sold.soldid}">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                        </button>
                        <button class="btn btn-danger btn-sm" id="del-btn" href="${sold.soldid}">
                            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<script>
    $(document).on("click","#edit-btn",function () {
        $("#edit-save-btn").attr("edit_id",$(this).attr("href"));
        getMerchInfo("#edit_sold_name");
        getDempts("#edit_sold_type");
        getSoldInfo($(this).attr("href"));
        $("#Modal_edit_Sold").modal({
            backdrop: "static"
        });
    });
    $(function () {
        $(document).on("click","#del-btn",function () {
            var merchid = $(this).attr("href");
            if (confirm("确认删除?")) {
                $.ajax({
                    url: "/staff/delsold/" + merchid,
                    type: "POST",
                    success: function (result) {
                        alert(result.msg);
                        window.location.reload();
                    }
                });
            }
        });
    });
    //为新增商品销售记录按钮添加点击事件
    $(function () {
        $("#add-btn").click(function () {
            getMerchInfo("#add_sold_name");
            getDempts("#add_sold_type");
            $("#Modal_Add_Sold").modal({
                backdrop: "static"
            });
        });
    });

    $("#edit-save-btn").click(function () {
        var soldid = $(this).attr("edit_id");
        $.ajax({
            url: "/staff/updatesold/" + soldid,
            type: "POST",
            data: $("#Modal_edit_Sold form").serialize(),
            success: function (result) {
                alert(result.msg);
                $("#Modal_edit_Sold").modal('hide');
                window.location.reload();
            }
        });
    });

    function getSoldInfo(id) {
        // alert(id);
        $.ajax({
            url: "/staff/getsoldinfo/" + id,
            type: "POST",
            success: function (result) {
                // console.assert(result);
                var soldinfo = result.extend.soldinfo;
                $("#edit_sold_name").val([soldinfo.soldnid]);
                $("#edit-soldnumber-input").val(soldinfo.soldnumber);
                $("#edit-soldprice-input").val(soldinfo.soldprice);
                $("#edit_sold_type").val([soldinfo.soldtid]);
            }
        });
    }

    //获取商品信息
    function getMerchInfo(ele) {
        $(ele).empty();
        $.ajax({
            url: "/merch/allinfo",
            type: "POST",
            success: function (result) {
                // dept_add_select
                $.each(result.extend.merch, function (index, item) {
                    //添加获取到的部门信息，到模态框中
                    var optionEle = $("<option></option>").append(item.merchname).attr("value", item.merchid);
                    optionEle.appendTo(ele);
                });
            }
        });
    }

    //获取类型信息
    function getDempts(ele) {
        $(ele).empty();
        $.ajax({
            url: "/type/allinfo",
            type: "POST",
            success: function (result) {
                // dept_add_select
                $.each(result.extend.depts, function (index, item) {
                    //添加获取到的部门信息，到模态框中
                    var optionEle = $("<option></option>").append(item.typename).attr("value", item.typeid);
                    optionEle.appendTo(ele);
                });
            }
        });
    }

    //点击保存按钮，保存填入表单的数据
    $("#save-btn").click(function () {
        $.ajax({
            url: "/staff/savesold",
            type: "POST",
            data: $("#Modal_Add_Sold form").serialize(),
            success: function (result) {
                alert(result.msg);
                $("#Modal_Add_Sold").modal('hide');
                window.location.reload();
            }
        });
    });
</script>
</body>
</html>
