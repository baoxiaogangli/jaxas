<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/easyui/themes/icon.css" />
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/jquery.easyui.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>

<body>
	>
<div style="margin: 10px 30px">
	
	  <div id="searchCarForm" style="padding: 10px">
	    
		  
		</div>

		<div style="margin-top: 10px">
			<table id="carDataGrid">

			</table>
		</div>
</div>
	<script type="text/javascript">
	$(function(){
	

		  
		  $("#carDataGrid").datagrid({
	  url : "staffController_list",
        title : 'deptemp',
        fitColumns : true, 
        striped : true,    
        rownumbers : true, 
        columns:[[{ 
          field : 'ename',  
          title : '姓名',
          width : 50,
          checkbox : true,
        
        }, {
          field : 'job',
          title : '职位',
          width : 50,
          
          sortable : true,
        }, {
         field : 'dname',
         title : '部门名称',
         width : 200,
         sortable : true,
       }, {
         field : 'loc',
         title : '部门所在地',
         width : 100,
         sortable :true,
       }, {
         field : 'sal',
         title : '工资',
         width : 100,
         sortable :true,
       }
       ]],
       pagination : true, 
       pageSize : 5,
       pageList : [5,10,15,20 ],
     sortName : "sal", 
       sortOrder : "desc", 
	});
	}); 
	  
	</script>
</body>
</html>
