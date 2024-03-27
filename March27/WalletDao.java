package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WalletDao {

	@Autowired  
    JdbcTemplate jdbc; 
	
	public Wallet showCustomerWallet(int custId,String walType) {
		String cmd = "select * from Wallet where cus_id=? AND WAL_SOURCE=?";
		List<Wallet> wallets=null;
		wallets=jdbc.query(cmd,new Object[] {custId,walType}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWalId(rs.getInt("WAL_ID"));
				wallet.setCusId(rs.getInt("CUS_ID"));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				wallet.setWalSource(rs.getString("WAL_SOURCE"));
				return wallet;
			}
			
		});
		return wallets.get(0);
	}
	
	public List<Wallet> showCustomerWallets(int custId) {
		String cmd = "select * from Wallet where cus_id=?";
		List<Wallet> wallets=null;
		wallets=jdbc.query(cmd,new Object[] {custId}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWalId(rs.getInt("WAL_ID"));
				wallet.setCusId(rs.getInt("CUS_ID"));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				wallet.setWalSource(rs.getString("WAL_SOURCE"));
				return wallet;
			}
			
		});
		return wallets;
	}
}
