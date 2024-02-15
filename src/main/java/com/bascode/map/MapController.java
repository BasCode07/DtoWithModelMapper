package com.bascode.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bascode.dto.UserLocationDTO;
import com.bascode.service.serviceImpl.MapServiceImpl;

@RestController
public class MapController {
	@Autowired
	private MapServiceImpl mapServiceImpl;
	
	@GetMapping("/location")
	//@ResponseBody
	public ResponseEntity<List<UserLocationDTO>> getAllUserLocation(){
		List<UserLocationDTO> userLocationDTO = mapServiceImpl.userLocationDTO();
		return ResponseEntity.ok(userLocationDTO);
	}

}
