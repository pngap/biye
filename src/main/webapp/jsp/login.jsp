<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width" , initial-scale=1.0">
    <link rel="stylesheet" href="../css/style.css">

    <title>登录</title>
</head>
<body>
<!-- 思路 -->
<!-- 第一个状态直接登录，第二个状态注册-->
<!-- 页面布局 -->

<!-- 主体容器 -->
<div class="container">
    <!-- 两个单页面 字和按钮 -->
    <div class="switch-panel">  <!-- 此处需改变 -->
        <!-- 登录 -->
        <div id="login" class="switch-box switch-hidden">
            <div class="title">欢迎加入!</div>

            <button id="switch1">返回</button>
        </div>

        <!-- 注册 -->
        <div id="register" class="switch-box">  <!-- 此处需改变 -->
            <div class="title">没有账号？</div>
            <p>创建你的账号</p>
            <button id="switch2">创建</button>
        </div>
    </div>

    <!-- section标签用于对页面内容分块 注册登录板块 -->
    <section class="register-login-panel">    <!-- 此处section需改变 -->
        <!-- 注册界面 -->
        <section class="register switch-hidden-2">
            <div class="content">
                <h2>创建你的账号</h2>


                <input class="b" type="text" placeholder="学号">
                <input class="b" type="text" placeholder="密码">

                <button onclick="window.location.href='reg.jsp'">创建</button>
            </div>


        </section>

        <!-- 登录界面 -->
        <section class="login">    <!-- 此处section需改变 -->

            <div class="content">
                <h2>登录账号</h2>
                <div class="radioc">
                    <lable class="radiochoose"><input class="a" type="radio" name="level1">学生</lable>
                    <lable class="radiochoose"><input class="a" type="radio" name="level1">教师</lable>
                    <lable class="radiochoose"><input class="a" type="radio" name="level1">管理员</lable>
                </div>
                <input class="b" type="text" placeholder="学号">
                <input class="b" type="text" placeholder="密码">


                <span>忘记密码？请联系管理员</span>
                <button>登录</button>
            </div>


        </section>
    </section>

</div>

</body>

<script src="../js/script.js"></script>
</html>