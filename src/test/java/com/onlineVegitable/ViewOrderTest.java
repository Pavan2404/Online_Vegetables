package com.onlineVegitable.Test;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlineVegitable.modal.ViewOrder;

import com.onlineVegitable.repository.ViewOrderRepository;

@SpringBootTest

public class ViewOrderTest extends onlineVegetableApplicationTests{
	@Autowired
	private ViewOrderRepository vrepos;
	
	@Test
	void testsaveViewOrder() {
		ViewOrder vo=new ViewOrder();
	    vo.setOrderId(4);
		vo.setVegname("Tomato");
		vo.setPrice(29);
		vo.setNoofitems(5);
		ViewOrder vo1=vrepos.save(vo);
	    assertThat(vo1.getOrderId()).isEqualTo(1);
	       System.out.println("*********");
	}
	
	@Test
	void testgetOrderDetails() {
		Optional<ViewOrder> op=vrepos.findById((Integer) 1);
		if(op.isPresent()) {
			ViewOrder vo=op.get();
			assertThat(vo.getOrderId()).isEqualTo(2);
		       System.out.println("*********");
			
		}
		
	}

}
