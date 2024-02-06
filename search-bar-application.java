#Controller
package com.Java.SpringMVCBoot.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/search")
	public String search() {
		System.out.println("Page loaded");
		return "Search";
	}
	@RequestMapping("/form-page")
	public RedirectView mainHandler(@RequestParam("searchText") String text)
	{
		System.out.println("Form page called...");
		String url = "https://www.google.com/search?q="+text;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}

#JSP page

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Search - Project!!</title>
<style>
h1{color: red;}
div{height: 20px;}
</style>
</head>
<body>
<h1>Welcome to the Search Project</h1>
<div>
	<form action="form-page">
		<input type="text" class="text1" placeholder="Enter the text you want" name="searchText"/>
		<input type ="submit" class="search"/>
	</form>
</div>
</body>
</html>



