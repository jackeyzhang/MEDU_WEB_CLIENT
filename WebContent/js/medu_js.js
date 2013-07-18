var Medu = {

	Action : "ui.action.UITestAction",
	
	testcallback : function(result) {
		//alert(result);
		var str = "";
		for(var i=0;i<result.length;i++){
			str +=result[i].name;
			str +=" : ";
			str +=result[i].age;
		}
		alert(str);
	},

	sendAjaxRequest : function() {
		var kw = {
			name : "wbb",
			age : "20",
		};
		
		var data = Util.preparePostData(this.Action,kw);
		Util.ajaxPost(data, this.testcallback);
	}
};