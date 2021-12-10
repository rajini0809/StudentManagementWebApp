
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        
        
    </head>
    <body>
         <div class="container">
                    <form id="form-reg" name="form-reg">
                        
                        <div class="form-group" >
                            <label>UserName</label>
                            <input type="text" name="name" id="name" class="form-control"  placeholder="name" size="30px" required>
                        </div>
                        
                        <div class="form-group">
                            <label>Email</label>
                            <input type="text" name="email" id="email" class="form-control"  placeholder="email" size="30px" required>
                        </div>
                        
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" name="password" id="password" class="form-control"  placeholder="password" size="30px" required>
                        </div>
                        
                        <div class="form-group">
                            <button type="button" class="btn btn-info" id="save" onclick="register()">Register</button></br>
                            <a href="Login.jsp">Already have an account?</a>
                            
                        </div>
                        
                    </form>
                </div>
        
           
        <script src="component/jquery-3.6.0.js" type="text/javascript"></script>
        <script src="component/jquery-3.6.0.min.js" type="text/javascript"></script>
        <script src="component/jquery.validate.min.js" type="text/javascript"></script>
        
        
        
        <script>
            
            var isNew = true;
            
            function register()
            {
                if($("#form-reg").valid())
                {
                    var url="";
                    var data = "";
                    var method;
                    
                    if(isNew==true)
                    {
                        url='register';
                        data = $("#form-reg").serialize();
                        method = 'POST';
                    }
                    
                    $.ajax({
                        type : method,
                        url : url,
                        dataType : 'JSON',
                        data : data,
                        
                        success:function(data) 
                        {
                            if(isNew==true)
                            {
                                alert("Registation Successful");
                                
                                window.location.replace("Login.jsp");
                                
                            }
                          
                        }
                        
                    });
                    
                    
                }
                
                    
                    
                    
                        
                    
                    
            }
        </script>
    </body>
</html>


