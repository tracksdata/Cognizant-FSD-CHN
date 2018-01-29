package com.cts.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;


public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option=request.getParameter("menu");
		ProductService prodService=new ProductServiceImpl();
		if(option.equals("save")) {
			
			Product prod=new Product();
			prod.setProdId(request.getParameter("prodId"));
			prod.setProdName(request.getParameter("prodName"));
			prod.setDescription(request.getParameter("description"));
			prod.setPrice(Double.parseDouble(request.getParameter("price")));
			
			
			
			boolean status= prodService.saveProduct(prod);
			
			RequestDispatcher rd=null;
			
			if(status) {
				rd=request.getRequestDispatcher("jsp/product.jsp?msg=Product Saved");
				rd.forward(request, response);
			}else {
				rd=request.getRequestDispatcher("jsp/product.jsp?msg=Product Not Saved");
				rd.forward(request, response);
			}
			
			
			
		}
		
		if(option.equals("find")) {
			
			
			String prodId=request.getParameter("prodId");
			Product prod=prodService.findProduct(prodId);
			
			if(prod!=null) {
				request.setAttribute("product", prod);
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/findResults.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/find.jsp?msg=Product Id "+prodId+" Does not found in DB");
				rd.forward(request, response);
			}
			
			
			
			
		}
		
		if(option.equals("listAll")) {
			
			List<Product> prods= prodService.listAll();
			request.setAttribute("products", prods);
			
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("jsp/display.jsp");
			rd.forward(request, response);
		}
		
		if(option.equals("listAll_V1")) {
			
			List<Product> prods= prodService.listAll();
			request.setAttribute("products", prods);
			
			RequestDispatcher rd=null;
			rd=request.getRequestDispatcher("jsp/display_v1.jsp");
			rd.forward(request, response);
		}
		
		if(option.equals("delete")) {
			String prodId=request.getParameter("prodId");
			boolean status=prodService.deleteProduct(prodId);
			
			if(status) {
				
				RequestDispatcher rd=request.getRequestDispatcher("ProductController?menu=listAll_V1");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/delete.jsp?msg=Product Id "+prodId+" Does not found in DB");
				rd.forward(request, response);
			}
			
			
		}
		
		if(option.equals("update1")) {
			
			
			String prodId=request.getParameter("prodId");
			Product prod=prodService.findProduct(prodId);
			
			if(prod!=null) {
				request.setAttribute("prod", prod);
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/updateResults.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/find.jsp?msg=Product Id "+prodId+" Does not found in DB");
				rd.forward(request, response);
			}
			
		}
		
		if(option.equals("update2")) {
			
			Product prod=new Product();
			prod.setProdId(request.getParameter("prodId"));
			prod.setProdName(request.getParameter("prodName"));
			prod.setDescription(request.getParameter("description"));
			prod.setPrice(Double.parseDouble(request.getParameter("price")));
			
			
			boolean status= prodService.updateProduct(prod);
			
			if(status) {
				RequestDispatcher rd=request.getRequestDispatcher("jsp/find.jsp?msg=Product Updated to DB");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("jsp/updateResults.jsp?msg=Product Not Updated to DB");
				rd.include(request, response);
			}
			
			
		}
		
		
		
	}

}
