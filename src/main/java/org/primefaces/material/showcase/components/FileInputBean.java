package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class FileInputBean implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Object file;

	public Object getFile() {
		return file;
	}

	public void setFile(Object file) {
		this.file = file;
	}
	
}
