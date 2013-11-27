
if (window.XMLHttpRequest)
{// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
}
else
{// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
}
xmlhttp.open("GET","menuXML.xml",false);
xmlhttp.send();
xmlDoc=xmlhttp.responseXML; 

x=xmlDoc.getElementsByTagName("TOPMENUBAR");
i=0;
function display(){
var arry= new Array();
arry[0]="Page1";
arry[1]="Page2";
arry[2]="Page3";
arry[3]="Page4";
arry[4]="Page5";
while(x[i])
{
artist=(x[i].childNodes[0].nodeValue);
 document.getElementById(arry[i]).innerHTML=artist;
i++;




}
}