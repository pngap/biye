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

    <link rel="stylesheet" type="text/css" href="../css/reponse.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">
    <title>完善信息</title>
</head>
<body style=" background: #ecf0f3">
<form class="form-horizontal" id="input_form" style="margin-left:-100px;    box-shadow:  10px 10px 10px #dce2eb,
                 -10px -10px 10px  #f7f8f8 ;
    border-radius: 12px; padding:100px;padding-right:230px;">
    <fieldset>
        <!-- Form Name -->
        <legend>注册信息</legend>

        <!-- Multiple Radios (inline) -->
        <div class="control-group">
            <label class="control-label" for="selectbasic-0">学院</label>
            <div class="controls">
                <select id="select_grade" name="selectbasic-0" class="input-xlarge">
                    <option>计算机学院</option>
                    <option>会计学院</option>
                    <option>外国语学院</option>

                </select>
            </div>
        </div>

        <!-- Select Basic -->
        <div class="control-group">
            <label class="control-label" for="selectbasic-0">年级</label>
            <div class="controls">
                <select id="select_grade" name="selectbasic-0" class="input-xlarge">
                    <option>2015</option>
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                    <option>2019</option>
                </select>
            </div>
        </div>

        <!-- Text input-->
        <div class="control-group">
            <label class="control-label" for="textinput-1">学号</label>
            <div class="controls">
                <input id="input_id" name="input_id" type="text" class="input-xlarge" placeholder="输入学号" ;">
                <label id="idNumWarn"> </label>
            </div>
        </div>

        <!-- Text input-->
        <div class="control-group">
            <label class="control-label" for="textinput-2">姓名</label>
            <div class="controls">
                <input id="input_name" name="input_name" type="text" placeholder="输入姓名" class="input-xlarge">
                <label id="nameWarn"> </label>
            </div>
        </div>

        <!-- Multiple Radios (inline) -->
        <div class="control-group">
            <label class="control-label" for="">性别</label>
            <div class="controls">
                <label class="radio inline" for="multipleradiosinline-2-0">
                    <input type="radio" name="radio_sex" id="radio_man" value="1" checked="checked">
                    男
                </label>
                <label class="radio inline" for="multipleradiosinline-2-0">
                    <input type="radio" name="radio_sex" id="radio_women" value="2">
                    女
                </label>
            </div>
        </div>


        <!-- Text input-->
        <div class="control-group">
            <label class="control-label" for="textinput-3">专业</label>
            <div class="controls">
                <input id="input_score" name="input_score" type="text" placeholder="专业全称" class="input-xlarge">
                <label id="scoreWarn"> </label>
            </div>
        </div>

    </fieldset>

    <div class="btn-container" style="display:block" id="btn_add">
        <button class="layui-btn" type="submit">提交</button>
    </div>
</form>


</body>

</html>