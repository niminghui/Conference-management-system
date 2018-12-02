function selectNameConflict() {
	
	
	var departmentName = document.getElementById("departmentName").value;
	var re = /^[\u4e00-\u9fa5a-z]+$/gi; //只能输入汉字和英文字母
	if(!re.test(departmentName)) {
		document.getElementById("departmentName").style.borderColor = "red";
		document.getElementById("MSGdepartmentName").textContent = "只允许中英文命名，请检查是否有空格";
		document.getElementById("MSGdepartmentName").style.color = "red";
	} else {
		
		var jsonStr = JSON.stringify({
			departmentName: departmentName
		});
		
		$.ajax({
			type: "post",
			url: "http://127.0.0.1:8080/scb.sms/cheakSameUsername",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			data: jsonStr,
			catch: true,
			async: true,
			success: function(result, textStatus, jqXHR) {
				if(result) {
					document.getElementById("MSGdepartmentName").textContent= "";
					document.getElementById("departmentName").style.borderColor = "limegreen";

				} else {
					document.getElementById("MSGdepartmentName").textContent = "该名称已存在";
					/*$("#create_username_msg").text("该账号已注册");*/
					document.getElementById("MSGdepartmentName").style.color = "red";
					document.getElementById("departmentName").style.borderColor = "red";
				}
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				document.getElementById("MSGdepartmentName").textContent = "服务器错误";
				/*$("#create_username_msg").text("服务器错误，请检查网络");*/
				document.getElementById("MSGdepartmentName").style.color = "red";
				document.getElementById("departmentName").style.borderColor = "red";
			}
		});

	}
}
function selectAbbreviConflict() {
	
	
	var departmentAbbreviation = document.getElementById("departmentAbbreviation").value;
	var re = /^[\u4e00-\u9fa5a-zA-Z]+$/gi; //只能输入汉字和英文字母
	if(!re.test(departmentAbbreviation)) {
		document.getElementById("departmentAbbreviation").style.borderColor = "red";
		document.getElementById("MSGdepartmentAbbreviation").textContent = "只允许中英文命名，请检查是否有空格";
		document.getElementById("MSGdepartmentAbbreviation").style.color = "red";
	} else {
		
		var jsonStr = JSON.stringify({
			departmentAbbreviation: departmentAbbreviation
		});
		
		$.ajax({
			type: "post",
			url: "http://127.0.0.1:8080/scb.sms/cheakSameAbbreviation",
			contentType: "application/json;charset=utf-8",
			dataType: "json",
			data: jsonStr,
			catch: true,
			async: true,
			success: function(result, textStatus, jqXHR) {
				if(result) {
					document.getElementById("MSGdepartmentAbbreviation").textContent= "";
					document.getElementById("departmentAbbreviation").style.borderColor = "limegreen";

				} else {
					document.getElementById("MSGdepartmentAbbreviation").textContent = "该简称已存在";
					/*$("#create_username_msg").text("该账号已注册");*/
					document.getElementById("MSGdepartmentAbbreviation").style.color = "red";
					document.getElementById("departmentAbbreviation").style.borderColor = "red";
				}
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
				document.getElementById("MSGdepartmentAbbreviation").textContent = "服务器错误";
				/*$("#create_username_msg").text("服务器错误，请检查网络");*/
				document.getElementById("MSGdepartmentAbbreviation").style.color = "red";
				document.getElementById("departmentAbbreviation").style.borderColor = "red";
			}
		});

	}
}
