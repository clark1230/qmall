<%--
  Created by IntelliJ IDEA.
  User: GIGABYTE
  Date: 2017/11/22
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div class="layui-fluid larry-wrapper">
    <div class="layui-row ">
        <div class="layui-col-lg12 layui-col-md12 layui-col-sm12 layui-col-xs12">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 0px;">
                <legend>操作</legend>
            </fieldset>
            <a class="layui-btn layui-btn-normal layui-btn-sm">添加品牌</a>
            <button class="layui-btn" id="reload">表格重载</button>
        </div>
        <div class="layui-col-lg12 layui-col-md12 layui-col-sm12 layui-col-xs12">
            <table class="layui-hide" id="brand"></table>
        </div>
    </div>
</div>
<script src="/layui/layui.js" charset="utf-8"></script>
<!--配置是否展示模板-->
<script type="text/html" id="isShowTpl">
    <input type="checkbox" name="isShow" value="{{d.isShow}}"
           lay-skin="switch" lay-text="关闭|展示" lay-filter="isShow" {{ d.isShow== 1 ? 'checked' : '' }}>
</script>
<!--配置品牌logo模板-->
<script type="text/html" id="logoTpl">
    <img src="{{d.brandLogo}}" height="50"width="100"/>
</script>
<!--配置操作模板-->
<script type="text/html" id="operateTpl">
    <a title="修改品牌信息" href="#" class="layui-btn layui-btn-normal layui-btn-sm"><i class="layui-icon">&#xe642;</i></a>
    <a title="删除品牌信息" href="#" class="layui-btn layui-btn-danger layui-btn-sm"><i class="layui-icon">&#xe640;</i></a>
</script>

<script>
    layui.use('table', function(){
        var table = layui.table,form=layui.form,$=layui.jquery;
        var brandTable = table.render({
            elem: '#brand'
            ,url:'/brand/ajaxData.action'
            ,id:'test'
            ,width: 'atuo'
            ,limits: [10,20,50,100]
            ,limit: 20 //默认采用60
            ,cols: [[
                {type:'checkbox', fixed: 'left'}
                ,{field:'brandId', title: '品牌编号', width:100}
                ,{field: 'brandName', title: '品牌名称', width:150}
                ,{field: 'brandLogo', title: 'LOGO', width:140,templet:'#logoTpl'}
                ,{field: 'brandDesc', title: '描述', width:200}
                ,{field: 'siteUrl', title: '网址', width: 200}
                ,{field: 'sortOrder', title: '品牌排序', width: 100}
                ,{field: 'isShow', title: '是否展示',align: 'center', width: 100,templet: '#isShowTpl'}
                ,{field:'operate',title:'操作',templet:'#operateTpl',width:120}
            ]]
            ,page: true
        });

        //监听是否展示操作
        form.on('switch(isShow)', function(obj){
            layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
        });

        //表格重载
        $('#reload').click(function(){
            console.log(brandTable);
            //alert('hah');
            brandTable.reload(
                {   //url:'/brand/ajaxData.action',
                    cols:[[
                        {field:'brandId', title: '品牌编号', width:100}
                    ]],
                    where:{
                        offset:1,
                        limit:1,
                        name:'jack'
                    }
                }
            );
        });
    });

</script>


</body>