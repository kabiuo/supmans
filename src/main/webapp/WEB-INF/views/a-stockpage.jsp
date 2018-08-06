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
<%--修改商品信息模态框--%>
<div class="modal fade" id="Modal_Update_Merch" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel1">修改商品库存信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="add-merchname-input" class="col-sm-2 control-label">商品名称</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchname" class="form-control" id="update-merchname-input"
                                   placeholder="商品名称">
                        </div>
                    </div>
                    <div class="form-group" style="display: none;">
                        <label for="add-merchaddress-input" class="col-sm-2 control-label">生产地</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchaddress" class="form-control" id="update-merchaddress-input"
                                   placeholder="生产地">
                        </div>
                    </div>
                    <div class="form-group" style="display: none;">
                        <label for="add-merchpd-input" class="col-sm-2 control-label">生产日期</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchpd" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                                   class="form-control" id="update-merchpd-input"
                                   placeholder="生产日期">
                        </div>
                    </div>
                    <div class="form-group" style="display: none;">
                        <label for="add-merchgp-input" class="col-sm-2 control-label">有效期</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchgp" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                                   class="form-control" id="update-merchgp-input"
                                   placeholder="有效期">
                        </div>
                    </div>
                    <div class="form-group" style="display: none;">
                        <label for="add-merchprice-input" class="col-sm-2 control-label">商品价格</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchprice" class="form-control" id="update-merchprice-input"
                                   placeholder="商品价格">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">商品类型</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="merchtype" id="update_merch_type"></select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchnumber-input" class="col-sm-2 control-label">商品数量</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchnumber" class="form-control" id="update-merchnumber-input"
                                   placeholder="商品数量">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="update-save-btn">修改</button>
            </div>
        </div>
    </div>
</div>
<%--新增商品模态框--%>
<div class="modal fade" id="Modal_Add_Merch" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增商品</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="add-merchname-input" class="col-sm-2 control-label">商品名称</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchname" class="form-control" id="add-merchname-input"
                                   placeholder="商品名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchaddress-input" class="col-sm-2 control-label">生产地</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchaddress" class="form-control" id="add-merchaddress-input"
                                   placeholder="生产地">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchpd-input" class="col-sm-2 control-label">生产日期</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchpd" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                                   class="form-control" id="add-merchpd-input"
                                   placeholder="生产日期">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchgp-input" class="col-sm-2 control-label">有效期</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchgp" onfocus="WdatePicker({isShowClear:false,readOnly:true});"
                                   class="form-control" id="add-merchgp-input"
                                   placeholder="有效期">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchprice-input" class="col-sm-2 control-label">商品价格</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchprice" class="form-control" id="add-merchprice-input"
                                   placeholder="商品价格">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">商品类型</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="merchtype" id="add_merch_type"></select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-merchnumber-input" class="col-sm-2 control-label">商品数量</label>
                        <div class="col-sm-10">
                            <input type="text" name="merchnumber" class="form-control" id="add-merchnumber-input"
                                   placeholder="商品数量">
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
                    class="my-icon nav-icon icon_1"></i><span style="left: 50px;position: relative;">管理员</span><i
                    class="my-icon nav-more"></i></a>
            <ul>
                <li>
                    <a style="text-decoration: none; color: white;" href="toadminpage.jsp"><span>员工信息管理</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="to-a-staffpage.jsp"><span>商品信息管理</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="to-a-soldpage.jsp"><span>商品销售管理</span></a>
                </li>
                <li>
                    <a style="text-decoration: none; color: white;" href="to-a-stockpage.jsp"><span>库存管理</span></a>
                </li>
            </ul>
        </li>
    </ul>
</div>
<div class="unnav">
    <h3 style="margin-top: 22px;text-align: center;color: white;">库存管理</h3>
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
            <a href="/staff/stockinfo">
                <button type="button" class="btn btn-info">查询全部库存记录</button>
            </a>
        </div>
    </div>
    <div class="col-md-12">
        <table class="table">
            <tr>
                <th>库存编号</th>
                <th>库存商品名称</th>
                <th>库存商品类型</th>
                <th>库存商品数量</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${stockInfo.list}" var="merch">
                <tr>
                    <td>${merch.merchid}</td>
                    <td>${merch.merchname}</td>
                    <td>${merch.type.typename}</td>
                    <td>${merch.merchnumber}</td>
                    <td>
                        <button class="btn btn-primary btn-sm update-btn" id="update-btn" href="${merch.merchid}">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                        </button>
                        <button class="btn btn-danger btn-sm" id="del-btn" href="${merch.merchid}">
                            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<script>
    $(function () {
        $(document).on("click", "#update-btn", function () {
            $("#update-save-btn").attr("edit-id", $(this).attr("href"));
            getDempts("#update_merch_type");
            getMerchInfo($(this).attr("href"));
            $("#Modal_Update_Merch").modal({
                backdrop: "static"
            });
        });
        $("#add-btn").click(function () {
            getDempts("#add_merch_type");
            $("#Modal_Add_Merch").modal({
                backdrop: "static"
            });
        });
    });
    $("#save-btn").click(function () {
        $.ajax({
            url: "/staff/savemerch",
            type: "POST",
            data: $("#Modal_Add_Merch form").serialize(),
            success: function (result) {
                alert(result.msg);
                $("#Modal_Add_Merch").modal('hide');
                // to_page(1);
                window.location.reload();
            }
        });
    });

    function to_page(pn) {
        $.ajax({
            url: "/staff/allinfo",
            data: "pn=" + pn,
            type: "POST",
            success: function () {
            }
        });
    }

    $(document).on("click", "#del-btn", function () {
        var merchid = $(this).attr("href");
        if (confirm("确认删除?")) {
            $.ajax({
                url: "/staff/deletemerch/" + merchid,
                type: "POST",
                success: function (result) {
                    alert(result.msg);
                    to_page(1);
                }
            });
        }
    });
    $(document).on("click", "#update-save-btn", function () {
        var merchidd = $(this).attr("edit-id");
        // alert(merchidd);
        $.ajax({
            url: "/staff/updateMerchinfo/" + merchidd,
            type: "POST",
            data: $("#Modal_Update_Merch form").serialize(),
            success: function (result) {
                alert(result.msg);
                $("#Modal_Update_Merch").modal('hide');
                window.location.reload();
                to_page(1);
            }
        });
    });

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

    function getMerchInfo(id) {
        // alert(id);
        $.ajax({
            url: "/staff/getmerchinfo/" + id,
            type: "POST",
            success: function (result) {
                console.assert(result);
                var MerchData = result.extend.MerchInfo;
                $("#update-merchname-input").val(MerchData.merchname);
                $("#update-merchaddress-input").val(MerchData.merchaddress);
                $("#update-merchpd-input").val(MerchData.merchpd);
                $("#update-merchgp-input").val(MerchData.merchgp);
                $("#update-merchprice-input").val(MerchData.merchprice);
                $("#update_merch_type").val([MerchData.merchtype]);
                $("#update-merchnumber-input").val(MerchData.merchnumber);
            }
        });
    }
</script>
</body>
</html>
