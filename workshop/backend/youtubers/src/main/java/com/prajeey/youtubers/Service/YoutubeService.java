package com.prajeey.youtubers.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.prajeey.youtubers.Entity.YoutubeEntity;
import com.prajeey.youtubers.Repository.YoutubeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class YoutubeService {
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	private YoutubeRepository stu;
	
	public YoutubeEntity savedata( YoutubeEntity s) {
		return stu.save(s);
	}
	public void deleteDepartmentById(int id) {
		stu.deleteById(id);
	}
	public  YoutubeEntity updatedata( YoutubeEntity s) {
		return stu.save(s);
    }
	
//	public List<PassengerEntity> getByAttribute(String attribute){
//		return stu.findAllPassengerNative(attribute);
//	}
//	public Passenger readEM(String name) {
//		Query q = this.entityManager.createQuery("SELECT e FROM Passenger e WHERE e.name = :name");
//				q.setParameter("name", name);
//		return (Passenger) q.getSingleResult();
//	}
	public List< YoutubeEntity> findall() {
		// TODO Auto-generated method stub
		return stu.findAll();
		
	}
}