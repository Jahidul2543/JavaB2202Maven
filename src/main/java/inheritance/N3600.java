package inheritance;

public class N3600 extends N1100 implements SMobile2, SMobile{

    public static void main(String[] args) {
        N3600 n3600 = new N3600();
        n3600.call();
        n3600.sendText();

        System.out.println(
                n3600.getClass());
        System.out.println(n3600.hashCode());
    }
    public void musicPlayer(int a){
        System.out.println("Play Something");
    }
    // Overloading method musicPlayer() with String musicName parameter
    // Method Overloading
    public void musicPlayer(String musicName){
        System.out.println("Play Something");
        System.out.println("Music Name: " + musicName);
    }
    // Method Overriding
    public void sendText(){
        System.out.println("Message To Send: ");
        System.out.println("Let's say hello");
    }

    public void takePhot(){

    }
}
