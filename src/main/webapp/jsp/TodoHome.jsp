<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
		<table border="1px solid black">
			<tr>
				<th>Task Name</th>
				<th>Task Description</th>
				<th>Date Created</th>
				<th>Status</th>
				<th>Delete</th>
				<th>Edit</th>
			</tr>
			${list}
		</table>
		<br> <a href="add-task"><button>Add Task</button></a><br> <a
			href="logout"><button>Logout</button></a>
	</div>
</body>