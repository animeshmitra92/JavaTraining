/**
 * 
 */

var req;
function sendRequest(cname)
{
	if (window.XMLHttpRequest)
		{
			req=new XMLHttpRequest();
			
		}
	else if (window.ActiveXObject)
		{
			req=new ActiveXObject("Microsoft.XMLHTTP");
		}
	var url="NameSuggest?city_n"+cname;
	req
}