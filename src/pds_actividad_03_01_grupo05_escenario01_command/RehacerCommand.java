package pds_actividad_03_01_grupo05_escenario01_command;

public class RehacerCommand implements Comando {
    private HistorialComandos historial;

    public RehacerCommand(HistorialComandos historial) {
        this.historial = historial;
    }

    @Override
    public void ejecutar() {
        historial.rehacer();
    }
}
