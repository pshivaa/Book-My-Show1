package com.CarProject.SemiProject.service;

import com.CarProject.SemiProject.Entity.BookDetails;
import com.CarProject.SemiProject.Entity.CarInfo;
import com.CarProject.SemiProject.Entity.DriverDetails;
import com.CarProject.SemiProject.Entity.DriverHotel;
import com.CarProject.SemiProject.Entity.FinalConfirm;
import com.CarProject.SemiProject.Entity.UserBookCar;
import com.CarProject.SemiProject.Entity.UserRegister;
import com.CarProject.SemiProject.dto.AllBookDetails;
import com.CarProject.SemiProject.dto.FinalConfirmDTO;
import com.CarProject.SemiProject.dto.UserDTORegister;

import java.util.List;
import java.util.Optional;

public interface MainService {
 
  public UserRegister StoreUserRegisterData(UserDTORegister userDTORegister);
  
  public CarInfo StoreCarInfo(CarInfo carInfo);
  
  public List<CarInfo> findAll();
  
  public List<FinalConfirm> finaAllFinalConfirms();
  
  public List<BookDetails> findAllData();
  
  public List<CarInfo>findCarInfos();
  
  public Optional<CarInfo> findById(int id);
  
  public Optional<UserRegister> findByidRegister(int id);
  
  public UserBookCar storeBookCar(UserBookCar userBookCar);
  
  public void showAllBookDetails(AllBookDetails userBookCar);
  
  public DriverDetails save(DriverDetails driverDetails );
  
  public List<DriverDetails> finDetails();
  
  public FinalConfirm saveDataConfirm(FinalConfirmDTO finalConfirm);
  
  public DriverHotel saveDriverHotel(DriverHotel driverHotel);

}
