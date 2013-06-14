//js 代码放在这里

 $(function() {
		  $( "#tabs" ).tabs({
			  event: "mouseover"
		  });
			
		  $("#searchbutton").click(function(){
			 $.post("meduInit",
				  {
				    name:"Donald Duck",
				  },
				  function(data,status){
				    alert("Data: " + data + "\nStatus: " + status);
				  });
		  });
		  
		  $.post("meduInit",
			  {
			    operation:"getcontentpage",
			  },
			  function(data,status){
				  $("#tab1").text(data.tab1.name);
				  $("#tabs1-content p").text(data.tab1.content);
				  $("#tab2").text(data.tab2.name);
				  $("#tabs2-content p").text(data.tab2.content);
				  $("#tab3").text(data.tab3.name);
				  $("#tabs3-content p").text(data.tab3.content);
				  $("#tab4").text(data.tab4.name);
				  $("#tabs4-content p").text(data.tab4.content);
			  }
			  ,"json");

});