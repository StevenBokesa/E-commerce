<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, shrink-to-fit=9">
		<meta name="description" content="Gambolthemes">
		<meta name="author" content="Gambolthemes">
		<title>Goeveni - Login Now</title>
		
		<!-- Favicon Icon -->
		<link rel="icon" type="image/png" href="images/fav.png">
		
		<!-- Stylesheets -->
		<link href="css/responsive.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		<link href="css/datepicker.min.css" rel="stylesheet">
		<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
		<link href="vendor/OwlCarousel/assets/owl.carousel.css" rel="stylesheet">
		<link href="vendor/OwlCarousel/assets/owl.theme.default.min.css" rel="stylesheet">
	
	</head>

	<body class="body-bg">				
		<!-- Body Start -->	
		<main class="register-mp">	
			<div class="main-section">
				<div class="container">					
					<div class="row justify-content-md-center">
						<div class="col-md-10">
							<div class="login-register-bg">
								<div class="row no-gutters">
									<div class="col-lg-6">
										<div class="lg-left">
											<div class="lg-logo">
												<a href="index.html"><img src="images/login-register/logo.svg" alt=""></a>
											</div>
											<div class="lr-text">
												<h2>Login Now</h2>
												<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla interdum blandit felis a hendrerit.</p>
											</div>
										</div>
									</div>
									<div class="col-lg-6">
										<div class="lr-right">
											<div class="social-logins">
												<button class="social-f-btn"><i class="fab fa-facebook-f"></i>Continue with facebook</button>
												<button class="social-g-btn"><i class="fab fa-google"></i>Continue with Google</button>
											</div>
											<div class="or">Or</div>
											<div class="login-register-form">
												<form action="Login" method="post">
													<div class="form-group">									
														<input class="title-discussion-input" type="text" placeholder="Type Username" name="email">
													</div>
													<div class="form-group"
													>									
														<input class="title-discussion-input" type="password" placeholder="Password" name="password">
													</div>
													<button class="login-btn" type="submit">Login Now</button>
													<%  String message =(String)session.getAttribute("login_message"); 
   													 String failedLogin;
    												 if(message!=null){
													 out.println(message);
												   	session.removeAttribute("login_message");
												     }
  													  %>
												</form>
												<a href="#" class="forgot-link">Forgot Password?</a>
												<div class="regstr-link">Don’t have an account? <a href="register.jsp">Register Now</a></div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>							
					</div>										
										
				</div>
			</div>
			
		</main>
		<!-- Body End -->			
		<!-- Footer Start -->
		<footer class="footer-bg">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-12">
						<div class="footer-left">
							<ul>
								<li><a href="privacy_policy.html">Privacy</a></li>
								<li><a href="term_conditions.html">Term and Conditions</a></li>
								<li><a href="about.html">About</a></li>
								<li><a href="contact_us.html">Contact Us</a></li>							
							</ul>
						</div>
					</div>					
					<div class="col-lg-6 col-md-12">
						<div class="footer-right">
							<ul class="copyright-text">
								<li><a href="index.html"><img src="images/logo-2.svg" alt=""></a></li>
								<li><div class="ftr-1"><i class="far fa-copyright"></i> 2019 Goeveni by <a href="https://themeforest.net/user/gambolthemes">Gambolthemes</a>. All Rights Reserved.</div></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<!-- Footer End -->			
		<!-- Scripts js -->	
		<script src="js/jquery.min.js"></script>
		<script src="js/skills-search.js"></script>
		<script src="js/jquery.nice-select.js"></script>
		<script src="js/datepicker.min.js"></script>
		<script src="js/i18n/datepicker.en.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		<script src="vendor/OwlCarousel/owl.carousel.js"></script>		
		<script src="js/custom1.js"></script>
		
	</body>
	
</html>