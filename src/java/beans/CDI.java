
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "dependBean")
@Dependent
public class CDI {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return "35";
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
