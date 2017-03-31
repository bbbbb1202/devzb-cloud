$(function(){
	$.ajax({
        type : 'GET',
        url : '/user',
        data : {},
        timeout : 30000,
        dataType : "json",
        success : function(response) {
            console.log(response)
            
            var html = '';
            for(var i=0;i<response.length;i++){
            	html += '<li>' + response[i].username + '</li>'
            }
            $('#ul_users').html(html);
        },
        error : function(req, textStatus, error) {
            try{
                console.error(error && error.message?error.message:error);
            } catch (e){}
        }
    });
});
