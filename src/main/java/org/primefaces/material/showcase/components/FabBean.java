package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FabBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String firstIcon = "mdi-action-favorite";

	public String getFirstIcon() {
		return firstIcon;
	}

	public void setFirstIcon(String firstIcon) {
		this.firstIcon = firstIcon;
	}
	
}
