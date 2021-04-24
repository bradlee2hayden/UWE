<%-- 
    Document   : completeRegistrationPage
    Created on : 19-Jan-2021, 04:13:35
    Author     : Bradlee Hayden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                font-family: Arial, Helvetica, sans-serif;
            }
             .confirmtBtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }
            .confirmtBtn{
                opacity: 1;
            }
            input[type=text] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
                font-family: Arial, Helvetica, sans-serif;
            }

            input[type=text]:focus{
                background-color: #ddd;
                outline: none;
            }

            /* Overwrite default styles of hr */
            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }
        </style>
        <title>SmartCare Surgery Registration</title>
    </head>
    <body>
        <h1>Complete the registration form: </h1>
        <form action="completeRegistrationServlet.do" method="post">
                Name: <br />
                <hr>
                <input type ="text" placeholder="Name" name="name" required>  <br />
                Address: <br />
                <hr>
                <input type ="text" placeholder="Address" name="address" required>  <br />
                Type <br />
                <input type ="text" placeholder="Type" name="type" required>  <br /><br />
                Date of Birth: <br />
                <hr>
                <input type ="date" placeholder="Date of Birth" name="DOB" required>  <br /><br />
                <input name="completeReg" type="submit" value="Confirm" class="confirmtBtn">
            </form>
    </body>
</html>
