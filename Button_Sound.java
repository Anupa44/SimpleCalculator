
package CalculatorFinal;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Button_Sound {
    public void playsound(File Sound){
                   

       try 
   {
  Clip clip = AudioSystem.getClip();
  clip.open(AudioSystem.getAudioInputStream(Sound));
   clip.start( );
   Thread.sleep(clip.getMicrosecondLength()/10000);
   }
   catch(Exception e)
   {
   }}
    
}
