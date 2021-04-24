<%-- 
    Document   : getPrescriptionPage
    Created on : 20-Jan-2021, 04:01:48
    Author     : Bradlee Hayden, hisham_97
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
            .prescriptionBtn {
                background-color: #696969;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }
            .prescriptionBtn{
                opacity: 1;
            }
        </style>
        <title>Prescription Page</title>
    </head>
    <body>
        <form action="prescriptionServlet.do" method="post">
            <table>
                <tr>
                    <th>Issued By</th>
                    <th>Prescription Details</th>
                    <th>Select Prescription</th>
                    <th>Prescription Request</th>
                </tr>
                ${requestScope.appendRow}
                <tr>
                    <td colspan="3"><input type="submit" name="requestPrescription" value="Request Prescription" class = "prescriptionBtn"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
