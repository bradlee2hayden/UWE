<%-- 
    Document   : clientsPage
    Created on : 20-Jan-2021, 22:44:34
    Author     : Bradlee Hayden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            .submitBtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 25%;
                opacity: 0.9;
            }

            .submitBtn:hover {
                opacity: 1;
            }  
            .presBtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .presBtn:hover {
                opacity: 1;
            }
            
        </style>
        <title>Clients Page</title>
    </head>
    <body>
        <main>
            <c:choose>
                <c:when test="${empty param.cType}">
                    <h2>Select patient type:</h2>
                    <hr>
                    <form action="clientsServlet.do" name="cTypeForm" method="GET">
                        <input type="radio" name="cType" value="all"> All <br />
                        <hr>
                        <input type="radio" name="cType" value="private"> Private <br />
                        <hr>
                        <input type="radio" name="cType" value="nhs"> NHS <br /><br />
                        <hr>
                        <input type="submit" name="submitcType" value="Submit" class="submitBtn">
                    </form>
                </c:when>
                <c:otherwise>
                    <h2>Select client: </h2>
                    <form name="clientForm" action="prescriptionServlet.do" method="POST">
                        <hr>
                        <table>
                            <tr>
                                <th>Client Type</th>
                                <th>Client Name</th>
                                <th>Client Address</th>
                                <th>Client</th>
                            </tr>
                            <c:forEach items="${clientsList}" var="client">
                                <tr>
                                    <td>${client.type}</td>
                                    <td>${client.name}</td>
                                    <td>${client.address}</td>
                                    <td><input type="checkbox" name="cID" value="${client.id}"></td>
                                </tr>
                            </c:forEach>
                            
                            <tr>
                                <td colspan="4"><input type="submit" name="giveprescription" value="Give Prescription" class="presBtn"></td>
                            </tr>
                        </table>
                    </form>
                </c:otherwise>
            </c:choose>
        </main>
    </body>
</html>
