
package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

//


@ManagedBean
@RequestScoped
public class LoginBean {

       @ManagedProperty (value = "#{noneBean}")
       private NoneBean none;
       private String nome;
       
       @Inject
       private CDI dependBean;
       
    public void setNone(NoneBean none) {
        this.none = none;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    
    //Apply Injection of CDI
    public void setDependBean(CDI dependBean) {
        this.dependBean = dependBean;
    }
        
    public String setName (){
        none.setName(nome);
        dependBean.setName(nome);
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The name set for none scoped bean is " + none.getName()));
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The name set for dependent scoped bean is " + dependBean.getName() + " - " +dependBean.getAge()));
        
        return "";
    }
    
 
    
    
}
