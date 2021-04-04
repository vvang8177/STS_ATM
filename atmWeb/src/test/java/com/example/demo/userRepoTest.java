package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class userRepoTest {
	
	@Autowired
	private userRepo repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testUser() {
		User user = new User();
		user.setUser_name("ChrisBoy");
		user.setUser_pass("123Chris");
		user.setUser_first("chris");
		user.setUser_last("smirth");
		user.setCnn(1021);
		user.setBalance(34.30);
		
		User saveUser = repo.save(user);
		
		User existUser = entityManager.find(User.class, saveUser.getId());
		
		assertThat(existUser.getId()).isEqualTo(user.getId());
		
	}
	
	@Test
	public void testFindUserByEmail() {
		
		String email = "holyvue@gmail.com";
		User user = repo.findByEmail(email);
		assertThat(user).isNotNull();
	}

}
