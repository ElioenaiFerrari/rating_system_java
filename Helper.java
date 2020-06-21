/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratingsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import ratingsystem.models.Schedule;
import sun.misc.IOUtils;

/**
 *
 * @author devapp
 */
public class Helper {
    private String path;

    public Helper(String fileName) {
        this.setPath(fileName);
    }
    
    public void loadingTableData(DefaultTableModel model){
        String[] content = this.fileReader().split("\n");
        
        for(int index=0;index<content.length;index++){
            model.addRow(new Object[]{
                content[index].split(",")[0],
                content[index].split(",")[1],
                content[index].split(",")[2],
            });
        }
    }

    public void writeFile(Schedule schedule) {
        try  {
            FileWriter writer = new FileWriter(getPath(), true);
            
            String content = schedule.getLocale() + "," + schedule.getMonitor() + "," + schedule.getSchedule();
            
            
            
            writer.write(content);
            writer.write("\n");
            writer.close();


        } catch (IOException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public String fileReader() {
        try (FileReader fileReader = new FileReader(getPath())) {
            BufferedReader bReader = new BufferedReader(fileReader);
            String line = bReader.readLine(); 
            StringBuilder sb = new StringBuilder();

            
            
            while (line != null) {
                sb.append(line).append("\n");
                line = bReader.readLine();
            }
            
            String content = sb.toString(); 
            
            return content;

        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException error) {
        }
        return null;
    }
    
    public void setPath(String fileName){
        this.path = String.format("/Users/devapp/NetBeansProjects/RatingSystem/src/ratingsystem/database/%s", fileName);
    }
    
    public String getPath(){
        return this.path;
    }
    
    
}
