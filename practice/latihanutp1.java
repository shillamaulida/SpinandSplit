import java.util.Scanner;

public class latihanutp1 {
    public static void main(String[] args) {
        Scanner ssh = new Scanner(System.in);
        boolean x =false;
        int channel = 1;
        int volume = 50;
        int prevchannel = -1;
        boolean mute = false;
        
        while (ssh.hasNext()) {
        String waw = ssh.nextLine().toUpperCase();
            if (waw.equals("POWER")) {
                if (x) {
                System.out.println("TV OFF");
            } else {
                x = true;
                System.out.println("TV ON");
            }    
        }
        
        if (x) {
            
            switch (waw) {
                case "CHANNEL UP":
                    prevchannel = channel;
                    if (channel < 30) {
                        channel++;
                    } else {
                        System.out.println("Channel tidak valid");
                    } 
                    System.out.println("Channel sekarang: " + channel);
                    break;
                case "CHANNEL DOWN":
                    if (channel > 1) {
                        prevchannel = channel;
                        channel--; 
                        System.out.println("Channel sekarang: " + channel);
                    } else {
                        System.out.println("Channel tidak valid");
                    }
                    break;
                case "PREV CHANNEL":
                    if (prevchannel != -1) {
                        int y = channel;
                        channel = prevchannel;
                        prevchannel = y;
                    }
                    System.out.println("Channel sekarang: " + channel);
                    break;
                case "VOLUME UP":
                    if (mute) {
                        mute = false;
                    }
                    if (volume <= 95) {
                       volume += 5; 
                    } else {
                        System.out.println("Volume tidak valid");
                    } System.out.println("Volume sekarang: " + volume);
                    break;
                case "VOLUME DOWN":
                    if (!mute && volume > 0) {
                        volume -= 5;
                    }
                    System.out.println("Volume sekarang: " + volume);
                    break;
                case "MUTE":
                    mute = true;
                    System.out.println("Volume mute");
                    break;
                case "UNMUTE":
                    mute = false;
                    System.out.println("Volume sekarang: " + volume);
                    break;
                
                default:
                    if (waw.startsWith("CHANNEL ")) {
                        int newChannel = Integer.parseInt(waw.split(" ")[1]);
                        if (newChannel >= 1 && newChannel <= 30) {
                            prevchannel = channel;
                            channel = newChannel;
                            System.out.println("Channel sekarang: " + channel);
                        } else {
                            System.out.println("Channel yang tidak dimasukkan tidak valid");
                        }
                        break;
                    }
            }
        }
    }
    ssh.close();
    }
}
