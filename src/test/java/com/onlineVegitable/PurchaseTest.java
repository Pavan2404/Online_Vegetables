package com.onlineVegitable.Test;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.onlineVegitable.modal.Purchase;
import com.onlineVegitable.repository.PurchaseRepository;

@SpringBootTest
public class PurchaseTest extends onlineVegetableApplicationTests{
	
	@Autowired
	private PurchaseRepository repo;
	
	@Test
	void testsavePurchase() {
		Purchase pc=new Purchase();
		pc.setPurchaseId(1);
		pc.setBillgenerated("Yes");
		pc.setOffer(29);
		pc.setPayoptions(4);
		Purchase pc1=repo.save(pc);
	    assertThat(pc1.getPurchaseId()).isEqualTo(1);
	       System.out.println("*********");
		
	}
	  
	
	@Test
	void testgetDetails() {
		Optional<Purchase> op=repo.findById((Integer) 1);
		if(op.isPresent()) {
			Purchase pc=op.get();
			assertThat(pc.getPurchaseId()).isEqualTo(2);
		       System.out.println("*********");
			
		}
	}
	
	@Test
	void testdeletePurchase() {
		Optional<Purchase> op=repo.findById((Integer) 1);
		
		if(op.isPresent()) {
			Purchase atc=op.get();
			assertThat(atc.getPurchaseId()).isEqualTo(1);
		       System.out.println("*********");
		}

	
	}
	
	
	

}
