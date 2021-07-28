var Noof = 0;
var Noof1 = 0;
var check = 0;
var check1 = 0;
var i=1;

function Sub1()
	{
	Noof = Noof + 1;
	
	if (Noof >=3)
	{
	check = 1;
	}
	if(document.test.q11.value == '')
		{
		var q11 = 'Try '
		}
	else if(document.test.q11.value == '~P')
		{
		var q11 = 'Correct'
		}
	else
		{
		var q11 = 'Wrong'
		}

	if(document.test.q12.value == '')
		{
		var q12 = 'Try '
		}
	else if(document.test.q12.value == '(~PVQ)')
		{
		var q12 = 'Correct';
		}
	else
		{
		var q12 = 'Wrong';
		}		

	if(document.test.q21.value == '')
		{
		var q21 = 'Try '
		}
	else if(document.test.q21.value == '(QV~S)')
		{
		var q21 = 'Correct';
		}
	else
		{
		var q21 = 'Wrong';
		}	

	if(document.test.q31.value == '')
		{
		var q31 = 'Try '
		}
	else if(document.test.q31.value == '~P')
		{
		var q31 = 'Correct';
		}
	else
		{
		var q31 = 'Wrong';
		}		

	if(document.test.q41.value == '')
		{
		var q41 = 'Try '
		}
	else if(document.test.q41.value == '~Q')
		{
		var q41 = 'Correct';
		}
	else
		{
		var q41 = 'Wrong';
		}		
	

  myWin= open("","displayWindow","width=350,height=350,status=no,toolbar=no,menubar=no");
  myWin.document.open();
  myWin.document.write("<html><head><title>Answers");
  myWin.document.write("</title></head><body>");
  myWin.document.write("<H3>Here are answers </H3>");
  myWin.document.write("<b><br>a. " + q11 + ", " + q12 + "<br>");
  myWin.document.write("<br>b. " + q21 + "<br>");
  myWin.document.write("<br>c. " + q31 + "<br>");
  myWin.document.write("<br>d." + q41 + "<br></b>");
  myWin.document.write("<br><br><br><center><form><input type=button value=' Close ' onClick='self.close()'> </form></center>");
  myWin.document.write("</body></html>");
  myWin.document.close();  

	}

function SA1()
	{
	if(check == 0)
	{
	alert("Please try again");
	return;
	}
	
  myWin= open("","displayWindow","width=350,height=350,status=no,toolbar=no,menubar=no");
  myWin.document.open();
  myWin.document.write("<html><head><title>Answers");
  myWin.document.write("</title></head><body>");
  myWin.document.write("<H3>Here are answers </H3>");
  myWin.document.write("<br><b>a. ~P ,  Q<br>");
  myWin.document.write("<br>b. Q V ~S<br>");
  myWin.document.write("<br>c. ~P<br>");
  myWin.document.write("<br>d. ~Q<br></b>");
  myWin.document.write("<br><center><form><input type=button value=' Close ' onClick='self.close()'> </form></center>");
  myWin.document.write("</body></html>");

  myWin.document.close();  
	}























