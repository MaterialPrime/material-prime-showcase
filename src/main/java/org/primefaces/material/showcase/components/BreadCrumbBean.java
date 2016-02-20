package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
public class BreadCrumbBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private MenuModel menuModel;
	
	public BreadCrumbBean() {
		menuModel = new DefaultMenuModel();
		
		for (int i = 0; i < 6; i++) {
			DefaultMenuItem item = new DefaultMenuItem("Element " + (i + 1));
			menuModel.addElement(item);
		}
		
	}

	public MenuModel getMenuModel() {
		return menuModel;
	}

}
