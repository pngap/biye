<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>修改密码</title>
    <style type="text/css">
        #a1 {
            width: 40%;
            height: 400px;
            box-shadow: 20px 0px 18px 10px #dce2eb, 20px 1px 4px 0px #f7f8f8;
            border-radius: 12px;
            margin-top: 90px;
            float: left;
            border-radius: 0px 27px 27px 0px;
        }

        .i2 {
            border-radius: 10px 10px 10px 10px;
            height: 30px;
            width: 230px;
        }

        .i3 {
            border-radius: 20px 20px 20px 20px;
            color: #000000;
            height: 40px;
            width: 180px;
            font-size: x-large;
            background-color: white;
            border-width: 4px;
        }

        #a2 {
            width: 20%;
            height: 400px;
            float: left;
            margin-top: 90px;
            box-shadow: -20px -3px 7px 7px #dce2eb, -10px -10px 10px #f7f8f8;
            border-radius: 12px;
            border-radius: 27px 0px 0px 27px;
        }

        #a3 {
            width: 20%;
            height: 400px;
            float: left;
            margin-top: 90px;
        }

        #img1 {
            height: 400px;
            width: 100%;
        }
    </style>
</head>
<body style=" background: #ecf0f3">
<center>
    <div id="a3">

    </div>
    <div id="a2">
        <img src="../img/fengj.jpg" id="img1" align="right">
    </div>
    <div id="a1">
        <h1>修改密码</h1>
        <hr width="70%" size="3" color="black">
        <form action="" method="">
            <br>
            <input type="text" name="zhanghao" id="zhanghao" placeholder="账号" class="i2" onkeyup="bbbclick()"
                   onkeypress="if(event.keyCode==13) next(this)"/><br>
            <span></span><br>
            <input type="password" name="xmima" id="xmima" placeholder="新密码" class="i2" onkeyup="bbbclick()"
                   onkeypress="if(event.keyCode==13) next(this)"/><br><br>
            <input type="password" name="mima" id="mima" placeholder="确认密码" class="i2" onkeyup="bbbclick()"
                   onkeypress="if(event.keyCode==13) next(this)"/><br><br>
        </form>
        <br>
        <button type="submit" class="i3" value="" onclick="aaaclick()" id="i3"/>
        修 改</button>
    </div>
</center>
<script type="text/javascript">
    function aaaclick() {
        var l1 = document.getElementById("zhanghao").value;
        var password = document.getElementById("mima").value;
        var repassword = document.getElementById("xmima").value;
        document.getElementById("i3").disabled = true;
        if (l1 == "") {
            alert("账号为空");
            document.getElementById("i3").disabled = true;
        }
        if (password == "") {
            alert("密码为空");
            document.getElementById("i3").disabled = true;
        } else if (repassword == password) {
            alert("修改成功！");
        } else {
            alert("账号或密码不正确");
        }
    }

    function bbbclick() {
        var l1 = document.getElementById("zhanghao").value;
        var password = document.getElementById("mima").value;
        if (l1 !== "" && password != "") {
            document.getElementById("i3").disabled = false;
        }
    }

    function next(t) {
        var sum = document.getElementsByTagName("input");
        for (var i = 0; i < sum.length; i++) {
            if (i == (sum.length - 1)) {
                sum[0].focus();
                break;
            } else if (t == sum[i]) {
                sum[i + 1].focus();
                break;
            }
        }
    }
</script>
</body>
</html>
