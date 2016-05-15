package org.primefaces.material.showcase.components;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProgressBarBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Random random = new Random();

	public Integer getValue(){
	    return random.nextInt(101);
	};

}
