<html>
<body>

<?php
   
   $servername = "herder-koeln.de";
   $user = "lukas";
   $password = "Lu1904Kas";
   
   $con = new mysqli($servername, $user, $password, "wordpress");
   
   if($con->connect_error)
   {
	   die("Connection failed".$con->connect_error);	
   }	
   echo "Connection successful!";
   
   
   
   
?>

</body>
</html>