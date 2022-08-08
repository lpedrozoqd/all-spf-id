package edu.clarape.al.allspfid.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
                BeanFactoryAware, ApplicationContextAware{
    //-->Viene de InitializingBean:
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("&&&& 1- InitializingBean ---> afterPropertiesSet");
    }
    
    //-->Viene de DisposableBean:
    @Override
    public void destroy() throws Exception {
        System.out.println("&&&& 2- DisposableBean ---> destroy");        
    }

    //-->Viene de BeanNameAware:
    @Override
    public void setBeanName(String name) {
        System.out.println("&&&& 3- BeanNameAware ---> setBeanName");               
    }

    //-->Viene de BeanFactoryAware:
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("&&&& 4- BeanFactoryAware ---> setBeanFactory");                       
    }

    //-->Viene de ApplicationContextAware:
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("&&&& 5- ApplicationContextAware ---> setApplicationContext");                       
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println("&&&& 6- postConstruct");                               
    } 

    @PreDestroy
    public void preDestroy(){
        System.out.println("&&&& 7- preDestroy");                               
    }


    

    
}
