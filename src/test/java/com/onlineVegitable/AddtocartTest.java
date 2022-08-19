package com.onlineVegitable.Test;




import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlineVegitable.modal.Addtocart;
import com.onlineVegitable.repository.AddtocartRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AddtocartTest extends onlineVegetableApplicationTests{
	
	
	@Autowired
	private AddtocartRepository repos;
	
	@Test
	void testsaveAddtocart() {
		Addtocart atc=new Addtocart();
		atc.setQuantity(1);
		atc.setVegname("Tomato");
		atc.setPrice(29);
		atc.setSaveitorproceedtopay(0);
		Addtocart atc1=repos.save(atc);
	    assertThat(atc1.getQuantity()).isEqualTo(1);
	       System.out.println("*********");
		
	}
	
	@Test
	void testupdateCart() {
		Optional<Addtocart> opa=repos.findById((Integer) 1);
		System.out.println(opa);
		if(opa.isPresent()) {
			Addtocart atc=opa.get();
			 assertThat(atc.getQuantity()).isEqualTo(1);
			 atc.setVegname("Tomato");
			 repos.save(atc);
			 atc.setPrice(29);
			 repos.save(atc);
			 atc.setSaveitorproceedtopay(0);
			 repos.save(atc);
			 System.out.println("*********");
				 
		} else {
			assertThat(opa).isEmpty();
		}
		
	}
	@Test
	void testdeleteCart() {
		Optional<Addtocart> opa=repos.findById((Integer) 1);
	
		if(opa.isPresent()) {
			Addtocart atc=opa.get();
			assertThat(atc.getQuantity()).isEqualTo(1);
		       System.out.println("*********");
		}

	}
	
	

}
