package com.vz.bim.integration.conditionalinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.vz.bim.integration.services.wrapper.GenericAdapterWrapper;


@Configuration
public class InjectionConfiguration {
 
   
  @Bean
  @Conditional(DaoCondition.class)
  public com.vz.bim.integration.services.wrapper.GenericAdapterWrapper injectSoapAdapter () throws Exception{
	  System.out.println("***INJECTING Generic Adapter Wrapper...****");
	  return new GenericAdapterWrapper();
	   
  }
  

 }
