/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author fernando
 */
public class Corrida {
    private int idCorrida;
    private Poblacion origen;
    private Poblacion destino;
    private Date fecha_hr;
    private Autobus claseA;
    private int costo;
    private ArrayList<Integer> ocupados;
    
    public Corrida(int idCorrida,Poblacion origen, Poblacion destino, Date fecha_hr,Autobus clasea,int costo){
        this.idCorrida=idCorrida;
        this.origen = origen;
        this.destino=destino;
        this.fecha_hr=fecha_hr;
        this.claseA=claseA;
        this.costo=costo;
        this.ocupados=new ArrayList<Integer>();
    }
  public void setOcupados(ArrayList<Integer> ocup) { 
      this.ocupados = ocup; 
  }


  public ArrayList<Integer> getOcupados() { 
      return this.ocupados; 
  }


  
  public int getIdCorrida() { 
      return this.idCorrida; 
  }

  public String getOrigen() { 
      return this.origen.getPoblacion(); 
  }

  public String getDestino() { 
      return this.destino.getPoblacion(); 
  }
  
  public Date getFecha() {
      return this.fecha_hr;
  }

  public Autobus getClaseAutobus() { 
      return this.claseA; 
  }

  public int getCosto() { 
      return this.costo; 
  }
  
  public int getDisponibles() { 
      return this.claseA.getNumAsiento() - this.ocupados.size(); 
  }
}
