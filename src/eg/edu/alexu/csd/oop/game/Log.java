package eg.edu.alexu.csd.oop.game;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Log {
   private  Logger crunchifyLogger = Logger.getLogger("MO_Salah");
   private  FileHandler crunchifyFileHandler;
   private static Log log;
   private Log(){
       delete("log.xml");
       delete("log.xml.lck");

       try {
           crunchifyFileHandler = new FileHandler("log.xml", true);
       } catch (IOException e) {
           e.printStackTrace();
       }
       crunchifyLogger.addHandler(crunchifyFileHandler);
       XMLFormatter formatter = new XMLFormatter();
       crunchifyFileHandler.setFormatter(formatter);
   }
   public static Log getInstance(){
       if(log==null)log=new Log();
       return log;
   }

   private void delete(String Path){
       try {
           Files.deleteIfExists( new File(Path).toPath());
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public Logger getLog(){
       return crunchifyLogger;
   }


}
