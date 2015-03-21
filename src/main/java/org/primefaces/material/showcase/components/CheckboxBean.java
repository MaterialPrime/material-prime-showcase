package org.primefaces.material.showcase.components;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CheckboxBean implements Serializable{

private static final long serialVersionUID = 1L;
	
	private boolean bluetooth;
	private boolean wifi;

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean value) throws InterruptedException {
		this.bluetooth = value;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

}
