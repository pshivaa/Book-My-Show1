package com.CarProject.SemiProject.ServiceImpl;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.SimpleNaturalIdLoadAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarProject.SemiProject.Entity.BookDetails;
import com.CarProject.SemiProject.Entity.CarInfo;
import com.CarProject.SemiProject.Entity.DriverDetails;
import com.CarProject.SemiProject.Entity.DriverHotel;
import com.CarProject.SemiProject.Entity.FinalConfirm;
import com.CarProject.SemiProject.Entity.UserBookCar;
import com.CarProject.SemiProject.Entity.UserLogin;
import com.CarProject.SemiProject.Entity.UserRegister;
import com.CarProject.SemiProject.Repository.BookCarRepository;
import com.CarProject.SemiProject.Repository.BookDetailsRepository;
import com.CarProject.SemiProject.Repository.CarInfoRepository;
import com.CarProject.SemiProject.Repository.DriverDetailsRepository;
import com.CarProject.SemiProject.Repository.DriverHotelRepository;
import com.CarProject.SemiProject.Repository.FinalRecodRepository;
import com.CarProject.SemiProject.Repository.RegisterRepository;
import com.CarProject.SemiProject.Repository.UserRepository;
import com.CarProject.SemiProject.dto.AllBookDetails;
import com.CarProject.SemiProject.dto.FinalConfirmDTO;
import com.CarProject.SemiProject.dto.UserDTORegister;
import com.CarProject.SemiProject.service.MainService;

@Service
public class ServiceImpl implements MainService {

	
	@Autowired
	private DriverHotelRepository driverHotelRepository;
	
	@Autowired
	private FinalRecodRepository finalRecodRepository;
	
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;
	
	@Autowired
	private CarInfoRepository carInfoRepository;
	
	@Autowired
	private BookDetailsRepository bookDetailsRepository;
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private   UserRepository userRepository;
	
	@Autowired
	private BookCarRepository bookCarRepository;
	@Override
	public UserRegister StoreUserRegisterData(UserDTORegister userDTORegister) {
		// TODO Auto-generated method stub
		System.out.println(userDTORegister);
		UserRegister userRegister=new UserRegister();
		userRegister.setFirstName(userDTORegister.getFname());
		userRegister.setLastName(userDTORegister.getLname());
		userRegister.setEmail(userDTORegister.getEmail());
		userRegister.setPassWord(userDTORegister.getPassword());
		
		UserLogin userLogin=new UserLogin();
		userLogin.setUsername(userDTORegister.getUserName());
		userLogin.setPassword(userDTORegister.getPassword());
		
		userRegister.setUserLogin(userLogin);
		userRepository.save(userLogin);
		registerRepository.save(userRegister);
		return userRegister;
		
	}

	@Override
	public CarInfo StoreCarInfo(CarInfo carInfo) {
		// TODO Auto-generated method stub
		return carInfoRepository.save(carInfo);
	}

	@Override
	public List<CarInfo> findAll() {
		// TODO Auto-generated method stub
		return carInfoRepository.findAll();
	}

	@Override
	public Optional<CarInfo> findById(int id) {
		
		return carInfoRepository.findById(id);
	}

	@Override
	public UserBookCar storeBookCar(UserBookCar userBookCar) {
		// TODO Auto-generated method stub
		return bookCarRepository.save(userBookCar);
	}

	@Override
	public void showAllBookDetails(AllBookDetails userBookCar) {
		// TODO Auto-generated method stub
		BookDetails allBookDetails=new BookDetails();
		allBookDetails.setCarCompany(userBookCar.getCarCompany());
		allBookDetails.setCarColor(userBookCar.getCarColor());
		allBookDetails.setCarModel(userBookCar.getCarModel());
		allBookDetails.setCarType(userBookCar.getCarType());
		allBookDetails.setCarOwner(userBookCar.getCarOwner());
		allBookDetails.setCarImg(userBookCar.getCarImg());
		allBookDetails.setNumPlate(userBookCar.getNumPlate());
		allBookDetails.setInsuranceValidity(userBookCar.getInsuranceValidity());
		allBookDetails.setFuelType(userBookCar.getFuelType());
		allBookDetails.setFeature(userBookCar.getFeature());
		allBookDetails.setPickUpLocation(userBookCar.getPickUpDate());
		allBookDetails.setDropLocation(userBookCar.getDropLocation());
		allBookDetails.setPickUpTime(userBookCar.getPickUpTime());
		allBookDetails.setPickUpDate(userBookCar.getPickUpDate());
		allBookDetails.setDropDate(userBookCar.getDropDate());
		allBookDetails.setPassangerCapacity(userBookCar.getPassangerCapacity());
		allBookDetails.setMembers(userBookCar.getMembers());
		allBookDetails.setDays(userBookCar.getDays());
		allBookDetails.setNumBags(userBookCar.getNumBags());
		allBookDetails.setTotalPrice(userBookCar.getTotalPrice());
		allBookDetails.setCarId(userBookCar.getCarId());
		bookDetailsRepository.save(allBookDetails);
	}

	@Override
	public List<BookDetails> findAllData() {
		// TODO Auto-generated method stub
		return bookDetailsRepository.findAll();
	}

	@Override
	public DriverDetails save(DriverDetails driverDetails) {
		// TODO Auto-generated method stub
		return driverDetailsRepository.save(driverDetails);
	}

	@Transactional
	@Override
	public FinalConfirm saveDataConfirm(FinalConfirmDTO finalConfirmDTO) {
		// TODO Auto-generated method stub
		FinalConfirm finalConfirm=new FinalConfirm();
		finalConfirm.setFirstName(finalConfirmDTO.getFname());
		finalConfirm.setCarColor(finalConfirmDTO.getCarColor());
		finalConfirm.setCarCompany(finalConfirmDTO.getCarCompany());
		finalConfirm.setCardNo(finalConfirmDTO.getCardNo());
		finalConfirm.setCarImg(finalConfirmDTO.getCarImg());
		finalConfirm.setCarModel(finalConfirmDTO.getCarModel());
		finalConfirm.setCarType(finalConfirmDTO.getCarType());
		finalConfirm.setCharges(finalConfirmDTO.getCharges());
		finalConfirm.setDays(finalConfirmDTO.getDays());
		finalConfirm.setDriverImg(finalConfirmDTO.getDriverImg());
		finalConfirm.setDriverMobNo(finalConfirmDTO.getDriverMobNo());
		finalConfirm.setDriverName(finalConfirmDTO.getDriverName());
		finalConfirm.setDropDate(finalConfirmDTO.getDropDate());
		finalConfirm.setDropLocation(finalConfirmDTO.getDropLocation());
		finalConfirm.setEmail(finalConfirmDTO.getEmail());
		finalConfirm.setFinalCost(Long.parseLong(finalConfirmDTO.getFinalCost()));
	    finalConfirm.setFuelType(finalConfirmDTO.getFuelType());
	    finalConfirm.setHotel(finalConfirmDTO.getHotel());
	    finalConfirm.setLastName(finalConfirmDTO.getLname());
	    finalConfirm.setManageParking(finalConfirmDTO.getManageParking());
	    finalConfirm.setMembers(finalConfirmDTO.getMembers());
	    finalConfirm.setPassangerCapacity(Integer.parseInt(finalConfirmDTO.getPassangerCapacity()));
	    finalConfirm.setPickUpDate(finalConfirmDTO.getPickUpDate());
	    finalConfirm.setPickUpLocation(finalConfirmDTO.getPickUpLocation());
	    finalConfirm.setPickUpTime(finalConfirmDTO.getPickUpTime());
	    finalConfirm.setRoom(finalConfirm.getRoom());
	    finalConfirm.setStay(finalConfirmDTO.getStay());
	    return finalRecodRepository.save(finalConfirm);
	}

	@Override
	public List<FinalConfirm> finaAllFinalConfirms() {
		// TODO Auto-generated method stub
		return finalRecodRepository.findAll();
	}

	@Override
	public DriverHotel saveDriverHotel(DriverHotel driverHotel) {
		// TODO Auto-generated method stub
		
		return driverHotelRepository.save(driverHotel);
	}

	@Override
	public List<CarInfo> findCarInfos() {
		// TODO Auto-generated method stub
		return carInfoRepository.findAll();
	}

	@Override
	public List<DriverDetails> finDetails() {
		// TODO Auto-generated method stub
		return driverDetailsRepository.findAll();
	}

	@Override
	public Optional<UserRegister> findByidRegister(int id) {
		// TODO Auto-generated method stub
		return registerRepository.findById(id) ;
	}

	

}
