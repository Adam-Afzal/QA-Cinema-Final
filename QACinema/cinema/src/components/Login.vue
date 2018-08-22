<!--<template>-->
  <!--<div class="hello">-->
  <!--<head>-->
    <!--<title>QA Cinema</title>-->
    <!--<meta charset="utf-8">-->
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
  <!--</head>-->
  <!--<body>-->
  <!--<h3>Login</h3>-->

  <!--<button onclick="document.getElementById('clickaction').style.display='block'" style="width:auto;">Login</button>-->

  <!--<div id="clickaction" class="modal">-->

    <!--<form class="modal-content animate" action="/action_page.php">-->
      <!--<div class="imgcontainer">-->
        <!--<span onclick="document.getElementById('clickaction').style.display='none'" class="close" title="Close Modal">&times;</span>-->
        <!--<img src="https://www.raisethebar.co.uk/wp-content/uploads/2018/01/qa-logo.jpg" style="width:20%">-->
      <!--</div>-->

      <!--<div class="container">-->
        <!--<label for="uname"><b>Username</b></label>-->
        <!--<input type="text" placeholder="Enter Username" name="uname" id="username" required>-->

        <!--<label for="psw"><b>Password</b></label>-->
        <!--<input type="password" placeholder="Enter Password" name="psw" id="password" required>-->

        <!--<button type="submit" id="submit onclick=" validate()>Login</button>-->

        <!--<label>-->
          <!--<input type="checkbox" checked="checked" name="remember"> Remember me-->
        <!--</label>-->
      <!--</div>-->

      <!--<div class="container" style="background-color:#f1f1f1">-->

        <!--<span class="psw">Forgot <a href="#">password?</a></span>-->
        <!--<navigation/>-->
      <!--</div>-->
    <!--</form>-->
  <!--</div>-->
<!--</body>-->
  <!--</div>-->
<!--</template>-->

<!--import Navigation from './navigation'-->
<!--<script>-->
<!--/* eslint-disable */-->
<!--export default {-->
  <!--name: 'Login',-->
  <!--attempt: 3}-->
<!--// Below function Executes on click of login button.-->
<!--function validate () {-->
  <!--var username = document.getElementById('username').value-->
  <!--var password = document.getElementById('password').value-->

  <!--if (username == 'Formget' && password === 'formget#123') {-->
    <!--alert('Login successfully')-->
    <!--window.location = 'success.html' // Redirecting to other page.-->
    <!--return false-->
  <!--} else {-->
    <!--attempt&#45;&#45;// Decrementing by one.-->
    <!--alert('You have left ' + attempt + ' attempt;')-->

    <!--// Disabling fields after 3 attempts.-->

    <!--if (attempt == 0) {-->
      <!--document.getElementById('username').disabled = true-->
      <!--document.getElementById('password').disabled = true-->
      <!--document.getElementById('submit').disabled = true-->
      <!--return false-->
    <!--}-->
  <!--}-->
<!--}-->
<!--// Get the modal-->
   <!--var modal = document.getElementById('clickaction')-->

<!--// When the user clicks anywhere outside of the modal, close it-->
<!--window.onclick = function (event) {-->
  <!--if (event.target == modal) {-->
    <!--modal.style.display = 'none'-->
  <!--}-->
<!--}-->
<!--</script>-->

<!--<style scoped>-->
  <!--body {font-family: segoe ui;}-->

  <!--/* Full-width input fields */-->
  <!--input[type=text], input[type=password] {-->
    <!--width: 100%;-->
    <!--padding: 12px 20px;-->
    <!--margin: 8px 0;-->
    <!--display: inline-block;-->
    <!--border: 1px solid #ccc;-->
    <!--box-sizing: border-box;-->
  <!--}-->

  <!--/* Set a style for all buttons */-->
  <!--button {-->
    <!--background-color: #4CAF50;-->
    <!--color: white;-->
    <!--padding: 14px 20px;-->
    <!--margin: 8px 0;-->
    <!--border: none;-->
    <!--cursor: pointer;-->
    <!--width: 100%;-->
  <!--}-->

  <!--button:hover {-->
    <!--opacity: 0.8;-->
  <!--}-->

  <!--/* Extra styles for the cancel button */-->
  <!--.cancelbtn {-->
    <!--width: auto;-->
    <!--padding: 10px 18px;-->
    <!--background-color: #f44336;-->
  <!--}-->

  <!--/* Center the image and position the close button */-->
  <!--.imgcontainer {-->
    <!--text-align: center;-->
    <!--margin: 24px 0 12px 0;-->
    <!--position: relative;-->
  <!--}-->

  <!--img.avatar {-->
    <!--width: 40%;-->
    <!--border-radius: 50%;-->
  <!--}-->

  <!--.container {-->
    <!--padding: 16px;-->
  <!--}-->

  <!--span.psw {-->
    <!--float: right;-->
    <!--padding-top: 16px;-->
  <!--}-->

  <!--/* The Modal (background) */-->
  <!--.modal {-->
    <!--display: none; /* Hidden by default */-->
    <!--position: fixed; /* Stay in place */-->
    <!--z-index: 1; /* Sit on top */-->
    <!--left: 0;-->
    <!--top: 0;-->
    <!--width: 100%; /* Full width */-->
    <!--height: 100%; /* Full height */-->
    <!--overflow: auto; /* Enable scroll if needed */-->
    <!--background-color: rgb(0,0,0); /* Fallback color */-->
    <!--background-color: rgba(0,0,0,0.4); /* Black w/ opacity */-->
    <!--padding-top: 60px;-->
  <!--}-->

  <!--/* Modal Content/Box */-->
  <!--.modal-content {-->
    <!--background-color: #fefefe;-->
    <!--margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */-->
    <!--border: 1px solid #888;-->
    <!--width: 80%; /* Could be more or less, depending on screen size */-->
  <!--}-->

  <!--/* The Close Button (x) */-->
  <!--.close {-->
    <!--position: absolute;-->
    <!--right: 25px;-->
    <!--top: 0;-->
    <!--color: #000;-->
    <!--font-size: 35px;-->
    <!--font-weight: bold;-->
  <!--}-->

  <!--.close:hover,-->
  <!--.close:focus {-->
    <!--color: red;-->
    <!--cursor: pointer;-->
  <!--}-->

  <!--/* Add Zoom Animation */-->
  <!--.animate {-->
     <!-- -webkit-animation: animatezoom 0.6s;-->
    <!--animation: animatezoom 0.6s-->
  <!--}-->

  <!--@-webkit-keyframes animatezoom {-->
    <!--from {-webkit-transform: scale(0)}-->
    <!--to {-webkit-transform: scale(1)}-->
  <!--}-->

  <!--@keyframes animatezoom {-->
    <!--from {transform: scale(0)}-->
    <!--to {transform: scale(1)}-->
  <!--}-->

  <!--/* Change styles for span and cancel button on extra small screens */-->
  <!--@media screen and (max-width: 300px) {-->
    <!--span.psw {-->
      <!--display: block;-->
      <!--float: none;-->
    <!--}-->
    <!--.cancelbtn {-->
      <!--width: 100%;-->
    <!--}-->
  <!--}-->
<!--</style>-->
