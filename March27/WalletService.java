package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WalletService {

	@Autowired
    private WalletRepository repo;
	
	@Autowired
	public WalletDao wdao;
	
	public Wallet searchById(int id) {
		return repo.findById(id).get();
	}
	
	public List<Wallet> showCustomerWallets(int custId) {
		return wdao.showCustomerWallets(custId);
	}
	
	public Wallet showCustomerWalletInfo(int custId, String walType) {
		return wdao.showCustomerWallet(custId, walType);
	}
	
}
