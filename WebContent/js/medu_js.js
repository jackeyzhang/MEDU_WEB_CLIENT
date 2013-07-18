var Medu = {

	Action : "ui.action.UITestAction",
	
	testcallback : function(result) {
		alert(result);
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