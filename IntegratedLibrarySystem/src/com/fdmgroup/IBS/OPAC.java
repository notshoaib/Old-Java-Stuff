package com.fdmgroup.IBS;

import java.util.HashMap;

import com.fdmgroup.rammem.RamMediaDatabase;



public class OPAC <K extends Number, T extends Book> {
	private static OPAC Opac= new OPAC( );


		
		private OPAC(){
		}

		 public static OPAC getInstance( ) {
		      return Opac;
		   }
		 
		 public void View(){
			 RamMediaDatabase.displayAll();
		 }
		 

		
		

	}

