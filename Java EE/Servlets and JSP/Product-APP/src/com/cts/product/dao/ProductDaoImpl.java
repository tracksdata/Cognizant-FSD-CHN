package com.cts.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.product.dao.utils.DBUtils;
import com.cts.product.entity.Product;


public class ProductDaoImpl implements ProductDao{

	Connection con=null;
	PreparedStatement ps=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	@Override
	public boolean saveProduct(Product prod) {
		
		boolean status=false;
		try {
			con=DBUtils.getConnection();
			String saveQuery="insert into product values(?,?,?,?)";
			ps=con.prepareStatement(saveQuery);
			ps.setString(1, prod.getProdId());
			ps.setString(2, prod.getProdName());
			ps.setString(3, prod.getDescription());
			ps.setDouble(4, prod.getPrice());
			
			int x=ps.executeUpdate();
			
			if(x!=0) {
				status=true;
			}
			
		} catch (Exception e) {
			System.out.println("-- DAO: Failed due to "+e);
			e.printStackTrace();
		}finally {
			//DBUtils.closeConnection();
		}
		
		return status;
	}

	@Override
	public Product findProduct(String prodId) {
		
		
		Product prod=null;
		try {
			con=DBUtils.getConnection();
			String findQry="select * from product where product_id=?";
			ps=con.prepareStatement(findQry);
			ps.setString(1, prodId);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				
				prod=new Product();
				prod.setProdId(rs.getString(1));
				prod.setProdName(rs.getString(2));
				prod.setDescription(rs.getString(3));
				prod.setPrice(rs.getDouble(4));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//DBUtils.closeConnection();
		}
		
		return prod;
	}

	@Override
	public List<Product> listAll() {
		
		List<Product> prods=new ArrayList<>();
		
		try {
			con=DBUtils.getConnection();
			String listQry="select * from product";
			stmt=con.createStatement();
			rs=stmt.executeQuery(listQry);
			
			while(rs.next()) {
				Product prod=new Product();
				prod.setProdId(rs.getString(1));
				prod.setProdName(rs.getString(2));
				prod.setDescription(rs.getString(3));
				prod.setPrice(rs.getDouble(4));
				prods.add(prod);
			}
			
			
		} catch (Exception e) {
			System.out.println("List All: Failed due to "+e);
			e.printStackTrace();
		}finally {
			//DBUtils.closeConnection();
		}
		
		
		return prods;
	}

	@Override
	public boolean deleteProduct(String prodId) {
		
		boolean status=false;
		try {
			con=DBUtils.getConnection();
			String deleteQry="delete from product where product_id=?";
			ps=con.prepareStatement(deleteQry);
			ps.setString(1, prodId);
			int x=ps.executeUpdate();
			
			if(x!=0)
				status=true;
			
		} catch (Exception e) {
			System.out.println("-- Delete : failed deu to "+e);
		}finally {
			//DBUtils.closeConnection();
		}
		
		return status;
	}

	@Override
	public boolean updateProduct(Product prod) {
		
		
		boolean status=false;
		try {
			con=DBUtils.getConnection();
			String updateQry="update product set product_name=?,description=?,price=? where product_id=?";
			ps=con.prepareStatement(updateQry);
			
			ps.setString(1, prod.getProdName());
			ps.setString(2, prod.getDescription());
			ps.setDouble(3, prod.getPrice());
			ps.setString(4, prod.getProdId());
			
			int x=ps.executeUpdate();
			if(x!=0)
				status=true;
			
		}catch(Exception e) {
		
			System.out.println("--- Update: Failed due to "+e);
			e.printStackTrace();
		}finally {
			//DBUtils.closeConnection();
		}
		return status;
	}
	
	

}
