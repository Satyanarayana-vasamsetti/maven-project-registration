<html>
<body>
<style>
    form{
      display: flex;
      align-items: center;
      justify-content: center;
      flex-direction: column;
    }
    input{
      padding:0.8rem;
      width: 20%;
    }
    input::placeholder{
      font-size: 1rem;
    }
    button{
      padding: 0.5rem 1.5rem;
      font-size: 1rem;
      font-weight: bold;
      border: 2px solid skyblue;
      color: skyblue;
      background-color: none;
      border-radius: 5px;
      transition: all ease 0.4s;
    }
    button:hover{
      background-color: skyblue;
      color: #fff;
      
    }
</style>
	<form action="login" method="post">
		<input type="text" name="username" id=""
			placeholder="Enter your username"><br> <input
			type="email" name="email" id="" placeholder="Enter your email"><br>
		<input type="password" name="password" id=""
			placeholder="Enter your password"><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>
