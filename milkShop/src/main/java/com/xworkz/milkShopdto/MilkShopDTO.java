package com.xworkz.milkShopdto;

public class MilkShopDTO
{
  private String shopName;
  private String ownerName;
  private String location;
  private String brand;
  private String ambassador;
  private double price;
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "MilkShopDTO [shopName=" + shopName + ", ownerName=" + ownerName + ", location=" + location + ", price="
			+ price + "]";
}
  
}
