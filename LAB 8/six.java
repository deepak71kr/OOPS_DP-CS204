package eight;
abstract class Phone {
    abstract void call();
    abstract void sms();
}
interface Camera {
    void click();
    void record();
}
interface MusicPlayer {
    void play();
    void pause();
    void stop();
}
class Smartphone extends Phone implements Camera, MusicPlayer {
    void call(){
        System.out.println("Calling");
    }
    void sms(){
        System.out.println("Sending SMS");
    }
    public void click(){
        System.out.println("Clicking photo");
    }
    public void record(){
        System.out.println("Recording video");
    }
    public void play(){
        System.out.println("Playing music");
    }
    public void pause(){
        System.out.println("Pausing music");
    }
    public void stop(){
        System.out.println("Stopping music ");
    }
}
public class six{
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone();
        smartphone.call();
        smartphone.sms();
        
        smartphone.click();
        smartphone.record();
        smartphone.play();
        smartphone.pause();
        smartphone.stop();
        
        Phone phoneRef = smartphone;
        Camera cameraRef = smartphone;
        MusicPlayer musicPlayerRef = smartphone;
        
        phoneRef.call();
        phoneRef.sms();
        cameraRef.click();
        cameraRef.record();
        musicPlayerRef.play();
        musicPlayerRef.pause();
        musicPlayerRef.stop();
    }
   
}