
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "CtrlForm")
@RequestScoped
public class CtrlForm {
  private String nombre;
  private String grupo;
  
  public String getNombre() {
    return nombre;
  }
 
  public void setNombre(String nombre) {
    this.nombre = nombre; 
  }
  
  public String getGrupo(){
    return grupo;  
  }
  
  public void setGrupo(String grupo) {
      this.grupo = grupo;
  }
  
  public void saluda() {
    final String saludo = "Hola" + getNombre() + "Tu grupo es:" + getGrupo() + ".";
    FacesContext.getCurrentInstance()
        .addMessage(null, new FacesMessage(saludo));
  }
}