package com.yash.pojos;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class TextEditor implements InitializingBean,DisposableBean,
			BeanNameAware,BeanFactoryAware, BeanClassLoaderAware,ApplicationContextAware,
				ResourceLoaderAware, BeanPostProcessor{

	private SpellChecker spellChecker;
	private String name;

	public TextEditor() {
		System.out.println("in const "+getClass().getName());
	}

	public TextEditor(SpellChecker spellChecker, String name) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck()
	{
		spellChecker.checkSpelling();
		
	}

	@Override
	public String toString() {
		return "TextEditor [spellChecker=" + spellChecker + ", name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}

	@Override
	public void setBeanName(String s) {
		
		System.out.println(s);
		s+="pranaw";
		System.out.println(s);
		
	}

	@Override
	public void setBeanFactory(BeanFactory s) throws BeansException {
		System.out.println(s.isSingleton("text"));
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
		System.out.println(arg0.getClass().getName());
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println(arg0.getApplicationName());
		
	}
	
	

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		System.out.println(arg0);
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(arg1);
		return arg0;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(arg1);
		return arg0;
	}

	

}
