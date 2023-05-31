<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>report</title>
    <style type="text/css">
        .Content-Main {
            max-width: 500px;
            margin: auto;

            padding: 20px 30px 20px 30px;
            font: 12px "Helvetica Neue", Helvetica, Arial, sans-serif;
            text-shadow: 1px 1px 1px #FFF;
            border: 1px solid #DDD;
            border-radius: 5px;
            box-shadow: 10px 10px 10px #dce2eb,
            -10px -10px 10px #f7f8f8;
            color: #888;
            background: #ecf0f3;
        }

        .Content-Main h1 {
            display: block;
            padding: 0px 0px 10px 40px;
            margin: -10px -30px 30px -30px;
            font: 25px "Helvetica Neue", Helvetica, Arial, sans-serif;
            border-bottom: 1px solid #DADADA;
            color: #888;

            font-weight: bolder;
            box-shadow: 3px 0px 10px #dce2eb, 3px -16px 10px #f7f8f8;
        }

        .Content-Main h1 > span {
            display: block;
            font-size: 11px;
        }

        .Content-Main label {
            display: block;
            margin: 0px 0px 5px;
        }

        .Content-Main label > span {
            float: left;
            width: 20%;
            padding-right: 10px;
            margin-top: 10px;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            font-weight: bold;
            text-align: right;
            color: #333;
        }

        .text, .Content-Main textarea {
            width: 70%;
            height: 20px;
            padding: 5px 0px 5px 5px;
            margin-bottom: 16px;
            margin-right: 6px;
            margin-top: 2px;
            line-height: 15px;
            border-radius: 4px;
            border: 1px solid #CCC;
            color: #888;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        }

        .select1 {
            width: 71%;
            height: 35px;
            margin-bottom: 16px;
            margin-right: 6px;
            margin-top: 2px;
            line-height: 15px;
            padding: 5px 0px 5px 5px;
            border-radius: 4px;
            border: 1px solid #CCC;
            color: #888;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        }

        .select2 {
            width: 13%;
            border-radius: 4px;
            border: 1px solid #CCC;
            color: #888;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
            -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        }

        .Content-Main textarea {
            width: 70%;
            height: 100px;
            padding: 5px 0px 0px 5px;
        }

        .button {
            padding: 10px 25px 10px 25px;
            margin-left: 111px;
            border-radius: 4px;
            border: 1px solid #CCC;
            background-color: #4b70e2;
            color: #333;
            border-radius: 25px;
            width: 180px;
            height: 40px;
            margin-top: 50px;
            font-weight: 700;
            font-size: 14px;
            color: black;
            background-color: #EBEBEB;
            border-radius: 25px;
            border: none;
            outline: none;
            cursor: pointer;
            user-select: none;
            /* 阴影 */
            box-shadow: 1px 1px 1px #d2dae6,
            -10px -10px 10px #f9f9f9;

            transition: all .6s ease-in-out;
        }

        .button:hover {
            color: white;

            border-color: #ADADAD;
            background-color: #4b70e2;
        }
    </style>
</head>
<body style=" background: #ecf0f3">
<div class="Content-Main">
    <div class="Content-Main1">
        <h1>用户反馈</h1>
    </div>
    <form action="" method="post" class="form-report">
        <label>
            <span>学生或老师</span>
            <select name="select2" class="select2">
                <option>老师</option>
                <option>学生</option>

            </select>
            <input class="text" placeholder="填写你的学号">
            <input style="margin-left:110px; margin-top:-10px" class="text" placeholder="填写你的姓名">
        </label>
        <label>
            <span>反馈信息:</span>
            <textarea id="mesaage" name="message" placeholder="填写反馈信息"></textarea>
        </label>
        <label>
            <span>问题类别:</span>
            <select name="select1" class="select1">
                <option>建议</option>
                <option>系统问题</option>
            </select>
        </label>
        <label>
            <input type="button" class="button" value="提交">
        </label>
    </form>
</div>
</body>
</html>