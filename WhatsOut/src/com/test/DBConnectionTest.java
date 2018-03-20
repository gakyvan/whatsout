package com.test;

import com.dao.WhatsOutUserDao;

/**
 *
 * @author Yvan GAKUBA
 */
public class DBConnectionTest {
	public static void main(String[] args) {
		WhatsOutUserDao wdao=new WhatsOutUserDao();
		System.out.println(wdao.findBy("gakyvan", "password15380"));
//		AddressDao adao=new AddressDao();
//		System.out.println(adao.findBy("IOWA","Fairfield"));
//		Address a=adao.find("IOWA","Ames");
//		WhatsOutUserDao wdao=new WhatsOutUserDao();
//		WhatsOutUser whatsOutUser=new WhatsOutUser();
//		whatsOutUser.setUserName("gakyvan");
//		whatsOutUser.setPassword("password15380");
//		whatsOutUser.setFirstName("Yvan");
//		whatsOutUser.setLastName("GAKUBA");
//		whatsOutUser.setMiddleName("");
//		whatsOutUser.setEmail("ygakuba@mum.edu");
//		whatsOutUser.setPhone("+1(641)980-4138");
//		whatsOutUser.setProfilePicture("default.png");
//		whatsOutUser.setAddress(a);
//		whatsOutUser.setJoinDate(LocalDate.now());
//		System.out.println(wdao.insert(whatsOutUser));
		
	}
}
