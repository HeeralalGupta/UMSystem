

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw = response.getWriter();
		
		
		// Printing data after sign up on  the servlet page
		response.setContentType("text/html");
		pw.print("<html><head></head><body>");

		
		pw.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Sign Up</title>	\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\">\r\n"
				+ "<style>\r\n"
				+ "* {\r\n"
				+ "	margin: 0px;\r\n"
				+ "	padding: 0px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "body {\r\n"
				+ "	background: url(image/allbackground.jpg);\r\n"
				+ "	background-repeat: no-repeat;\r\n"
				+ "	background-attachment: fixed;\r\n"
				+ "	background-size: cover;\r\n"
				+ "	background-color: black;\r\n"
				+ "	color: black;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".overlay {\r\n"
				+ "	background: rgba(0, 0, 0, 0.6);\r\n"
				+ "	width: 100%;\r\n"
				+ "	height: 100vh;\r\n"
				+ "	position: absolute;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".container {\r\n"
				+ "	width: 360px;\r\n"
				+ "	height: 520px;\r\n"
				+ "	background-color: rgba(8, 215, 173, 0.18);\r\n"
				+ "	color: white;\r\n"
				+ "	margin: auto;\r\n"
				+ "	margin-top: -260px;\r\n"
				+ "	padding: 10px;\r\n"
				+ "	position: relative;\r\n"
				+ "	top: 50%;\r\n"
				+ "	border-radius: 10px;\r\n"
				+ "	box-shadow: 5px 10px 20px rgba(0, 230, 184, 0.96) inset;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".inneritem {\r\n"
				+ "	margin-top: 30px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "input {\r\n"
				+ "	margin-bottom: 15px;\r\n"
				+ "	width: 300px;\r\n"
				+ "	height: 35px;\r\n"
				+ "	background-color: rgba(0, 0, 0, 0.25);\r\n"
				+ "	color: white;\r\n"
				+ "	font-size: 15px;\r\n"
				+ "	border: 1px solid silver;\r\n"
				+ "	border-radius: 10px;\r\n"
				+ "	caret-color: white;\r\n"
				+ "	padding: 3px;\r\n"
				+ "	padding-left: 10px;\r\n"
				+ "	transition: all 0.5s ease;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ " input:focus{"
				+ "outline: none;"
				+ "border-color: rgba(0, 155, 124, 0.96);}\r\n"
				+ "h2 {\r\n"
				+ "	width: 50px;\r\n"
				+ "	height: 50px;\r\n"
				+ "	margin-top: -55px;\r\n"
				+ "	background-color: rgba(0, 155, 124, 0.96);\r\n"
				+ "	padding: 25px;\r\n"
				+ "	border-radius: 200px;\r\n"
				+ "	box-shadow: 5px, 5px, 7px, silver;\r\n"
				+ "}\r\n"
				+ ".btn{\r\n"
				+ "	width: 40%;\r\n"
				+ "	height: 30px;\r\n"
				+ "	border: 1px solid #0DFEE6;\r\n"
				+ "	background-color: transparent;\r\n"
				+ "	color: #0DFEE6;\r\n"
				+ "	border-radius: 30px;\r\n"
				+ "	transition-duration: 1s;\r\n"
				+ "}\r\n"
				+ ".btn:hover{\r\n"
				+ "	background-color: rgba(0, 155, 124, 0.96);\r\n"
				+ "	border-color: rgba(0, 155, 124, 0.96);\r\n"
				+ "	color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".newuser{\r\n"
				+ "	margin-top: 20px;\r\n"
				+ "	background-color: transparent;\r\n"
				+ "	color: white;\r\n"
				+ "	transition-duration: 1s;\r\n"
				+ "	border: none;\r\n"
				+ "	padding: 5px;\r\n"
				+ "	border-radius: 20px;\r\n"
				+ "}\r\n"
				+ ".newuser:hover{\r\n"
				+ "	background-color: rgba(0, 155, 124, 0.96);\r\n"
				+ "	border-color: rgba(0, 155, 124, 0.96);\r\n"
				+ "}\r\n"
				+ "label{\r\n"
				+ "	color: #0DFEE6;\r\n"
				+ "}\r\n"
				+ "#togglePassword{\r\n"
				+ "		position: absolute;\r\n"
				+ "		top: 34.9%;\r\n"
				+ "		left: 81%;\r\n"
				+ "  	color: rgba(8, 215, 173, 0.50);\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<div class = \"overlay\">\r\n"
				+ "	<div class=\"container\" align=center>\r\n"
				+ "	<h2>Sign Up</h2>\r\n"
				+ "		<form action=\"RegisterMsg\" method=\"post\">\r\n"
				+ "		\r\n"
				+ "			<div class=\"inneritem\">\r\n"
				+ "			\r\n"
				+ "				<table>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><label>Name</label></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><input type=\"text\" name=\"username\" placeholder = \"name\" required>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><label>Password</label></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><input type=\"password\" id=\"id_password\" name=\"password\" placeholder = \"password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" required>\r\n"
				+ "							<i class=\"far fa-eye\" id=\"togglePassword\" style=\"cursor: pointer;\"></i>"	
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><label>Email</label></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><input type=\"email\" name=\"email\" placeholder = \"email\"  required>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><label>Mobile Number</label></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><input type=\"text\" name=\"mnumb\" placeholder = \"mobile number\" pattern=\"[1-9]{1}[0-9]{9}\" minlength = \"10\" maxlength = \"10\" required>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><label>DOB</label></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><input type=\"date\" name=\"dob\" placeholder = \"dob\" required>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td><button type=\"submit\" class = \"btn\">Register</button></td>\r\n"
				+ "					</tr>\r\n"
				+ "					\r\n"
				+ "				</table>\r\n"
				+ "			</div>\r\n"
				+ "		</form>\r\n"
				+ "		<form action= \"Login\" method= \"post\"><label >Back to login </label><button type = \"submit\" class = \"newuser\">Click here</button></form>\r\n"
				+ "	</div>\r\n"
				+ "	</div>\r\n"
				+ "</body>\r\n"
				
				+ "<script>\r\n"
				+ "	const togglePassword = document.querySelector('#togglePassword');\r\n"
				+ "	const password = document.querySelector('#id_password');\r\n"
				+ "	\r\n"
				+ "	togglePassword.addEventListener('click', function (e) {\r\n"
				+ "	  // toggle the type attribute\r\n"
				+ "	  const type = password.getAttribute('type') === 'password' ? 'text' : 'password';\r\n"
				+ "	  password.setAttribute('type', type);\r\n"
				+ "	  // toggle the eye slash icon\r\n"
				+ "	  this.classList.toggle('fa-eye-slash');\r\n"
				+ "	});\r\n"
				+ "</script>\r\n"
				
				+ "</html>");
			
	}

}