<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">&nbsp;</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">

				<c:choose>
					<c:when test='${param.active == "login" }'>
						<li class="nav-item">
							<a class="nav-link" href="/">홈</a>
						</li>
						<li class="nav-item active">
							<a class="nav-link" href="/user/login">로그인/회원가입<span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/cs">고객센터</a>
						</li>
					</c:when>
					<c:when test='${param.active == "cs" }'>
						<li class="nav-item">
							<a class="nav-link" href="/">홈</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/user/login">로그인/회원가입</a>
						</li>
						<li class="nav-item active">
							<a class="nav-link" href="/cs">고객센터<span class="sr-only">(current)</span></a>
						</li>
					</c:when>					
					<c:otherwise>
						<li class="nav-item active">
							<a class="nav-link" href="/">홈<span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/user/login">로그인/회원가입</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/cs">고객센터</a>
						</li>
					</c:otherwise>				
				</c:choose>
			</ul>
		</div>
	</div>
</nav>