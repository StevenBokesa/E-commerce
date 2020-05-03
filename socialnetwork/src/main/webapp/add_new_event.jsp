<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, shrink-to-fit=9">
		<meta name="description" content="Gambolthemes">
		<meta name="author" content="Gambolthemes">
		<title>Goeveni - Add New Event</title>
		
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

	<body>		
		<!-- Header Start -->
		<header>
			<div class="container">				
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12">
						<nav class="navbar navbar-expand-lg navbar-light bg-dark1 justify-content-sm-start">
							<a class="order-1 order-lg-0 ml-lg-0 ml-3 mr-auto" href="index.html"><img src="images/logo.svg" alt=""></a>
							<button class="navbar-toggler align-self-start" type="button">
								<i class="fas fa-bars"></i>
							</button>
							<div class="collapse navbar-collapse d-flex flex-column flex-lg-row flex-xl-row justify-content-lg-end bg-dark1 p-3 p-lg-0 mt1-5 mt-lg-0 mobileMenu" id="navbarSupportedContent">
								<ul class="navbar-nav align-self-stretch">
									<li class="nav-item active">
										<a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
									</li>
									<li class="nav-item">
										<a class="nav-link" href="discussions.html">Discussion</a>
									</li>									
									<li class="nav-item">
										<a class="nav-link" href="weather.html">Weather</a>
									</li>
									<li class="nav-item dropdown">
										<a href="#" class="nav-link dropdown-toggle-no-caret" role="button" data-toggle="dropdown">
											Pages
										</a>
										<div class="dropdown-menu pages-dropdown">
											<a class="link-item" href="login.html">Login</a>
											<a class="link-item" href="register.html">Register</a>											
											<a class="link-item" href="error_404.html">Error 404</a>
											<a class="link-item" href="categories.html">Categories</a>
											<a class="link-item" href="select_seats.html">Select Seats</a>
											<a class="link-item" href="find_friends.html">Find Friends</a>
											<a class="link-item" href="user_dashboard_activity.html">User Detail View</a>
											<a class="link-item" href="checkout.html">Checkout</a>
											<a class="link-item" href="confirmed_order.html">Confirmed Order</a>
											<a class="link-item" href="about.html">About</a>
											<a class="link-item" href="contact_us.html">Contact</a>
										</div>
									</li>
									<li class="nav-item">
										<a class="nav-link" href="our_blog.html">Blog</a>
									</li>
								</ul>
								<a href="add_new_event.html" class="add-event">Add New Event</a>
							</div>
							<ul class="group-icons">
								<li><a href="search_result.html" class="icon-set"><i class="fas fa-search"></i></a></li>
								<li class="dropdown">
									<a href="#" class="icon-set dropdown-toggle-no-caret" role="button" data-toggle="dropdown">
										<i class="fas fa-user-plus"></i>
									</a>
									<div class="dropdown-menu user-request-dropdown dropdown-menu-right">
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt=""></a>
													<a href="#" class="user-title">Jassica William</a>
												</div>
												<button class="accept-btn">Accept</button>
											</div>											
										</div>	
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt=""></a>
													<a href="#" class="user-title">Rock Smith</a>
												</div>
												<button class="accept-btn">Accept</button>
											</div>											
										</div>	
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt=""></a>
													<a href="#" class="user-title">Joy Doe</a>
												</div>
												<button class="accept-btn">Accept</button>
											</div>											
										</div>
										<div class="user-request-list">
											<a href="my_dashboard_all_requests.html" class="view-all">View All Friend Requests</a>
										</div>	
									</div>
								</li>
								<li class="dropdown">
									<a href="#" class="icon-set dropdown-toggle-no-caret" role="button" data-toggle="dropdown">
										<i class="fas fa-envelope"></i>
									</a>
									<div class="dropdown-menu message-dropdown dropdown-menu-right">
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Jassica William </div>
														<span>Hey How are you John Doe...</span>
													</a>
												</div>
												<div class="time5">2 min ago</div>
											</div>											
										</div>
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Rock Smith </div>
														<span>Interesting Event! I will join this...</span>
													</a>
												</div>
												<div class="time5">5 min ago</div>
											</div>											
										</div>	
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Joy Doe </div>
														<span>Hey Sir! What about you...</span>
													</a>
												</div>
												<div class="time5">10 min ago</div>
											</div>											
										</div>	
										<div class="user-request-list">
											<a href="my_dashboard_messages.html" class="view-all">View All Messages</a>
										</div>	
									</div>
								</li>
								<li class="dropdown">
									<a href="#" class="icon-set dropdown-toggle-no-caret" role="button" data-toggle="dropdown">
										<i class="fas fa-bell"></i>
									</a>
									<div class="dropdown-menu notification-dropdown dropdown-menu-right">
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Jassica William </div>
														<span>comment on your video.</span>
													</a>
												</div>
												<div class="time5">2 min ago</div>
											</div>											
										</div>
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Rock Smith</div>
														<span>your order is accepted.</span>
													</a>
												</div>
												<div class="time5">5 min ago</div>
											</div>											
										</div>	
										<div class="user-request-list">
											<div class="request-users">
												<div class="user-request-dt">
													<a href="#"><img src="images/user-dp-1.jpg" alt="">
														<div class="user-title1">Joy Doe </div>
														<span>your bill slip sent on your email.</span>
													</a>
												</div>
												<div class="time5">10 min ago</div>
											</div>											
										</div>	
										<div class="user-request-list">
											<a href="my_dashboard_all_notifications.html" class="view-all">View All Notifications</a>
										</div>	
									</div>
								</li>
							</ul>
							<div class="account order-1 dropdown">
								<a href="#" class="account-link dropdown-toggle-no-caret" role="button" data-toggle="dropdown"> 
									<div class="user-dp"><img src="images/dp.jpg" alt=""></div>
									<span>Hi! John</span>
									<i class="fas fa-angle-down"></i>
								</a>
								<div class="dropdown-menu account-dropdown dropdown-menu-right">
									<a class="link-item" href="my_dashboard_activity.html">Profile</a>
									<a class="link-item" href="my_dashboard_messages.html">Messages</a>											
									<a class="link-item" href="my_dashboard_booked_events.html">Booked Events</a>
									<a class="link-item" href="my_dashboard_credits.html">Credit <span class="right-cm">$100</span></a>
									<a class="link-item" href="invite.html">Invite</a>
									<a class="link-item" href="my_dashboard_setting_info.html">Setting</a>
									<a class="link-item" href="login.html">Logout</a>									
								</div>
							</div>							
						</nav>
						<div class="overlay"></div>
					</div>					
				</div>					
			</div>
		</header>
		<!-- Header End -->
		<!-- Title Bar Start -->
		<div class="title-bar">			
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<ol class="title-bar-text">
							<li class="breadcrumb-item"><a href="index.html">Home</a></li>							
							<li class="breadcrumb-item active" aria-current="page">Add New Event</li>
						</ol>
					</div>		
				</div>		
			</div>		
		</div>		
		<!-- Title Bar End -->
		<!-- Body Start -->	
		<main class="discussion-mp">	
			<div class="main-section">
				<div class="container">
					<div class="row justify-content-md-center">
						<div class="col-lg-8 col-md-8">
							<div class="checkout-heading text-center">
								<h2>Add New Event</h2>								
							</div>
							<div class="add-event-bg">
								<form action="CreateEvent" enctype="multipart/form-data" method="post">
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-pencil-alt"></i>
											<h6>Title*</h6>
										</div>
										<div class="add-input-items">
											<input class="add-inputs" type="text" placeholder="Event Title Here" name="title">
										</div>
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-pencil-alt"></i>
											<h6>Description*</h6>
										</div>
										<div class="add-input-items">
											<input class="add-inputs" type="text" placeholder="Description Here" name="description">                 
										</div>
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-ticket-alt"></i>
											<h6>Ticket Price*</h6>
										</div>
										<div class="add-input-items">
											<input class="add-inputs" type="text" placeholder="Enter Ticket Price" name="price">
										</div>
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-info-circle"></i>
											<h6>Event Details*</h6>
										</div>
										<div class="add-input-items">										
											<div class="add-evnt-dt">										
												<input class="add-inputs" type="text" placeholder="Search City" name="city">
												<i class="fas fa-search ev-icon"></i>
											</div>
											<div class="add-evnt-dt">										
												<input class="add-date-input datepicker-here" data-language="en" type="text" placeholder="Select Date" name="date">
												<i class="fas fa-calendar-alt dte-icon"></i>
											</div>
											<div class="add-evnt-dt">											
												<div class="row">											
													<div class="col-md-6">											
														<div class="select-bg mt-20">									
															<select class="wide" name="start">
																<option>Start Time</option>	
																<option>12.00 AM</option>																																
																<option>12.30 AM</option>																																
																<option>01.00 AM</option>																																
																<option>01.30 AM</option>																																
																<option>02.00 AM</option>																																
																<option>02.30 AM</option>																																
																<option>03.00 AM</option>																																
																<option>03.30 AM</option>																																
																<option>04.00 AM</option>																																
																<option>04.30 AM</option>																																
																<option>05.00 AM</option>																																
																<option>05.30 AM</option>																																
																<option>06.00 AM</option>																																
																<option>06.30 AM</option>																																
																<option>07.00 AM</option>																																
																<option>07.30 AM</option>																																
																<option>08.00 AM</option>																																
																<option>08.30 AM</option>																																
																<option>09.00 AM</option>																																
																<option>09.30 AM</option>																																
																<option>10.00 AM</option>																																
																<option>10.30 AM</option>																																
																<option>11.00 AM</option>																																
																<option>11.30 AM</option>																																
																<option>12.00 PM</option>																																
																<option>12.30 PM</option>																																
																<option>01.00 PM</option>																																
																<option>01.30 PM</option>																																
																<option>02.00 PM</option>																																
																<option>02.30 PM</option>																																
																<option>03.00 PM</option>																																
																<option>03.30 PM</option>																																
																<option>04.00 PM</option>																																
																<option>04.30 PM</option>																																
																<option>05.00 PM</option>																																
																<option>05.30 PM</option>																																
																<option>06.00 PM</option>																																
																<option>07.00 PM</option>																																
																<option>07.30 PM</option>																																
																<option>08.00 PM</option>																																
																<option>08.30 PM</option>																																
																<option>09.00 PM</option>																																
																<option>09.30 PM</option>																																
																<option>10.00 PM</option>																																
																<option>10.30 PM</option>																																
																<option>11.00 PM</option>																																
																<option>11.30 PM</option>																																																																																																																							
															</select>
														</div>																					
													</div>
													<div class="col-md-6">											
														<div class="select-bg mt-20">									
															<select class="wide" name="end">
																<option>End Time</option>	
																<option>12.00 AM</option>																																
																<option>12.30 AM</option>																																
																<option>01.00 AM</option>																																
																<option>01.30 AM</option>																																
																<option>02.00 AM</option>																																
																<option>02.30 AM</option>																																
																<option>03.00 AM</option>																																
																<option>03.30 AM</option>																																
																<option>04.00 AM</option>																																
																<option>04.30 AM</option>																																
																<option>05.00 AM</option>																																
																<option>05.30 AM</option>																																
																<option>06.00 AM</option>																																
																<option>06.30 AM</option>																																
																<option>07.00 AM</option>																																
																<option>07.30 AM</option>																																
																<option>08.00 AM</option>																																
																<option>08.30 AM</option>																																
																<option>09.00 AM</option>																																
																<option>09.30 AM</option>																																
																<option>10.00 AM</option>																																
																<option>10.30 AM</option>																																
																<option>11.00 AM</option>																																
																<option>11.30 AM</option>																																
																<option>12.00 PM</option>																																
																<option>12.30 PM</option>																																
																<option>01.00 PM</option>																																
																<option>01.30 PM</option>																																
																<option>02.00 PM</option>																																
																<option>02.30 PM</option>																																
																<option>03.00 PM</option>																																
																<option>03.30 PM</option>																																
																<option>04.00 PM</option>																																
																<option>04.30 PM</option>																																
																<option>05.00 PM</option>																																
																<option>05.30 PM</option>																																
																<option>06.00 PM</option>																																
																<option>07.00 PM</option>																																
																<option>07.30 PM</option>																																
																<option>08.00 PM</option>																																
																<option>08.30 PM</option>																																
																<option>09.00 PM</option>																																
																<option>09.30 PM</option>																																
																<option>10.00 PM</option>																																
																<option>10.30 PM</option>																																
																<option>11.00 PM</option>																																
																<option>11.30 PM</option>																																																																																																																							
															</select>
														</div>																							
													</div>
												</div>
											</div>
										</div>									
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-check-square"></i>
											<h6>Event Venue and Seats*</h6>
										</div>
										<div class="add-input-items">																			
											<div class="add-evnt-dt">											
												<div class="row">											
													<div class="col-md-6">											
														<div class="select-bg mt-20">									
															<select class="wide" name="venue">
																<option>Select Venue Type</option>	
																<option>Arena</option>																																
																<option>Stadium</option>																																
																<option>Theater</option>																																
																<option>Performing Arts Facility</option>																																																																																																																																																																				
																<option>Convention / Exhibition Center</option>																																																																																																																																																																				
																<option>Conference Center</option>																																																																																																																																																																				
																<option>Multi-Purpose Venue</option>																																																																																																																																																																				
																<option>Club / Concert Venue</option>																																																																																																																																																																				
																<option>Non-Venue</option>																																																																																																																																																																				
																<option>Other</option>																																																																																																																																																																																																																																																																																																																																																					
															</select>
														</div>																					
													</div>
													<div class="col-md-6">											
														<div class="select-bg mt-20">									
															<select class="wide" name="seats">
																<option>Select Total Seats</option>	
																<option>50</option>																																
																<option>100</option>																																
																<option>150</option>																																																																																																																																																																				
																<option>200</option>																																																																																																																																																																				
																<option>250</option>																																																																																																																																																																				
																<option>300</option>																																																																																																																																																																				
																<option>350</option>																																																																																																																																																																				
																<option>400</option>																																																																																																																																																																				
																<option>450</option>																																																																																																																																																																				
																<option>500</option>																																																																																																																																																																				
																<option>550</option>																																																																																																																																																																				
																<option>600</option>																																																																																																																																																																				
																<option>650</option>																																																																																																																																																																				
																<option>700</option>																																																																																																																																																																				
																<option>750</option>																																																																																																																																																																				
																<option>800</option>																																																																																																																																																																				
																<option>850</option>																																																																																																																																																																				
																<option>900</option>																																																																																																																																																																				
																<option>950</option>																																																																																																																																																																				
																<option>1000</option>																																																																																																																																																																				
																<option>1050</option>																																																																																																																																																																				
															</select>
														</div>																							
													</div>
												</div>
											</div>
										</div>									
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-image"></i>
											<h6>Image*</h6>
										</div>
										<div class="add-input-items">																			
											<div class="add-evnt-dt">											
												<div class="event-add-img1">											
													<img src="images/add-img.jpg" alt="">
												</div>
												<div class="addpic" id="OpenImgUpload">
													<input type="file" id="file" name="photo" size="50"/>
													<label for="file">Choose File</label>
													<p>Maximum file size : 1 MB</p>
												</div>
											</div>
										</div>									
									</div>
									<div class="input-section-item">
										<div class="add-input-title">								
											<i class="fas fa-user"></i>
											<h6>Organizer Team*</h6>
										</div>
										<div class="add-input-items">
											<input class="add-inputs" type="text" placeholder="Search People" name="organizer">
										</div>
									</div>
									<div class="upload-mp">
										<button class="upload-btn" type="submit">Upload Event</button>
									</div>
								</form>
							</div>															
						</div>											
					</div>					
				</div>
			</div>
		</main>
		<!-- Body End -->			
		<!-- Footer Start -->
		<footer>
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