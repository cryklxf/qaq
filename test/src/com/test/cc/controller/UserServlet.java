package com.test.cc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.cc.bean.User;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> list=new ArrayList<User>();
		JSONArray.fromObject(list);
		
		
		User user=new User();
		JSONObject json=JSONObject.fromObject(user);
		
		JSONObject json1=new JSONObject();
		json.put("id", user.getId());
		json.put("name", user.getName());
		json.put("pwd", user.getPwd());
		
		resp.getWriter().print(json);
	}

}
