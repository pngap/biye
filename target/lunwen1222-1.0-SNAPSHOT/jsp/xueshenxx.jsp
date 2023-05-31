<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023/3/22
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">

    <title>学生信息</title>
    <style type="text/css">
        #a1 {
            width: 30%;
            height: 90px;
            float: left;
        }

        #a2 {
            width: 55%;
            height: 40px;
            float: left;
            text-align: right;
            padding-top: 35px;
            z-index: 1;
        }

        #t1 {
            width: 100%;
            height: 500px;
        }

        #table {
            width: 100%;
            text-align: center;
            border-color: #6495ED;
            border: 0px solid #6495ED;
        }

        .table {
            width: 80%;
            float: left;
            height: 400px;
        }

        #addinfo {
            width: 400px;
            height: 320px;
            text-align: left;
            float: left;
            box-shadow: 0px 0px 35px 0px #6495ED;
            z-index: 3;
            background-color: white;
            position: absolute;
            left: 25%;
            top: 18%;
            border-radius: 27px 0px 27px 27px;
        }

        th {
            border: 1px solid ghostwhite;
        }

        th {
            height: 40px;
            background-color: #6495ED;
        }

        td {
            border: 1px solid floralwhite;
            height: 30px;
        }

        tr:hover {
            background-color: #999999;
            height: 37px;
        }

        #td {
            border: 3px solid #000000;
            width: 60px;
            height: 40px;
            background-color: #6495ED;
        }

        #add {
            width: 140px;
            height: 40px;
            text-decoration: none;
            background-color: #6495ED;
            border: 3px solid #000000;
            color: #F0F8FF;
            padding: 10px 10px 10px 10px;
            margin-right: 10%;
            border-radius: 6px 6px 6px 6px;
        }

        #add:hover {
            color: #000000;
        }

        select {
            height: 40px;
            border: 2px solid #000000;
            border-radius: 3px 3px 3px 3px;
            margin-right: 40px;
            margin-left: 20px;
        }

        .a10 .ss1 {
            height: 40px;
            border: 2px solid #000000;
            border-radius: 3px 3px 3px 3px;
            width: 80px;
            margin-right: 40px;
            margin-left: 20px;
            font-size: 16px;
        }

        #form1 {
            font-size: larger;
            padding-left: 20px;
            text-align: center;
        }

        input {
            width: 65%;
            height: 25px;
            border-radius: 6px 6px 6px 6px;
            margin-top: 10px;
        }

        #btn_update, #btn_ext, #btn_add {
            width: 120px;
            height: 40px;
            border-radius: 6px 6px 6px 6px;
            margin: 0 auto;
            background-color: #6495ED;
        }

        #btn_add {
            color: white;
        }

        #btn_ext {
            color: white;
        }

        #btn_add :hover {
            color: #999999;
        }

        #btn_ext :hover {
            color: antiquewhite;
        }

        #xiu {
            border-radius: 3px 3px 3px 3px;
            border: 1px solid bisque;
            padding: 5px;
            box-shadow: 0px 0px 30px 0px #DCDCDC;
            background-color: coral;
        }

        #xiu:hover {
            color: #BD0A01;
        }

        #xiu2 {
            border-radius: 3px 3px 3px 3px;
            border: 1px solid bisque;
            padding: 5px;
            box-shadow: 0px 0px 30px 0px #DCDCDC;
            background-color: springgreen;
        }

        #xiu2:hover {
            color: #BD0A01;
        }

        #h4 {
            width: 94%;
            float: left;
            padding-top: 15px;
            font-size: larger;
            height: 30px;
            padding-left: 0px;
            border-radius: 0px 0px 50% 50%/0px 0px 40px 40px;
            background-color: #6495ED;
        }

        }
        #h3 {
            width: 5%;
            float: right;
            height: 20px;
            padding: 0;
            text-align: right;
            margin: 0 auto;
        }

        /* #h2{width: 100%;float: left;height: 40px;border-radius: 0px 0px 50% 50%/0px 0px 30px 30px;background-color: #6495ED;} */
        #span1 {
            width: 20px;
            font-size: x-large;
            line-height: 10px;
        }

        #h3 :hover {
            background-color: #DCDCDC;
        }

        #aa2 {
            float: left;
            width: 15%;
        }

        #aa3 {
            width: 80%;
            height: 320px;
            float: left;
        }

        #shu {
            height: 320px;
        }

        .a10 .a9 {
            width: 70px;
            height: 20px;
            background-color: #fff;
            position: absolute;
            left: 200px;
            bottom: 0px;
        }

        .a10 {
            width: 100%;
            height: 50px;
            margin-top: 0px;
            background-color: #dcdcdc;
            float: left;
            font-size: larger;
            padding-left: 20px;
        }

        .dao {
            border-radius: 3px 3px 3px 3px;
            box-shadow: 0px 0px 30px 0px #DCDCDC;
            background: white;
            width: 70px;
            height: 40px;
            float: left;
            margin-right: 20px;
        }
    </style>
</head>
<body>
<div id="a1">
    <h2><font style="color: #6495ED;">~~学生信息~~</font></h2>
</div>
<div id="a3">

</div>
<div id="a2">
    <input id="value"> </input>
    <a href="#" onclick="select();" id="add">查找</a>
</div>
<div class="table">
    <table border="1" style="text-align:center" id="table" cellspacing="0">
        <tr>


            <th>学号</th>
            <th>姓名</th>
            <th>院系</th>
            <th>专业</th>
            <th>年级班级</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${key}" var="parms">
            <tr>
                <td>${parms.number}</td>
                <td>${parms.name}</td>
                <td>${parms.xueyan}</td>
                <td>${parms.zhany}</td>
                <td>${parms.nianji}</td>

                <td><a style="color:#6495ED;cursor: pointer;" onclick="updateRow(this);" id="xiu">修改<a>&nbsp<a
                        style="color:chocolate;cursor:pointer;" onclick="delRow(this);" id="xiu2">删除</a></td>
            </tr>
        </c:forEach>

    </table>
</div>

<!-- <div class="a10">
    <div class="dao"><span><b>共12页</b></span></div>
    <div class="dao">
    <select name="" class="ss1">
        <option value=""><b>9条/页</b></option>
    </select></div>
    <span>❮</span> 1  2 <span id="">❯</span>
</div> -->
<script>
    function select() {
        var a = document.getElementById("value").value;
        location.href = "demo1?number=" + a + "";


    }

</script>

</body>
</html>
