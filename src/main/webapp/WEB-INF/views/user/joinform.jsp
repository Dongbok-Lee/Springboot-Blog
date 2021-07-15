<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br/>
  <div class="container">
    <form>
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" placeholder="Enter username" id="username">
      </div>

      <div class="form-group">
        <label for="pwd">Password</label>
        <input type="password" class="form-control" placeholder="Enter password" id="password">
      </div>

      <div class="form-group">
        <label for="email">Email address</label>
        <input type="email" class="form-control" placeholder="Enter Email" id="email">
      </div>
    </form>
    <button id="btn-save" class="btn btn-primary">회원가입 완료</button>
  </div>
<script type="text/javascript" src="../js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>
