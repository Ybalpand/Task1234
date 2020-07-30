package com.webapp.bankingservice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RequestMapping
@SpringBootApplication
@RestController
public class BankingServiceApplication {

	public static final String BASE_URL = "http://ACCOUNT-SERVICE/springbootrestapiwebclient/account";
	public static final String BASE_URL_OF_CUSTOMER = "http://CUSTOMER-SERVICE/springbootrestapi/customers";

	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	// get all account
	@GetMapping("/account")
	public String getAccount() {
		System.out.println("Account Data ..");
		return this.restTemplate.getForObject(BASE_URL, String.class).toString();

	}

	// getAccountById account
	@GetMapping("/account/{accountId}")
	public String getAccountById(@PathVariable("accountId") Integer accountId) {
		System.out.println("retriev account by particular ID .." + BASE_URL + "/" + accountId);
		return this.restTemplate.getForObject(BASE_URL + "/" + accountId, String.class).toString();

	}

	// add account
	@PostMapping("/account")
	public Account createAccount(@RequestBody Account account) {
		System.out.println("Account Add sucessfuly .." + account.getAccountId());
		return this.restTemplate.postForObject(BASE_URL, account, Account.class);
	}
	
	// 4 update account
		@PutMapping("/account")
		public void updateAccount(@RequestBody Account account) {
			System.out.println("Account Updated .." + account.getAccountId());
			this.restTemplate.put(BASE_URL, account);
		}

	// delete account
	@DeleteMapping("/account/{accountId}")
	public @ResponseBody void deleteAccount(@PathVariable("accountId") Integer accountId) {
		// final String url = "http://ACCOUNT-CUSTOMER-CLIENT-2/springbootrestapiwebclient/account/{accountId}";
		System.out.println("deleted Account  .." + BASE_URL + "/" + accountId);
		this.restTemplate.delete(BASE_URL + "/" + accountId);
	}
	
	
	
	// get all customer List
		@GetMapping("/customer")
		public String customerData() {
			System.out.println("Customer Data .."+BASE_URL_OF_CUSTOMER);
			return this.restTemplate.getForObject(BASE_URL_OF_CUSTOMER, String.class).toString();

		}
		
		// Get Customer by Id
		@GetMapping("/customer/{customerId}")
		public String getCustomerById(@PathVariable("customerId") Integer customerId) {
			System.out.println("retriev customer by particular ID .." + BASE_URL_OF_CUSTOMER + "/" + customerId);
			return this.restTemplate.getForObject(BASE_URL_OF_CUSTOMER + "/" + customerId, String.class).toString();

		}

		// add customer
		@PostMapping("/customer")
		public Customer createCustomer(@RequestBody Customer customer) {
			System.out.println("Customer Add sucessfuly .." + customer.getCustomerId());
			return this.restTemplate.postForObject(BASE_URL_OF_CUSTOMER, customer, Customer.class);
		}
		
		// 4 update customer
			@PutMapping("/customer")
			public void updateCustomer(@RequestBody Customer customer) {
				System.out.println("Customer Updated .." + customer.getCustomerId());
				this.restTemplate.put(BASE_URL_OF_CUSTOMER, customer);
			}

		// delete customer
		@DeleteMapping("/customer/{customerId}")
		public @ResponseBody void deleteCustomer(@PathVariable("customerId") Integer customerId) {
			System.out.println("deleted customer  .." + BASE_URL_OF_CUSTOMER + "/" + customerId);
			this.restTemplate.delete(BASE_URL_OF_CUSTOMER + "/" + customerId);
		}
		
	public static void main(String[] args) {
		SpringApplication.run(BankingServiceApplication.class, args);
	}

}
