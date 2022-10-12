package com.xworkz.milkshopService;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.milkShopdto.MilkShopDTO;
import com.xworkz.milksShopdao.MilkShopDAO;

public class MilkShopServiceImpl implements MilkShopService {
		
		@Autowired	
		 private MilkShopDAO dao;
			@Override
			public 	boolean validateAndsave (MilkShopDTO dto) {
				return false;
			} {
				System.out.println("create "+this.getClass().getSimpleName());
				System.out.println("MilkShopDAO"+dao);
			}
			
}
