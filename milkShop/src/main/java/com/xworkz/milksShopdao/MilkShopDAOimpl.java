package com.xworkz.milksShopdao;

import org.springframework.stereotype.Repository;

import com.xworkz.milkShopdto.MilkShopDTO;
@Repository
public class MilkShopDAOimpl implements MilkShopDAO
{
	public MilkShopDAOimpl()
	{
	System.out.println("created"+this.getClass().getSimpleName());
	}	


	@Override
	public boolean save(MilkShopDTO dto) {
		System.out.println("created"+this.getClass().getSimpleName());
		return true;
	}
	}
