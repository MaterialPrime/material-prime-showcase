package org.primefaces.material.showcase.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class SelectOneBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String valueFixed = "2";
	private Object valueDynamically;
	private List<SelectItem> list;
	
	public SelectOneBean() {
		list = new ArrayList<SelectItem>();
		list.add(new SelectItem("1", "Option 1"));
		list.add(new SelectItem("2", "Option 2"));
		list.add(new SelectItem("3", "Option 3")); 
	}
	
	public String getValueFixed() {
		return valueFixed;
	}
	
	public void setValueFixed(String valueFixed) {
		this.valueFixed = valueFixed;
	}
	
	public Object getValueDynamically() {
		return valueDynamically;
	}
	
	public void setValueDynamically(Object valueDynamically) {
		this.valueDynamically = valueDynamically;
	}

	public List<SelectItem> getList() {
		return list;
	}

	public void setList(List<SelectItem> list) {
		this.list = list;
	}
}
