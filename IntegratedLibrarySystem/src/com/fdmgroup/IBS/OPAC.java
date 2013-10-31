package com.fdmgroup.IBS;

import java.util.HashMap;



public class OPAC <K extends Number, T extends Book> {
		T t;
		K id;
		HashMap <K,T> c = new HashMap<K,T>(); 
		
		public OPAC(K id, T t){
			this.t=t;
			this.id=id;
			c.put(id, t);
		}
		
		

		public void add (K id, T t) {
			// TODO Auto-generated method stub
			this.id=id;
			this.t=t;
			c.put(id, t);

		}


		public T Find(K id) {
			// TODO Auto-generated method stub
			if (c.containsKey(id)) {
				return c.get(id);
				
			}
			return null;
		}



		public K getId() {
			return id;
		}



		public void setId(K id) {
			this.id = id;
		}



		public T getT() {
			return t;
		}



		public void setT(T t) {
			this.t = t;
		}
		
		

	}

