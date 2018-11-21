package base.persistencia;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenciaLog {
    
    protected static final Logger LOGGER = Logger.getLogger(PersistenciaLog.class.getName());
    
    static {
        try {
            Handler fileHandler = new FileHandler("./PersistenciaLog.log");
            fileHandler.setLevel(Level.ALL);
            PersistenciaLog.LOGGER.addHandler(fileHandler);
            PersistenciaLog.LOGGER.setLevel(Level.ALL);
            PersistenciaLog.LOGGER.info("Log direcionado para o arquivo PersistenciaLog.log");
        } catch (IOException | SecurityException ex) {
            PersistenciaLog.LOGGER.log(Level.SEVERE, "Erro ao direcionar o log para o arquivo PersistenciaLog.log", ex);
        }
    }
    
    public static void registrar (String message) {
        PersistenciaLog.LOGGER.log(Level.SEVERE, message);
    }
    
    public static void registrar (String message, Exception ex) {
        PersistenciaLog.LOGGER.log(Level.SEVERE, message, ex);
    }
    
    public static void registrar (Level level, String message, Exception ex) {
        PersistenciaLog.LOGGER.log(level, message, ex);
    }
}
