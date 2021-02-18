package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.model.Customer;

public class CustomerDao {
	
	private JdbcTemplate jdbctemp;

	

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	public int saveCustomer(Customer c)
	{
		String sql="insert into Customer values("+c.getCid()+",'"+c.getCname()+"','"+c.getCaddress()+"')";
		return jdbctemp.update(sql);
	}
	
	public int deleteCustomer(Customer c)
	{
		
	String sql1 = "delete from customer where cid="+c.getCid();
	return jdbctemp.update(sql1);
	
	}
	
	
	public Boolean saveCustomerbyPs(Customer c)
	{

		String sql2="insert into customer values(?,?,?)";
		return jdbctemp.execute(sql2,new PreparedStatementCallback<Boolean>()
				{

					@Override
					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
					
			
			
			ps.setInt(1,c.getCid());
			ps.setString(2,c.getCname());
			ps.setString(3, c.getCaddress());
			return ps.execute();
			
			
					}		
				});
				
}


public Boolean UpdateCustomer(Customer c)
{
	String sql3 = "UPDATE customer "
            + "SET cid = ? "
            + "WHERE cname = ?";
	return jdbctemp.execute(sql3,new PreparedStatementCallback<Boolean>()
			{

				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					// TODO Auto-generated method stub
				
		
		
		ps.setInt(1,c.getCid());
		ps.setString(2,c.getCname());
		//ps.setDouble(3, e.getSalary());
		return ps.execute();
		
		
				}		
			});
			
}

public List<Customer> getEmployee()
{
	String sql="select * from customer";
	ResultSetExtractor rse=new ResultSetExtractor()
			{

				@Override
				public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Customer> list=new ArrayList<>();
				while(rs.next())
				{
					//Employee e=new Employee();
					list.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3)));
					
				}
					
					
					
					
					return list;
				}
		
			};
			
			return (List<Customer>) jdbctemp.query(sql,rse);
}










}
	
				
	
				
	
	


	
	