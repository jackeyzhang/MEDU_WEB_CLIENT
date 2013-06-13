//js 代码放在这里

 $(function() {
		  $( "#tabs" ).tabs({
			  event: "mouseover"
		  });
			
		  $("#searchbutton").click(function(){
			 $.post("meduInit",
				  {
				    name:"Donald Duck",
				    city:"Duckburg"
				  },
				  function(data,status){
				    alert("Data: " + data + "\nStatus: " + status);
				  });
		  });

});