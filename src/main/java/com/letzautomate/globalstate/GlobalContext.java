package com.letzautomate.globalstate;


import managers.PageObjectsManager;
import managers.WebDriverManager;



public class GlobalContext {
		
		private WebDriverManager webdriverManager;
		private PageObjectsManager pageObjectsManager;
		
		public GlobalContext() {
			webdriverManager = new WebDriverManager();
			pageObjectsManager = new PageObjectsManager(webdriverManager.getDriver());
		}
		
		public WebDriverManager getWebDriverManager(){
			return webdriverManager;
		}
		
		public PageObjectsManager getPageObjectsManager() {
			return pageObjectsManager;
		}
	}
		


