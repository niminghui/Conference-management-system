
function xiugai() {

	if(document.getElementById("xiugaiAndChexiaoId").value == "修改") {

		document.getElementById("shanchuId").style.visibility = "hidden";
		document.getElementById("tijiaoxiugaiId").style.visibility = "visible";
		document.getElementById("xiugaiAndChexiaoId").value = "放弃修改";
		document.getElementsByClassName("departmentInput1")[0].disabled = "";
		document.getElementsByClassName("departmentInput1")[1].disabled = "";
		document.getElementsByClassName("departmentInput1")[2].disabled = "";
		document.getElementsByClassName("departmentInput1")[3].disabled = "";
		document.getElementsByClassName("departmentInput1")[4].disabled = "";
		document.getElementById("inDepartmentDetail").disabled = "";

		document.getElementsByClassName("inputDep")[0].style.display = "none";
		document.getElementsByClassName("selectDep")[0].style.display = "inline-block";

		document.getElementsByClassName("departmentInput1")[0].style.borderBottom = "1px solid black";
		document.getElementsByClassName("departmentInput1")[1].style.borderBottom = "1px solid black";
		document.getElementsByClassName("departmentInput1")[2].style.borderBottom = "1px solid black";
		document.getElementsByClassName("departmentInput1")[3].style.borderBottom = "1px solid black";
		document.getElementsByClassName("departmentInput1")[4].style.borderBottom = "1px solid black";
		document.getElementById("inDepartmentDetail").style.borderBottom = "1px solid black";

	} else {

		document.getElementById("shanchuId").style.visibility = "visible";
		document.getElementById("tijiaoxiugaiId").style.visibility = "hidden";
		document.getElementById("xiugaiAndChexiaoId").value = "修改";
		document.getElementsByClassName("departmentInput1")[0].disabled = "disabled";
		document.getElementsByClassName("departmentInput1")[1].disabled = "disabled";
		document.getElementsByClassName("departmentInput1")[2].disabled = "disabled";
		document.getElementsByClassName("departmentInput1")[3].disabled = "disabled";
		document.getElementsByClassName("departmentInput1")[4].disabled = "disabled";
		document.getElementById("inDepartmentDetail").disabled = "disabled";
		document.getElementsByClassName("departmentInput1")[0].style.borderBottom = "none";
		document.getElementsByClassName("departmentInput1")[1].style.borderBottom = "none";
		document.getElementsByClassName("departmentInput1")[2].style.borderBottom = "none";
		document.getElementsByClassName("departmentInput1")[3].style.borderBottom = "none";
		document.getElementsByClassName("departmentInput1")[4].style.borderBottom = "none";
		document.getElementById("inDepartmentDetail").style.borderBottom = "none";
		document.getElementsByClassName("selectDep")[0].style.display = "none";
		document.getElementsByClassName("inputDep")[0].style.display = "inline-block";
		/*document.getElementsByClassName("inputDep")[0].style.visibility="visible";*/
	}
}

function deleteWarning() {
	var res = prompt("危险操作，请输入\"删除\"确认操作", "");
	if(res == "删除") {

		var departmentId = document.getElementById("departmentId").value;
		
		if(departmentId==null) {
			alert("程序错误，请联系网站维护人员");
		} else {

			var jsonStr = JSON.stringify({
				departmentId: departmentId
			});

			$.ajax({
				type: "post",
				url: "http://127.0.0.1:8080/scb.sms/deleteDepartment",
				contentType: "application/json;charset=utf-8",
				dataType: "json",//返回普通的字符流不要写 dataType : "json" 
				data: jsonStr,
				catch: true,
				async: false,
				success: function(result, textStatus, jqXHR) {
					alert(result.msg);
				},
				error: function(XMLHttpRequest, textStatus, errorThrown) {
					
					alert("服务器错误，请稍后再试或者联系网站维护人员");
				}
			});

		}
		
		setTimeout(window.location.href = "http://127.0.0.1:8080/scb.sms/findParentDepartments?a="+new Date().getTime(),3000);
        
	} else {
		alert("删除操作取消");
	}
	
	
}