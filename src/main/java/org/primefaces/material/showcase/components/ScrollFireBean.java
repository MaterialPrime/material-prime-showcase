package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ScrollFireBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public void halfway(){
		System.out.println("Halfway!");
	}

}
