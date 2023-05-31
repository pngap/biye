<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/index1.css">
    <title>欢迎！ 学生综合素质考核系统</title>
</head>
<body style=" background: #ecf0f3">
<div id="a1">
    <img src="../img/logo_jw_d.png" style="vertical-align: bottom;">

    <font size="6"><span id="top"><a style="text-decoration:none" href="home.jsp"
                                     target="yem"><b>&nbsp;学生综合素质考核系统</b></a></span></font>
</div>
<div id="a2">
    <center>
        <div id="aa1">
            <a href="#" onclick="custom_close()"><span id="top"><b>退出页</b></span></a>
        </div>
        <div id="aa2">
            <a href="#" id="btn"><span id="top"><b>个性化</b></span></a>
        </div>
    </center>
</div>
<div id="tab1">
    <div id="tab2">
        <table border="0" cellspacing="0" cellpadding="0" id="t2">
            <tr>
                <th>教师姓名</th>
            </tr>
            <tr>
                <td><img src="../img/用户.png" width="100px" height="100px" id="img1"></td>
            </tr>
            <tr>
                <td height="30px">ID</td>
            </tr>

        </table>
    </div>
    <div class="treebox">
        <ul class="menu">
            <li class="level1">
                <a href="#none"><em class="ico ico5"></em>班级<i class="down"></i></a>
                <ul class="level2">
                    <li><a href="班级信息.html" target="yem">班级信息</a></li>
                    <li><a href="挂科统计.html" target="yem">挂科统计</a></li>
                </ul>
            </li>
            <li class="level1">
                <a href="#none"><em class="ico ico2"></em>学生管理<i></i></a>
                <ul class="level2">
                    <li><a href="学生信息.html" target="yem">学生信息</a></li>
                    <li><a href="宿舍统计.html" target="yem">添加学生</a></li>
                </ul>
            </li>
            <li class="level1">
                <a href="#none"><em class="ico ico3"></em>成绩管理<i></i></a>
                <ul class="level2">
                    <li><a href="成绩信息.html" target="yem">成绩信息</a></li>
                    <li><a href="成绩信息.html" target="yem">成绩排名</a></li>
                </ul>
            </li>
            <li class="level1">
                <a href="#none"><em class="ico ico3"></em>考试管理<i></i></a>
                <ul class="level2">
                    <li><a href="课表查询.html" target="yem">考试查询</a></li>
                    <li><a href="课表查询.html" target="yem">添加考试</a></li>

                </ul>
            </li>

            <li class="level1">
                <a href="#none"><em class="ico ico1"></em>账户管理<i></i></a>
                <ul class="level2">
                    <li><a href="xiugaimima.jsp" target="yem">修改密码</a></li>

                </ul>
            </li>
            <li class="level1">
                <a href="#none"><em class="ico ico1"></em>反馈信息<i></i></a>
                <ul class="level2">
                    <li><a href="fankui.jsp" target="yem">反馈</a></li>

                </ul>
            </li>
        </ul>
    </div>
</div>
<div id="zhu">
    <iframe src="home.jsp" width="100%" height="550px" name="yem" border="0" scrolling="no"
            frameborder="0"></iframe>
</div>
<!-- 引入 jQuery -->
<script src="../js/jquery1.8.3.min.js"></script>
<script src="../js/easing.js"></script>
<script>
    //等待dom元素加载完毕.
    $(function () {
        $(".treebox .level1>a").click(function () {
            $(this).addClass('current')   //给当前元素添加"current"样式
                .find('i').addClass('down')   //小箭头向下样式
                .parent().next().slideDown('slow', 'easeOutQuad')  //下一个元素显示
                .parent().siblings().children('a').removeClass('current')//父元素的兄弟元素的子元素去除"current"样式
                .find('i').removeClass('down').parent().next().slideUp('slow', 'easeOutQuad');//隐藏
            return false; //阻止默认时间
        });
    })
</script>
<script language="JavaScript">
    function custom_close() {
        if (confirm('确认要关闭页面吗？') == true) {
            window.opener = null;
            window.open('', '_self');
            window.close();
        } else {
        }
    }
</script>
<script type="text/javascript">
    var btn = document.getElementById("btn");
    var body = document.getElementById("zhu");
    let array = ["cadetblue", "#DCDCDC", "mistyrose", "white", "pink", "#DEB887", "coral", "#FFF"];
    let index = 0;
    btn.onclick = function () {
        body.style.backgroundColor = array[index];
        index = (index + 1) % array.length;
    }
</script>
</body>
</html>