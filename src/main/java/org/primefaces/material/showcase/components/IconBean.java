package org.primefaces.material.showcase.components;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.google.common.collect.Lists;

@ManagedBean
public class IconBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> icons;
	
	public IconBean() {
		icons = Lists.newArrayList(
			"mdi-action-3d-rotation",
			"mdi-action-accessibility"
		);
	}
	
	public List<String> getIcons(){
		return icons;
	}

}
