package com.prajeey.youtubers.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import com.prajeey.youtubers.Entity.YoutubeEntity;
import com.prajeey.youtubers.Service.YoutubeService;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import org.springframework.http.HttpStatus;


@RestController
@CrossOrigin
public class YoutubeController {
		
 @Autowired
 private  YoutubeService ss;
 
// @Operation(summary = "Add Passenger")
// @ApiResponses(value = {
//     @ApiResponse(responseCode = "201", description = "Passenger Added"),
//     @ApiResponse(responseCode = "400", description = "Invalid Input"),
//     @ApiResponse(responseCode = "401", description = "Invalid Credentials")
// })
// @ResponseStatus(HttpStatus.CREATED)
 @PostMapping("/savedata")
 public String savingPassenger(@RequestBody  YoutubeEntity s) {
	  ss.savedata(s);
	  return "saved";
 }
 
 @GetMapping("/findall")
 public List< YoutubeEntity> listing() {
	 return ss.findall();
 }
 
// @GetMapping("/find/{attribute}")
//	public List<PassengerEntity> getAttribute(@PathVariable String attribute){
//	 List<PassengerEntity>allPassenger=ss.getByAttribute(attribute);
//	 return allPassenger;
//}
 	
 
 @DeleteMapping("/deleteById/{id}")
 public String deleteDepartmentById(@PathVariable("id") int id) {
	  ss.deleteDepartmentById(id);
	  return "deleted";
 }
 @PutMapping("/update")
 public Boolean updatestudent(@RequestBody  YoutubeEntity s) {
	 return ss.updatedata(s)!=null;   
 }
}