package enablement.spring.core.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanLifeCycleUsingAnnotation {

	// Annotate this method to execute it automatically as the bean is instantiated 
    @PostConstruct
    public void init() throws Exception 
    { 
    	System.out.println();
        System.out.println( 
            "Bean BeanLifeCycleUsingAnnotation has been "
            + "instantiated and init() method called ,using annotation ");
           
    } 
  
    // Annotate this method to execute it when Spring container is closed
    @PreDestroy
    public void destroy() throws Exception 
    { 
    	System.out.println();
        System.out.println( 
            "Conatiner has been closed "
            + "and the destroy() method called ,using annotation"); 
    } 
}
