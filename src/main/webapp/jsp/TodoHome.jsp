u<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<style>
div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Todo Home</title>
</head>
<body>
	<div>
		<h2 style="color: green">${pass}</h2>
		<h1>Todo Home</h1>
		<table border="1">
			<tr>
				<th>Task Name</th>
				<th>Task Description</th>
				<th>Date Created</th>
				<th>Status</th>
				<th>Delete</th>
				<th>Edit</th>
			</tr>
			<spring:forEach var="task" items="${list}">
				<tr>
					<th>${task.name}</th>
					<th>${task.description}</th>
					<th>${task.createdTime.format(DateTimeFormatter.ofPattern('dd-MM-YYYY hh:mm'))}</th>
					<th><spring:if test="${task.status}">
					Completed
					</spring:if> <spring:if test="${!task.status}">
							<a href="change-status?id=${task.id}"><button>Complete</button></a>
						</spring:if></th>
					<th><a href="delete?id=${task.id}"><button>Delete</button></a></th>
					<th><a href="edit?id=${task.id}"><button>Edit</button></a></th>
				</tr>
			</spring:forEach>
		</table>
		<br> <a href="add-task"><button>Add Task</button></a><br> <a
			href="logout"><button>Logout</button></a>
	</div>
</body>