function callServer(){
	
	//javascript로 서버쪽 프로그램을 호출(ajax)
	
	//ajax를 이용하여 처리
	
	$.ajax({
		//호출할 서버쪽 프로그램의 url
		url : "http://localhost:8080/myProject/add",
		
		//type : 전송할방식
		type : "get",
		
		//data : 서버로 전송할 데이터
		data : {
			first : $("#first").val(),
			second : $("#second").val()
		},
		
		success : function(data) {
			$("span").text(data);
		},
		
		error : function(){
			alert("오류");
		}
	});
	
	
	
}
