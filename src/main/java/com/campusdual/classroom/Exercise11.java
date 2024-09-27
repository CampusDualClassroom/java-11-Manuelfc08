package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());


        // subir un canal con el mando rojo
        redRemote.channelUp();
        System.out.println("Canal actual después de subir un canal: " + redRemote.channel);

        // Apagar los mandos
        redRemote.turnOff();
        blackRemote.turnOff();
        System.out.println("El mando rojo está encendido después cambiar ? " + redRemote.on);
        System.out.println("El mando negro está encendido después ? " + blackRemote.on);

        // Subir el volumen dell mando negro
        blackRemote.turnOn();
        blackRemote.volumeUp();
        System.out.println("Volumen actual del mando negro: " + blackRemote.volume);

    }
}