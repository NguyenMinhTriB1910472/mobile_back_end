package com.example.demo.repository;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from user where email=:email and password=:password",nativeQuery = true)
	User LogIn(@Param("email") String email,@Param("password") String password);
	@Transactional
	@Modifying
	@Query(value = "call insertUser(:id_user,:user_name,:email,:password,:phone,:address,:id_cart)",nativeQuery = true)
	void SignIn(
			@Param("user_name") String user_name,
			@Param("email") String email,
			@Param("password") String password,
			@Param("phone") String phone,
			@Param("address") String address,
			@Param("id_user") int id_user,
			@Param("id_cart") int id_cart
			);
//	call insertUser(:id_user,:address,:email,:password,:phone,:id_cart,,:user_name)
}
