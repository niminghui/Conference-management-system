function xiugai() {
	
	if(document.getElementById("xiugaiAndChexiaoId").value == "修改") {
		alert("修改");
		
		document.getElementById("shanchuId").style.visibility="hidden";
		document.getElementById("tijiaoxiugaiId").style.visibility = "visible";
		document.getElementById("xiugaiAndChexiaoId").value = "放弃修改";
		document.getElementsByClassName("departmentInput1")[0].disabled="";
		document.getElementsByClassName("departmentInput1")[1].disabled="";
		document.getElementsByClassName("departmentInput1")[2].disabled="";
		document.getElementsByClassName("departmentInput1")[3].disabled="";
		document.getElementsByClassName("departmentInput1")[4].disabled="";
		document.getElementsByClassName("inputDep")[0].style.display="none";
		/*document.getElementsByClassName("inputDep")[0].style.visibility="hidden";*/
		document.getElementsByClassName("selectDep")[0].style.display="inline-block";
		
		document.getElementsByClassName("departmentInput1")[0].style.borderBottom="1px solid black";
		document.getElementsByClassName("departmentInput1")[1].style.borderBottom="1px solid black";
		document.getElementsByClassName("departmentInput1")[2].style.borderBottom="1px solid black";
		document.getElementsByClassName("departmentInput1")[3].style.borderBottom="1px solid black";
		document.getElementsByClassName("departmentInput1")[4].style.borderBottom="1px solid black";
		//document.getElementsByClassName("departmentInput1")[5].style.borderBottom="1px solid black";
		
	}else{
		alert("放弃修改");
		document.getElementById("shanchuId").style.visibility= "visible";
		document.getElementById("tijiaoxiugaiId").style.visibility ="hidden";
		document.getElementById("xiugaiAndChexiaoId").value = "修改";
		document.getElementsByClassName("departmentInput1")[0].disabled="disabled";
		document.getElementsByClassName("departmentInput1")[1].disabled="disabled";
		document.getElementsByClassName("departmentInput1")[2].disabled="disabled";
		document.getElementsByClassName("departmentInput1")[3].disabled="disabled";
		document.getElementsByClassName("departmentInput1")[4].disabled="disabled";
	//	document.getElementsByClassName("departmentInput1")[5].disabled="disabled";
		document.getElementsByClassName("departmentInput1")[0].style.borderBottom="none";
		document.getElementsByClassName("departmentInput1")[1].style.borderBottom="none";
		document.getElementsByClassName("departmentInput1")[2].style.borderBottom="none";
		document.getElementsByClassName("departmentInput1")[3].style.borderBottom="none";
		document.getElementsByClassName("departmentInput1")[4].style.borderBottom="none";
	//	document.getElementsByClassName("departmentInput1")[5].style.borderBottom="none";
		document.getElementsByClassName("selectDep")[0].style.display="none";
		document.getElementsByClassName("inputDep")[0].style.display="inline-block";
		/*document.getElementsByClassName("inputDep")[0].style.visibility="visible";*/
	}
}