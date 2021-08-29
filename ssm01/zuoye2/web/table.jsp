<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/8/3
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
  <style>
    table{
      width:600px;
      height: 120px;
      border-collapse: collapse;
    }
    td{
      border: 1px solid tan;
      text-align: center;

    }
  </style>
</head>
<body>
<table style="border: 1px solid tan" align="center">
  <thead>
  <tr>
    <th align="center" style="background: tan" colspan="4" height="40px">表格</th>
  </tr>
  <tr>
    <td><input type="checkbox" name="fuxuan"></td>
    <td>姓名</td>
    <td>年龄</td>
    <td>班级</td>
  </tr>
  </thead>
  <tbody id="content">

  </tbody>
</table>
<script>
  $(function () {
    $.ajax({
      url: "/StudentInfoServlet",
      type: 'GET',
      data: '',
      dataType: 'JSON',
      success: function (res) {
        $.each(res.rows,function (index,item) {
          $("#content").append("<tr>"+"<td><input type='checkbox' name='fuxuan'></td>"+"<td>"+item.name+"</td>"+"<td>"+item.age+"</td>"+"<td>"+item.class+"</td>"+"</tr>")
        })
        //  console.log(res)
      }
    });
  });
</script>
</body>
</html>