package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;



@ManagedBean
@NoneScoped //don´t need to have serializable
public class NoneBean{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
