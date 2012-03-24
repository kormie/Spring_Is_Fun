<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>
			Hello page
		</title>
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap-responsive.css">
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.css">
	</head>
	<body>
	<h2 style="text-align:center">Our Totally Awesome Task List</h2>
		<div class="main">
			<div class="header"></div>
			<div class="todos" style="width:400px; margin:auto">
				<ul style="list-style:none">
					<#list todoList as todoItem>
                        <li>
                            <div class="todo">
                                <form name="" style="margin: 15px 0px">
                                    <input type="checkbox" name="checkbox" value="done">
                                    <span style="margin-left:20px">${todoItem}</span>
                                </form>
                            </div>
                        </li>

                    </#list>
					<li class="empty">
						<div class="todo">
							<form action="success.html" method="post" style="margin: 15px 0px">
								<input style="display:none" type="checkbox" name="checkbox" value="done">
								<span><input type="text" name="todoItem" style="width:250px"></span>
								<input style="float:right" type="submit" name="add">
							</form>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</body>
</html>
