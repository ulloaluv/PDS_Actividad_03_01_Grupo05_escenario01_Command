package pds_actividad_03_01_grupo05_escenario01_command;

public class DeshacerCommand implements Comando {
    private HistorialComandos historial;

    public DeshacerCommand(HistorialComandos historial) {
        this.historial = historial;
    }

    @Override
    public void ejecutar() {
        historial.deshacer();
    }
}
