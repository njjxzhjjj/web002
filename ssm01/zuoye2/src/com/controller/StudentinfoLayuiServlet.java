package com.controller;

import com.alibaba.fastjson.JSON;
import com.bean.Studentinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "StudentinfoLayuiServlet",urlPatterns = "/StudentinfoLayuiServlet")
public class StudentinfoLayuiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        //创建一个layui后台的json格式
        ArrayList<Studentinfo> studentinfos = new ArrayList<>();

        //创建15个用户
        Studentinfo s1 = new Studentinfo();
        s1.setName("张三");
        s1.setAge(15);
        s1.setClass1("15网络");
        studentinfos.add(s1);

        Studentinfo s2 = new Studentinfo();
        s2.setName("李四");
        s2.setAge(22);
        s2.setClass1("17软件");
        studentinfos.add(s2);

        Studentinfo s3 = new Studentinfo();
        s3.setName("王五");
        s3.setAge(33);
        s3.setClass1("16信息");
        studentinfos.add(s3);

        Studentinfo s4 = new Studentinfo();
        s4.setName("教授");
        s4.setAge(21);
        s4.setClass1("15网络");
        studentinfos.add(s4);

        Studentinfo s5 = new Studentinfo();
        s5.setName("小宁");
        s5.setAge(20);
        s5.setClass1("17信息");
        studentinfos.add(s5);

        Studentinfo s6 = new Studentinfo();
        s6.setName("小王");
        s6.setAge(29);
        s6.setClass1("19网络");
        studentinfos.add(s6);

        Studentinfo s7 = new Studentinfo();
        s7.setName("小二");
        s7.setAge(23);
        s7.setClass1("18信息");
        studentinfos.add(s7);

        Studentinfo s8 = new Studentinfo();
        s8.setName("小乔");
        s8.setAge(16);
        s8.setClass1("18软件");
        studentinfos.add(s8);

        Studentinfo s9 = new Studentinfo();
        s9.setName("大乔");
        s9.setAge(22);
        s9.setClass1("18软件");
        studentinfos.add(s9);

        Studentinfo s10 = new Studentinfo();
        s10.setName("小飞");
        s10.setAge(30);
        s10.setClass1("19信息");
        studentinfos.add(s10);

        Studentinfo s11 = new Studentinfo();
        s11.setName("小孙");
        s11.setAge(29);
        s11.setClass1("17信息");
        studentinfos.add(s11);

        Studentinfo s12 = new Studentinfo();
        s12.setName("小酷");
        s12.setAge(23);
        s12.setClass1("20网络");
        studentinfos.add(s12);

        Studentinfo s13 = new Studentinfo();
        s13.setName("小月");
        s13.setAge(20);
        s13.setClass1("19软件");
        studentinfos.add(s13);

        Studentinfo s14 = new Studentinfo();
        s14.setName("小鲁班");
        s14.setAge(19);
        s14.setClass1("13网络");
        studentinfos.add(s14);

        Studentinfo s15 = new Studentinfo();
        s15.setName("小黑");
        s15.setAge(25);
        s15.setClass1("15软件");
        studentinfos.add(s15);


        Map map = new HashMap<>();
        map.put("code",0);
        map.put("msg","写啥都行");
        map.put("count",15);
        map.put("data",studentinfos);
        String s = JSON.toJSONString(map);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
