/**
 * 
 */
package com.vz.bim.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vz.bim.dto.CustomerRegistrationDTO;

/**
 * @author AR00539983
 *
 */
@Repository
public interface CustomerRepository extends MongoRepository<CustomerRegistrationDTO, String>{

}
