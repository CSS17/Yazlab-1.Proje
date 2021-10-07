package com.company;
import processing.core.PApplet;
import controlP5.*;
import processing.core.PFont;

public class Main extends PApplet {
    boolean a=false;
    boolean b=false;
    PFont font;
    public static void main(String[] args) {
        PApplet.main("com.company.Main", args);

    }
    public void settings() {
        size(600, 600);

    }

    public void setup() {
        String[] args = {"TwoFrameTest"};
        SecondApplet sa = new SecondApplet();
        PApplet.runSketch(args, sa);
        surface.setResizable(true);
        font = createFont("arial.ttf", 24);

    }

    public void draw() {
        background(0,0,255);
        surface.setLocation(710, 100);
        if(b){
            text("2. Ekrana Tikladin",110,100);
        }
    }
    public void mousePressed(){
        a=true;
    }

    //2.Ekran
    public class SecondApplet extends PApplet {
        public void setup(){
            surface.setResizable(true);
        }
        public void settings() {
            size(600, 600);


        }
        public void draw() {
            background(255,255,255);
            fill(0);
            surface.setLocation(100, 100);
            if(a){
                text("1. Ekrana Tikladin",100,100);
            }


        }
        public void mousePressed(){
            b=true;
        }
    }






}