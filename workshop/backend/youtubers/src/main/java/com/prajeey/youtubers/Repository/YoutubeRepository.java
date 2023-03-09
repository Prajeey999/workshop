package com.prajeey.youtubers.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.prajeey.youtubers.Entity.YoutubeEntity;
public interface YoutubeRepository extends JpaRepository< YoutubeEntity, Integer>
{
//	@Query(
//			value = "select * from passenger p where p.name =?1 ",
//			nativeQuery= true)
//	List<Passenger> findAllPassengerNative(String name);
}