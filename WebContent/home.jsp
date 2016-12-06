<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="bootstrap.jsp"></jsp:include></head>
<body>
<h1>This is the home page</h1>
<form role="form" action="HomeServlet" method="post" onsubmit="return validate(this);">
                <div class="form-group">  
                    <label for="post">Create New Post (141 char):</label>
                    <textarea name= "posttext" id="posttext" class="form-control" rows="2" placeholder= "Express yourself!" maxlength="141"></textarea>
                    <div id="textarea_feedback"></div>
                    </div> 
                    <div class = "form-group"> 
                    <input type="submit" value="Submit" id="submit"/>
                    <input type="reset" value="Clear"/>
                </div>  
            </form>  
</body>
</html>