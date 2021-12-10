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
        <link rel="stylesheet" href="style.css" type="text/css"/>
        
    
    </head>
    <body>
        <div class="container">
            <table width="100%" height="100%" border="0" cellpadding ="0" align="center">
                <tr>
                    <td align="center" valign="middle">
                        <table class="table-bordered" cellpading="3" cellspacing="3" width="350" border="0" bgcolor="#FFFFFF">
                            <form name="form-login" id="form-login">
                                <tr>
                                    <td height="25" colspan="2" align="left" valign="middle" bgcolor="#FF9900" class= "style2">
                                        <div align="center">
                                            <strong>Login</strong>
                                        </div>
                                    </td>
                                </tr>
                                
                                <tr>
                                <div id="err" style="color:red">
                                    
                                </div>
                                </tr>
                                <tr>
                                    <td width="118px" align="left" valign="middle" class="style1">
                                        Username
                                    </td>
                                    <td width="118px" align="left" valign="middle" class="style1">
                                        <input type="text" class="form-control" size="10px" id="username" placeholder="username" name="username">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td width="118px" align="left" valign="middle" class="style1">
                                        Password
                                    </td>
                                    <td width="118px" align="left" valign="middle" class="style1">
                                        <input type="password" class="form-control" size="10px" id="password" placeholder="password" name="password">
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td colspan="2" valign="middle" class="style1" align="center">
                                        <button type="button" class="btn btn-primary" onclick="login()">Sign In</button>
                                        <button type="button" class="btn btn-warning" onclick="reset()">Reset</button></br></br>
                                        <a href="Registration.jsp">Go to Register</a>
                                    </td>
                                </tr>
                                <p class="mb-0">Don't have an account? <a href="/StockProject/jsp/SignIn.jsp" class="text-white-50 fw-bold">Sign Up</a></p>
                            </form>
                            
                        </table>  
                        
                    </td> 
                    
                </tr>
            </table>
            
            
            
        </div>
        
        <script src="component/jquery-3.6.0.js" type="text/javascript"></script>
        <script src="component/jquery-3.6.0.min.js" type="text/javascript"></script>
        <script src="component/jquery.validate.min.js" type="text/javascript"></script>
        
        
        <script>
            var msg = null;
            
            function login()
            {
                if($('#username').val()=="")
                {
                    $('#username').parent('td').addClass('has-error');
                    return false;
                }
                else if($('#password').val()=="")
                {
                    $('#password').parent('td').addClass('has-error');
                    return false;
                }
                var data=$("#form-login").serialize();
                
                $.ajax({
                    type : 'POST',
                    url : 'LoginValidate',
                    dataType : 'JSON',
                    data : data,
                    
                    success:function(data) 
                        {
                            msg = data[0].msg
                            
                            if(msg == 1)
                            {
                                window.location.replace("index.jsp");
                            }
                            else if(msg==3)
                            {
                                $("#err").hide().html("Username or Password Incorrect!").fadeIn('slow');
                            }
                          
                        }
                });
            }
            
        </script>
    </body>
</html>
