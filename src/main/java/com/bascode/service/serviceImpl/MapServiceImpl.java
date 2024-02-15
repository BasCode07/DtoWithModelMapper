package com.bascode.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bascode.dto.UserLocationDTO;
import com.bascode.model.User;
import com.bascode.repository.UserRepository;
import com.bascode.service.MapService;


@Service
public class MapServiceImpl implements MapService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<UserLocationDTO> userLocationDTO() {

		return ((List<User>) userRepository.findAll())
				.stream()
				.map(this::convertToUserLocationDTO)
				.collect(Collectors.toList());
	}
	
	
	private UserLocationDTO convertToUserLocationDTO(User user){
		modelMapper.getConfiguration()
			.setMatchingStrategy(MatchingStrategies.LOOSE);
		UserLocationDTO userLocationDTO = modelMapper
				.map(user, UserLocationDTO.class);
		return userLocationDTO;
	}
	
	
	
	

}
