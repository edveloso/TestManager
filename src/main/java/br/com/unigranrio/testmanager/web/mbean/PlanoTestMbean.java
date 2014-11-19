package br.com.unigranrio.testmanager.web.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="planoMB")
@RequestScoped
public class PlanoTestMbean {

	private String appName="Orion";

	
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	
	
}
