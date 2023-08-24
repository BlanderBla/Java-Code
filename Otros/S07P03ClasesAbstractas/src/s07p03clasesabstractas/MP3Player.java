/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p03clasesabstractas;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class MP3Player extends MusicPlayer{
    public void stop(){
        System.out.println("Detener MP3");
    }
    public void play(){
        System.out.println("Reproducir MP3");
    }
}
