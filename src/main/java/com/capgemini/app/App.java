package com.capgemini.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	Organization organization=(Organization) context.getBean("organization");
    	System.out.println(organization.getBoardMembers());
    	System.out.println(organization.getBranchManagers());
    	System.out.println(organization.getCities());
    	System.out.println(organization.getDateOfEstablishment());
    	System.out.println(organization.getShareValue());
		System.out.println(organization.isListed());
		System.out.println(organization.getIpAddresses());
    	System.out.println(organization.toString());
    	
    }
}
