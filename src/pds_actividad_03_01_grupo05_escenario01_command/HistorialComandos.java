package pds_actividad_03_01_grupo05_escenario01_command;

import java.util.ArrayList;
import java.util.List;

public class HistorialComandos {
    private List<Comando> historial = new ArrayList<>();
    private int indiceActual = -1;

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.add(comando);
        indiceActual++;
    }

    public void deshacer() {
        if (indiceActual >= 0) {
            Comando comandoDeshacer = historial.get(indiceActual);
            comandoDeshacer.ejecutar();
            indiceActual--;
        } else {
            System.out.println("No se puede deshacer más.");
        }
    }

    public void rehacer() {
        if (indiceActual < historial.size() - 1) {
            indiceActual++;
            Comando comandoRehacer = historial.get(indiceActual);
            comandoRehacer.ejecutar();
        } else {
            System.out.println("No se puede rehacer más.");
        }
    }
}