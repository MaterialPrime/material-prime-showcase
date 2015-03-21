package org.primefaces.material.showcase.components;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ButtonBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Date getTime(){
		return new Date();
	}

}
