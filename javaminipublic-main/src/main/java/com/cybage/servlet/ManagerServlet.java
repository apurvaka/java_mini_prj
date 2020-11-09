package com.cybage.servlet;

import java.io.IOException;

import java.sql.Date;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.pojos.Batch;
import com.cybage.services.ManagerServiceI;
import com.cybage.services.ManagerServiceImpl;

public class ManagerServlet extends HttpServlet {
	
	ManagerServiceI manager=new ManagerServiceImpl();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner sc=new Scanner(System.in);
	
		Batch batch =new Batch();
		//manager.addSportUI();
		//manager.addBatchUI();
		//manager.removeBatchUI();
		manager.updateBatchUI();
//		manager.getAllBatchesUI();
		
		//manager.removeSportsUI();
	
				
		
		
		
		
	}
	

	
}
