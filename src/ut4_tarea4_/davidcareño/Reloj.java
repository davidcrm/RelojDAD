
package ut4_tarea4_.davidcareño;

import java.io.Serializable;
import javax.swing.*;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;


public class Reloj extends JLabel implements Serializable {

  private boolean es24h;          // Propiedad para controlar el formato de la hora
  private boolean alarmaActivada; // Propiedad para saber si tiene la alarma activada o no
  private int horaAlarma;         // Propiedad para la hora que se configura la alarma
  private int minutoAlarma;       // Propiedad para el minuto que se configura la alarma
  private String mensajeAlarma;   // Mensaje a mostrar cuando se active la alarma
  private Timer timer;            // Temporizador para actualizar el reloj cada segundo de la clase Timer

  public Reloj() {
    es24h = true;           // será 24h por defecto
    alarmaActivada = false; // no hay alarma configurada en un principio
    horaAlarma = 0;        // Valor por defecto para la hora de la alarma.
    minutoAlarma = -1;      // Valor por defecto para el minuto de la alarma.
    mensajeAlarma = "";     // Mensaje por defecto de la alarma.
    iniciarReloj();         // Inicia el temporizador para actualizar la hora en el componente.
  }

  private void iniciarReloj() {
    timer = new Timer(true); // Crea un temporizador en modo daemon (no bloquea la finalización del programa).
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        actualizarHora(); // Llama al método para actualizar la hora.
      }
    }, 0, 1000); // El temporizador se ejecuta inmediatamente y se repite cada 1 segundo (1000 ms).
  }

  private void actualizarHora() {
    LocalTime now = LocalTime.now(); // Obtiene la hora actual.
    int hora = now.getHour();
    int minuto = now.getMinute();
    int segundo = now.getSecond();

    String horaFormateada; // Variable para almacenar la hora formateada.

    // Formatea la hora según el formato seleccionado (24h o 12h).
    if (es24h) {
      horaFormateada = String.format("%02d:%02d:%02d", hora, minuto, segundo); // Formato 24 horas.
    } 
    else {
        int hora12; 
    if (hora % 12 == 0) {
        hora12 = 12;
    } else {
        hora12 = hora % 12;
    }
         String periodo;
    if (hora < 12) {
        periodo = "AM";
    } else {
        periodo = "PM";
    }

      horaFormateada = String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
    }

    // Actualiza el texto del JLabel con la hora formateada en el hilo de la interfaz gráfica.
    SwingUtilities.invokeLater(() -> setText(horaFormateada));

    // Verifica si la alarma debe activarse.
    verificarAlarma(hora, minuto);
  }


  private void verificarAlarma(int hora, int minuto) {
    if (alarmaActivada && hora == horaAlarma && minuto == minutoAlarma) {
      mostrarMensajeAlarma(); // Llama al método para mostrar el mensaje de la alarma.
    }
  }

  private void mostrarMensajeAlarma() {
    alarmaActivada = false; // Desactiva la alarma para evitar que se repita el mensaje.
    JOptionPane.showMessageDialog(this, mensajeAlarma, "Alarma", JOptionPane.INFORMATION_MESSAGE);
  }

    // GETTER Y SETTER
  public boolean is24h() {
    return es24h;
  }

  public void set24h(boolean es24h) {
    this.es24h = es24h;
  }

  public boolean isAlarmaActivada() {
    return alarmaActivada;
  }

  public void setAlarmaActivada(boolean alarmaActivada) {
    this.alarmaActivada = alarmaActivada;
  }

  public int getHoraAlarma() {
    return horaAlarma;
  }

  public void setHoraAlarma(int horaAlarma, boolean esAM) {
    if (es24h) {
      // Validación para formato 24 horas
      if (horaAlarma < 0 || horaAlarma > 23) {
        throw new IllegalArgumentException("La hora debe estar entre 0 y 23 para el formato 24h.");
      }
      this.horaAlarma = horaAlarma;
    } else {
      // Validación para formato 12 horas
      if (horaAlarma < 1 || horaAlarma > 12) {
        throw new IllegalArgumentException("La hora debe estar entre 1 y 12 para el formato 12h.");
      }
    if (esAM) {
        // Si es AM, la hora de la alarma es el residuo de 12.
        this.horaAlarma = horaAlarma % 12; 
    } else {
        // Si es PM, ajustamos la hora sumando 12 al residuo de 12.
        this.horaAlarma = (horaAlarma % 12) + 12; 
    }
    }
  }

  public int getMinutoAlarma() {
    return minutoAlarma;
  }

  public void setMinutoAlarma(int minutoAlarma) {
    if (minutoAlarma < 0 || minutoAlarma > 59) {
      throw new IllegalArgumentException("El minuto debe estar entre 0 y 59.");
    }
    this.minutoAlarma = minutoAlarma;
  }

  public String getMensajeAlarma() {
    return mensajeAlarma;
  }

  public void setMensajeAlarma(String mensajeAlarma) {
    this.mensajeAlarma = mensajeAlarma;
  }
}
