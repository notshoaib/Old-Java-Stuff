package com.fdmgroup.IBS;

import java.util.HashMap;

import com.fdmgroup.rammem.RamMediaDatabase;



public class OPAC <K extends Number, T extends Book> {
	private static OPAC Opac= new OPAC( );


		
		private OPAC(){
		}
		
		



//		public T Find(K id) {
//			// TODO Auto-generated method stub
//			if (c.containsKey(id)) {
//				return c.get(id);
//				
//			}
//			return null;
//		}
//
//
//
//		public K getId() {
//			return id;
//		}
//
//
//
//		public void setId(K id) {
//			this.id = id;
//		}
//
//
//
//		public T getT() {
//			return t;
//		}
//
//
//
//		public void setT(T t) {
//			this.t = t;
//		}
		
		 public static OPAC getInstance( ) {
		      return Opac;
		   }
		 
		 public void View(){
			 RamMediaDatabase.displayAll();
		 }
		 

		
		

	}

