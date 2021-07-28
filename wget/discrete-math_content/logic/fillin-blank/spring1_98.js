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

	if(document.test.q21.value == '')
		{
		var q21 = 'Try '
		}
	else if(document.test.q21.value == 'R')
		{
		var q21 = 'Correct';
		}
	else
		{
		var q21 = 'Wrong';
		}	

	if(document.test.q31.value == '')
		{
		var q31 = ' Try '
		}
	else if(document.test.q31.value == 'V')
		{
		var q31 = 'Correct';
		}
	else
		{
		var q31 = 'Wrong';
		}		

       if(document.test.q32.value == '')
                {
                var q32 = ' Try '
                }
        else if(document.test.q32.value == 'Q')
                {
                var q32 = 'Correct';
                }
        else
                {
                var q32 = 'Wrong';
                }

	if(document.test.q41.value == '')
		{
		var q41 = 'Try '
		}
	else if(document.test.q41.value == '1' || document.test.q41.value == 'T')
		{
		var q41 = 'Correct';
		}
	else
		{
		var q41 = 'Wrong';
		}		
	

  myWin= open("","displayWindow","width=375,height=375,status=no,toolbar=no,menubar=no");
  myWin.document.open();
  myWin.document.write("<html><head><title>Answers");
  myWin.document.write("</title></head><body>");
  myWin.document.write("<b><H3>Here are answers </H3>");
  myWin.document.write("<br>a. " + q11);
  myWin.document.write("<br><br>b. " + q21);
  myWin.document.write("<br><br>c. " + q31 +","+ q32);
  myWin.document.write("<br><br>d. " + q41);
  myWin.document.write("</b><br><br><center><form><input type=button value=' Close ' onClick='self.close()'> </form></center>");
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
	
  myWin=open("","displayWindow","width=375,height=375,status=no,toolbar=no,menubar=no");
  myWin.document.open();
  myWin.document.write("<html><head><title>Answers");
  myWin.document.write("</title></head><body>");
  myWin.document.write("<b><H3>Here are answers </H3>");
  myWin.document.write("a. ~P <br>");
  myWin.document.write("<br>b. R<br>");
  myWin.document.write("<br>c. V , Q<br>");
  myWin.document.write("<br>d. 1 or T<br>");
  myWin.document.write("</b><br><br><br><center><form><input type=button value=' Close ' onClick='self.close()'> </form></center>");
  myWin.document.write("</body></html>");

  myWin.document.close();  
	}

function SA2()
	{

	if(check1 == 0)
	{
	alert("Please try again");
	return;
	}
  myWin= open("", "displayWindow","width=300,height=300,status=no,toolbar=no,menubar=no");
  myWin.document.open();
  myWin.document.write("<html><head><title>Answers");
  myWin.document.write("</title></head><body>");
  myWin.document.write("<H3>Here are answers </H3>");
  myWin.document.write("<b><br>a. ~P <br>");
  myWin.document.write("<br>b. ~Q^S<br> ");
  myWin.document.write("<br>c. V, ~P<br> ");
  myWin.document.write("<br>d. ~P<br>");
  myWin.document.write("<br>e. P <br></b>");

  myWin.document.write("<br><br><br><center><form><input type=button value=' Close ' onClick='self.close()'> </form></center>");
  myWin.document.write("</body></html>");

  myWin.document.close();  
	}






















