<%-- 
    Document   : dashboardPage
    Created on : 19-Jan-2021, 05:14:11
    Author     : Bradlee Hayden, hisham_97
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                font-family: Arial, Helvetica, sans-serif;
            }
            .logoutbtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .logoutbtn:hover {
                opacity: 1;
            }
            .regApprovebtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 25%;
                opacity: 0.9;
            }
            .regApprovebtn{
                opacity: 1;
            }
            .prescripApprovebtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 25%;
                opacity: 0.9;
            }
            .prescripApprovebtn{
                opacity: 1;
            }
        </style>
        <title>SmartCare Surgery Dashboard</title>
    </head>
    <body>
        <jsp:include page="navigation.jsp"/>
        <div class="dashboard">        
            <main>

                <h2>Welcome, ${newUser.uName}</h2>

                <c:choose>
                    <c:when test="${newUser.uRoles == 'admin'}">
                        ${requestScope.setTable}
                        ${requestScope.setMessage}
                        <h2>Approve registrations</h2>
                        <form action='registrationServlet.do' method='post'>
                            <table>
                                <tr>
                                    <th>Username</th>
                                    <th>Role</th>
                                    <th>Approve</th>
                                </tr>
                                ${requestScope.getRegistration}
                            </table>
                            <input type='submit' value='Approve registration' name='regApproved' class="regApprovebtn">
                        </form> <br /><br />
                    </c:when>
                    <c:when test="${newUser.uRoles == 'nurse' || newUser.uRoles == 'doctor'}">
                        ${requestScope.setTable}
                        ${requestScope.setMessage}
                        <h2>Approve requests for prescription</h2>
                        <form action='prescriptionServlet.do' method='post'>
                            <table>
                                <tr>
                                    <th>Patient Name</th>
                                    <th>Prescription Details</th>
                                    <th>Approve</th>
                                </tr>
                                ${requestScope.getPrescription}
                            </table>
                        <input type='submit' value='Approve Request' name='presApproved' class="prescripApprovebtn">
                    </form> <br /><br />
                </c:when>
                <c:otherwise>
                    ${requestScope.setTable}
                    ${requestScope.setMessage}
                </c:otherwise>
            </c:choose>
            
            <form action="logoutServlet.do" method="post">
                <input type="submit" name="logout" value="Logout" class="logoutbtn">
            </form>
        </main>
        </div>
    </body>
</html>
