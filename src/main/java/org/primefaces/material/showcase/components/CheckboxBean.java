package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CheckboxBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private boolean value;

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) throws InterruptedException {
		this.value = value;
	}

}
