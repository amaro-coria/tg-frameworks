package net.tecgurus.util;

import net.tecgurus.service.BancoService;
import net.tecgurus.service.ClienteService;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Amaro on 10/08/2017.
 */
@Component
public class CustomSpringContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CustomSpringContext.applicationContext = applicationContext;
    }

    public static BancoService getBancoServiceBean(){
        return applicationContext.getBean(BancoService.class);
    }
    
    public static ClienteService getClienteService(){
    	return applicationContext.getBean(ClienteService.class);
    }
    
}
