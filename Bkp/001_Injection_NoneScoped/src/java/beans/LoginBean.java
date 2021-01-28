
package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

//


@ManagedBean
@RequestScoped
public class LoginBean {

       @ManagedProperty (value = "#{noneBean}")
       private NoneBean none;
       private String nome;
       
    public void setNone(NoneBean none) {
        this.none = none;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        
    public String setName (){
        none.setName(nome);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("The name set for none scoped bean is " + none.getName()));
        
        return "";
    }
    
    
}
