<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>会议管理系统</title>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
<!-- 引入font-awesome -->
<link rel="stylesheet" href="js/font-awesome-4.7.0/css/font-awesome.min.css"> 
<!-- bootstrap组件引入 -->
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="js/bootstrap.min.js" ></script>


<!-- easyui组件引入 -->
<script type="text/javascript"
	src="js/jquery-easyui-1.6.9/jquery.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.6.9/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.6.9/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.6.9/themes/material-teal/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.6.9/themes/icon.css" />


<style>
/* .easyui-layout *{-webkit-box-sizing: content-box;-moz-box-sizing: content-box;box-sizing: content-box;} */

          
</style>
</head>
<body>
<nav class="navbar navbar-default" style="margin-bottom: 0px;height:auto;">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <i class="fa fa-commenting-o fa-2x" aria-hidden="true"></i><a class="navbar-brand" href="#">会议管理系统</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link </a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
      <li><iframe width="300" scrolling="no" height="25" frameborder="0" allowtransparency="true" src="//i.tianqi.com/index.php?c=code&id=10&color=%230070C0&bdc=%23&icon=2&site=15"></iframe></li>
        <li><a href="#"><i class="fa fa-bell-o fa-2x" aria-hidden="true"></i><span class="badge">12</span></a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle-o fa-2x" aria-hidden="true"></i>${account_name} <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">账户信息</a></li>
            <li><a href="/scb.sms/Account/updatePWD">修改密码</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/scb.sms/quit">退出</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    <div id="cc" class="easyui-layout" style="width:100%;height:900px;">
	<!-- 上方标题栏 -->
    <%-- <div region="north" split="true"
		style="height: 60px; padding: 8px; background-color: /* #D1EEEE */#CED4DA">
       <span style="font-size: 22px; text-align: left">会议管理系统</span>
	   <span style="font-size: 18px; text-align: center">${account_name}</span>  
	</div> --%>
	
	
    <!-- 左侧导航菜单 -->
	<div region="west" style="width: 180px;background-color: #E6E6E6" title="导航菜单" split="true">

		<ul id="tree"></ul>
		
	</div>
    <!-- 中间iframe部分 -->
	<div region="center">
		<div class="easyui-tabs" id="tabs" fit="true" border="false" >
			<div title="首页"><iframe scrolling="auto" frameborder="0" src="userIndex" style="width:100%;height:100%;"></iframe></div>
		</div>
	</div>

    </div>

	<script>
		//此处是easyui调用tree组件的方法
		$('#tree').tree({
			url : 'menu/getAllMenu',
			//加载数据，将后台传入的json转化成easyui对应的json格式返回
			loadFilter : function(data) {
				return jsonbl(data);
			},
			lines : true,
			animate:true, //树的动画
			//点击事件
			onClick : function(node) {
				//如果已经存在一个该tabs标签，则不会再新增一个
				if ($("#tabs").tabs('exists', node.text)) {
					$('#tabs').tabs('select', node.text);
					$('#tabs').tabs('getSelected');
					return false;
				} 
				if (node.attributes) {
					//设置content为点击左侧菜单所引入的iframe，具体页面为菜单所对应的相关页面
					content = '<iframe name="content_frame" scrolling="auto" frameborder="0" src="' + node.attributes + '" style="width:100%;height:100%;"></iframe>'
				} else {
					content = '未设置路径';
				}
				//若不存在一个该tabs标签，则新增一个
		        $('#tabs').tabs('add', {
					title : node.text,//标签标题为左侧菜单栏名称
					closable : true,
					content : content //该标签所对应的具体内容
				});
			}
			
		});
		//此处是easyui的json格式
		var tree = {
			id : '',//菜单ID
			text : '',//菜单名称
			state : '',//菜单状态（open或close）
			checked : '',//(true或false)
			attributes : '',//自定义属性，这里用作存储菜单url
			children : ''//子菜单数据
		}
		//此处是把后台传过来的json数据转成easyui规定的格式
		function bl(menu) {
			var tree = new Object();
			tree.id = menu.menuId;
			tree.text = menu.menuName;
			tree.state = 'open';
			tree.checked = 'false';
			tree.attributes = menu.menuUrl;
			if (menu.children.length != 0) {//若有子菜单，则调用jsonbl方法获取子菜单
				tree.children = jsonbl(menu.children);
			} else {//若无子菜单，则将children设为空
				tree.children = [];
			}
			return tree;//转换格式后的json数据
		}
		//该方法用来获取子菜单，通过递归调用bl()来为子菜单各项属性赋值，从而将子菜单也转换成easyui规定的格式
		function jsonbl(data) {
			var easyTree = [];
			$.each(data, function(index, menu) {
				easyTree[index] = bl(menu);
			});
			return easyTree;
		}

		
	</script>

</body>
</html>