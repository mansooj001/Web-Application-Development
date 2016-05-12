<%@ page import="model.ServiceProvider" %><%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 5/12/2016
  Time: 04:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>My Posts</title>
    <link href='https://fonts.googleapis.com/css?family=Work+Sans:400,100,200,300,500,600,700,800,900' rel='stylesheet'
          type='text/css'>
</head>
<body>
<table>
    <c:forEach var="BlogPost" items="${blogPostList}">
        <tr>
            <th>Subject</th>
            <th>Text</th>
        </tr>
        <tr>
            <td>${User.BlogPost.subject}</td>
            <td>${User.BlogPost.text}</td>
        </tr>

    </c:forEach>
</table>

<style>
    form#login {
        position: relative;
        top: 50%;
        margin: 50% auto 0 auto;
        width: 350px;
        height: 300px;
        transform: translateY(-50%);
        background-color: #2b2b2b;
        border: none;
    }

    form#login:before {
        content: "";
        position: absolute;
        height: 10px;
        bottom: 100%;
        width: 100%;
        background-image: linear-gradient(45deg, #6D2626 50%, #9A2929 50%, #9A2929 80%, #C83434 80%);
        left: 0;
        right: 0;
        margin: 0 auto;
    }

    form#login:after {
        content: "";
        position: absolute;
        top: 100%;
        left: 0;
        right: 0;
        margin: 0 auto;
        border-top: 40px solid #2b2b2b;
        border-left: 175px solid transparent;
        border-right: 175px solid transparent;
    }

    form#login .input {
        width: 300px;
        height: 50px;
        position: relative;
        left: 50%;
        transform: translateX(-50%);
        border: none;
        outline: none;
        background-color: #1c1c1c;
        color: #fff;
        box-sizing: border-box;
        padding-left: 20px;
    }

    form#login .input:first-of-type {
        margin: 20px 0 10px 0;
    }

    div.icon {
        height: 90px;
        border-bottom: 1px solid #565656;
        width: 300px;
        margin: 0 25px;
        text-align: center;
    }

    div.icon > span {
        color: #fff;
        line-height: 90px;
        font-size: 40px;
    }

    form#login div.options {
        width: 300px;
        margin: 20px 25px 0 25px;
        position: relative;
    }

    form#login div.options:before {
        content: "";
        position: absolute;
        left: 0;
        right: 0;
        margin: 10px auto;
        height: 20px;
        width: 1px;
        background-color: #aaa;
    }

    form#login div.options > input,
    form#login div.options > button {
        border: none;
        height: 40px;
        width: 150px;
        float: left;
        text-transform: uppercase;
        cursor: pointer;
        transition: 0.2s ease-in-out;
    }

    form#login div.options > input {
        background-color: #fff;
    }

    form#login div.options > input:hover {
        background-color: #ccc;
    }

    form#login div.options > button {
        border: 1px solid #fff;
        box-sizing: border-box;
        background-color: transparent;
    }

    form#login div.options > button:hover {
        background-color: #fff;
    }

    form#login div.options > button a {
        text-decoration: none;
        color: #fff;
    }

    form#login div.options > button:hover a {
        color: #222;
    }

    * {
        font-family: Work sans;
    }

    body {
        background-color: #3f3f3f;
    }

    @font-face {
        font-family: 'excidence';
        src: url('https://raw.githubusercontent.com/Exodioum/excidence-icons/gh-pages/icons/fonts/excidence.ttf?kno3i3') format('truetype'), url('https://raw.githubusercontent.com/Exodioum/excidence-icons/gh-pages/icons/fonts/excidence.woff?kno3i3') format('woff'), url('https://raw.githubusercontent.com/Exodioum/excidence-icons/gh-pages/icons/fonts/excidence.svg?kno3i3#excidence') format('svg');
        font-weight: normal;
        font-style: normal;
    }

    [class^="cd-"],
    [class*=" cd-"] {
        /* use !important to prevent issues with browser extensions that change fonts */
        font-family: 'excidence' !important;
        speak: none;
        font-style: normal;
        font-weight: normal;
        font-variant: normal;
        text-transform: none;
        line-height: 1;
        /* Better Font Rendering =========== */
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }

    .cd-person-line:before {
        content: "\e900";
    }
    .offscreen {
        position: absolute;
        top: -30em;
        left: -300em;
    }

    div#hmenu {
        margin: 0;
        padding: .3em 0 .3em 0;
        background: #ddeebb;
        width: 100%;
        text-align: center;
    }

    div#hmenu ul {
        list-style: none;
        margin: 0;
        padding: 0;
    }

    div#hmenu ul li {
        margin: 0;
        padding: 0;
        display: inline;
    }

    div#hmenu ul a:link{
        margin: 0;
        padding: .3em .4em .3em .4em;
        text-decoration: none;
        font-weight: bold;
        font-size: medium;
        color: #004415;
    }

    div#hmenu ul a:visited{
        margin: 0;
        padding: .3em .4em .3em .4em;
        text-decoration: none;
        font-weight: bold;
        font-size: medium;
        color: #227755;
    }

    div#hmenu ul a:active{
        margin: 0;
        padding: .3em .4em .3em .4em;
        text-decoration: none;
        font-weight: bold;
        font-size: medium;
        color: #227755;
    }

    div#hmenu ul a:hover{
        margin: 0;
        padding: .3em .4em .3em .4em;
        text-decoration: none;
        font-weight: bold;
        font-size: medium;
        color: #f6f0cc;
        background-color: #227755;
    }
</style>
</body>
<footer>
    <h2 class="offscreen">W3C Web Resources</h2>
    <div id="hmenu">
        <ul>
            <li><a href="/index.jsp">Home</a></li>
            <li><a href="/register.jsp">Register</a></li>
            <li><a href="/blogger/myaccount.jsp">My Account</a></li>
            <li><a href="/blogger/myposts.jsp">My Posts</a></li>
            <li><a href="/LogoutServlet.do">Logout</a></li>
        </ul>
    </div>
</footer>
</html>
