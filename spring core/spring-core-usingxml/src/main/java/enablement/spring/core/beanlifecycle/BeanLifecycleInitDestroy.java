package enablement.spring.core.beanlifecycle;

public class BeanLifecycleInitDestroy {
	 // This method executes automatically as the bean is instantiated 
    public void init() throws Exception 
    { 
    	System.out.println();
        System.out.println( "Bean BeanLifecycleInitDestroy has been instantiated and init() method called");
        System.out.println();
           
    } 
  
    // This method executes  when the spring container is closed 
    public void destroy() throws Exception 
    { 
    	System.out.println();
    	System.out.println( "Bean BeanLifecycleInitDestroy has been closed and destroy() method called");
    	System.out.println();
    } 
}
