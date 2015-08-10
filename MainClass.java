/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackages;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author user
 */
public class MainClass {
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    String SongName;
    int stop;
    
    
    public void Stop()
    {
        if(player != null)
        {
            player.close();
            pauseLocation =0;
            songTotalLength = 0;
            
        }
        stop=1;
        SongName = MainGUI.songTitle.getText();
        MainGUI.songTitle.setText("");
    }
    
    public void Pause()
    {
        if(player != null)
        {
            try
            {
                pauseLocation = FIS.available();
                player.close();
            }
            catch(IOException ex)
            {
                
            }
        }
    }
    
    public void Resume()
    {
    try
    {
        FIS = new FileInputStream(fileLocation);
        BIS = new BufferedInputStream(FIS);
        
        player = new Player(BIS);
        
        FIS.skip(songTotalLength - pauseLocation);
        
        /*if(stop>0)
        {
            MainGUI.songTitle.setText(SongName);
        }*/
        
    }
    catch(FileNotFoundException | JavaLayerException ex)
    {
    
    }   catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    new Thread()
    {
        @Override
        public void run()
        {
            try 
            {
                player.play();
            } 
            catch (JavaLayerException ex) 
            {
                
            }
        }
    }.start();
    }
    
    public void Play(String path)
    {
    
    try
    {
        FIS = new FileInputStream(path);
        BIS = new BufferedInputStream(FIS);
        
        player = new Player(BIS);
        
        songTotalLength = FIS.available();
        
        fileLocation = path + "";
        
    }
    catch(FileNotFoundException | JavaLayerException ex)
    {
    
    }   
    catch (IOException ex) 
    {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    new Thread()
    {
        @Override
        public void run()
        {
            try 
            {
                player.play();
                
                if(player.isComplete())
                {
                    Play(fileLocation);
                }
                if(player.isComplete())
                {
                   
                }
            } 
            catch (JavaLayerException ex) 
            {
                
            }
        }
    }.start();
    }
}
