<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>会议管理系统</title>
<!-- bootstrap组件引入 -->
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
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
	href="js/jquery-easyui-1.6.9/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.6.9/themes/icon.css" />

</head>
<body class="easyui-layout">
    
	<!-- 上方标题栏 -->
	<div region="north" split="true"
		style="height: 60px; font-size: 26px; text-align: center; padding: 8px; background-color: #D1EEEE">会议管理系统</div>
    <!-- 左侧导航菜单 -->
	<div region="west" style="width: 180px;background-color: #E6E6E6" title="导航菜单" split="true">

		<ul id="tree"></ul>
		
	</div>
    <!-- 中间iframe部分 -->
	<div region="center">
		<div class="easyui-tabs" id="tabs" fit="true" border="false" >
			<div title="首页">主页面内容</div>
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
					content = '<iframe scrolling="auto" frameborder="0" src="' + node.attributes + '" style="width:100%;height:100%;"></iframe>'
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