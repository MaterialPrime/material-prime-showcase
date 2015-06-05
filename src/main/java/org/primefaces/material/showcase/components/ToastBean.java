package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

import org.primefaces.material.application.ToastService;

@ManagedBean
@NoneScoped
public class ToastBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public void showToast(){
		ToastService.getInstance().newToast("Hi From the server!");
	}

}
