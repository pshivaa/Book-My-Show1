package com.CarProject.SemiProject.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarProject.SemiProject.Entity.BookDetails;
import com.CarProject.SemiProject.Entity.CarInfo;
import com.CarProject.SemiProject.Entity.DriverDetails;
import com.CarProject.SemiProject.Entity.DriverHotel;
import com.CarProject.SemiProject.Entity.FinalConfirm;
import com.CarProject.SemiProject.Entity.UserBookCar;
import com.CarProject.SemiProject.Entity.UserLogin;
import com.CarProject.SemiProject.Entity.UserRegister;

import com.CarProject.SemiProject.Repository.UserRepository;
import com.CarProject.SemiProject.Security.JwtAuthResponse;
import com.CarProject.SemiProject.Security.JwtTokenHelper;
import com.CarProject.SemiProject.dto.AllBookDetails;
import com.CarProject.SemiProject.dto.FinalConfirmDTO;
import com.CarProject.SemiProject.dto.UserDTOLogin;
import com.CarProject.SemiProject.dto.UserDTORegister;
import com.CarProject.SemiProject.service.MainService;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private JwtTokenHelper jwtTokenHelper;
	
	
	


	@PostMapping("/login")
	public ResponseEntity<?> logindata(@RequestBody UserDTOLogin userDTOLogin)
	{
		System.out.println("hii..");
		userDTOLogin.setUsername(userDTOLogin.getEmail());
		UserLogin user= userRepository.findByUsername(userDTOLogin.getUsername()).get();
		Optional<UserLogin> user1=userRepository.findByUsername(userDTOLogin.getUsername());
	System.out.println(user);
	    if(user.getUsername().equals(userDTOLogin.getUsername())) {
//	    	UserDetails userDetails = this.userDetailsService.loadUserByUsername(userRegister.getUsername());
	    	JwtAuthResponse jwtAuthResponse=new JwtAuthResponse();
	    	jwtAuthResponse.setUser(user1);
	    	String token =this.jwtTokenHelper.generateToken(user.getUsername());
	    	jwtAuthResponse.setAuth(token);
	    	return new ResponseEntity<JwtAuthResponse>(jwtAuthResponse,HttpStatus.OK);
	    }
		return ResponseEntity.badRequest().body("fasle");
		
	}
	
	@PostMapping("/Register")
	public ResponseEntity<?> Registerdata(@Valid @RequestBody UserDTORegister userDTORegister)
	{
		userDTORegister.setUserName(userDTORegister.getEmail());
		Optional<UserLogin> user= userRepository.findByUsername(userDTORegister.getUserName());
		if(user.isEmpty())
		{
		UserRegister userRegister =  mainService.StoreUserRegisterData(userDTORegister);
		JwtAuthResponse jwtAuthResponse=new JwtAuthResponse();
		jwtAuthResponse.setUserRegisterData(userRegister);
		String token = this.jwtTokenHelper.generateToken(userRegister.getEmail());
		jwtAuthResponse.setAuth(token);
	    	return new ResponseEntity<JwtAuthResponse>(jwtAuthResponse,HttpStatus.OK);
		}
		else if(user.get().getUsername().equals(userDTORegister.getUserName())) {
			return ResponseEntity.badRequest().body("you are already register.");
		}
		else {
			UserRegister userRegister =  mainService.StoreUserRegisterData(userDTORegister);
			JwtAuthResponse jwtAuthResponse=new JwtAuthResponse();
			String token = this.jwtTokenHelper.generateToken(userRegister.getEmail());
			jwtAuthResponse.setAuth(token);
			jwtAuthResponse.setUserRegisterData(userRegister);
		    	return new ResponseEntity<JwtAuthResponse>(jwtAuthResponse,HttpStatus.OK);
		}
	}
	
	@GetMapping("/getInfo/{id}")
	public ResponseEntity<?> getData(@PathVariable("id") int id){
		Optional<UserRegister> userRegister = mainService.findByidRegister(id);
				return ResponseEntity.badRequest().body(userRegister);
	} 
	
	
	@PostMapping("/StoreCarInfo")
	public ResponseEntity<?>  StoreCardata(@RequestBody  CarInfo carInfo)
	{
		CarInfo carInfo1=mainService.StoreCarInfo(carInfo);
		return ResponseEntity.badRequest().body("you are saving your data.");
	}
	
	@GetMapping("/cars")
	public ResponseEntity<?>  data()
	{
		List<CarInfo> carInfo1=mainService.findAll();
		return  ResponseEntity.badRequest().body(carInfo1);
	}
	
	@GetMapping("/book-car/{id}")
	public ResponseEntity<?>  carsdata(@PathVariable("id") int id)
	{
		Optional<CarInfo> carInfo1=mainService.findById(id);
		System.out.println(carInfo1);
		return  ResponseEntity.badRequest().body(carInfo1);
	}
	

	
	@PostMapping("/book-now")
	public ResponseEntity<?> bookData(@RequestBody AllBookDetails userBookCar)
	{
	   System.out.println(userBookCar);
	   mainService.showAllBookDetails(userBookCar);
		List<BookDetails> bookDetails=mainService.findAllData();
		return  ResponseEntity.badRequest().body(bookDetails);
	}
	
	@PostMapping("/DriverStore")
	public ResponseEntity<?>  StoreDriver(@RequestBody  DriverDetails  driverDetails)
	{
		
		DriverDetails driverDetails2 =  mainService.save(driverDetails);
		return ResponseEntity.badRequest().body("you are saving your data."+driverDetails2);
	}
	
	@PostMapping("/")
	public ResponseEntity<?>  StoreDrive(@RequestBody  DriverDetails  driverDetails)
	{
		
		DriverDetails driverDetails2 = mainService.save(driverDetails);
		return ResponseEntity.badRequest().body("you are saving your data."+driverDetails2);
	}
	
	@GetMapping("/drivers")
	public ResponseEntity<?>  carsdata1()
	{
		List<DriverDetails> carInfo1=mainService.finDetails();
		System.out.println("hii"+carInfo1);
		return  ResponseEntity.badRequest().body(carInfo1);
	}
	@PostMapping("/finalConfirm")
	public ResponseEntity<?> StoreFinalRecord(@RequestBody FinalConfirmDTO finalConfirm)
	{
		FinalConfirm finnConfirm= mainService.saveDataConfirm(finalConfirm);
		return ResponseEntity.badRequest().body(finnConfirm);
	}
	
	@GetMapping("/ticket-details/{email}")
	public ResponseEntity<?>  showDataEmailBases(@PathVariable("email") String email)
	{
		List<FinalConfirm> finalConfirm=mainService.finaAllFinalConfirms();
		List<FinalConfirm>finalConfirmResult=finalConfirm.stream().filter(x->x.getEmail().equals(email)).collect(Collectors.toList());
		return  ResponseEntity.badRequest().body(finalConfirmResult);
	}
	
	@PostMapping("/driver-hotel")
	public ResponseEntity<?> postData(@RequestBody DriverHotel driverHotel)
	{
		System.out.println(driverHotel);
		DriverHotel driverHotel1=mainService.saveDriverHotel(driverHotel);
		return ResponseEntity.badRequest().body(driverHotel1);
	}
	
}
