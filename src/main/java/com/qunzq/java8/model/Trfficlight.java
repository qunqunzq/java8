package com.qunzq.java8.model;

enum Signal{
    GREEN,YELLOW,RED
}

public class Trfficlight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED: color = Signal.GREEN; break;
            case GREEN: color = Signal.YELLOW;break;

        }
    }

    @Override
    public String toString() {
        return "Trfficlight{" +
                "color=" + color +
                '}';
    }
}
