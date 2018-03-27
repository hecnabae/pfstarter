package es.hecnabae.pf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class Index implements Serializable{
    private String holaMundo = "Hola Mundo";

    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }
}
