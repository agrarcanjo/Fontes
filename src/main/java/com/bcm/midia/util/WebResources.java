package com.bcm.midia.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class WebResources {
   
   @Produces
   @RequestScoped
   public FacesContext produceFacesContext() {
      return FacesContext.getCurrentInstance();
   }
   
}
