import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "CtrlForm")
@RequestScoped
public class CtrlForm {
    private String nombre;
    private int orden;
    private int total; 

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre; 
    }

    public int getOrden(){
      return orden;  
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    
    public int calculo(){
        total= orden * 25;
        return total; 
    }

    public void saludo() {
      final String respuesta = "Hola   " + getNombre() + " tienes que pagar $  " + calculo()  + ".";
      FacesContext.getCurrentInstance()
          .addMessage(null, new FacesMessage(respuesta));
    }
}