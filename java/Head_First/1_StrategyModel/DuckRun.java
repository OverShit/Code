abstract class Duck{

   FlyBehavior flyBehavior;
   SoundBehavior soundBehavior;

   void display(){
   }

   void setFlyBehavior(FlyBehavior newFlyBehavior){
       flyBehavior = newFlyBehavior;
   }
   
   void setSoundBehavior(SoundBehavior newSoundBehavior){
       soundBehavior = newSoundBehavior;
   }

   void fly() {
        flyBehavior.performFly();
   }

   void sound(){
       soundBehavior.performSound();
   }

}

interface FlyBehavior{
    void performFly();
}

interface SoundBehavior{
    void performSound();
}

class GuaGua implements SoundBehavior{
    public void performSound(){
        System.out.println("Gua Gua !!!!");
    }
}

class WangWang implements SoundBehavior{
    public void performSound(){
        System.out.println("Wang Wang !!!!");
    }
}

class BiuBiu implements FlyBehavior{
    public void performFly(){
        System.out.println("Biu Biu !!!!");
    }
}

class FlyNoWay implements FlyBehavior{
    public void performFly(){
        System.out.println("I can't Fly !!!!");
    }
}

class YellowDuck extends Duck{

    YellowDuck(SoundBehavior DefaultSoundBehavior,FlyBehavior DefaultFlyBehavior){
        this.soundBehavior = DefaultSoundBehavior;
        this.flyBehavior = DefaultFlyBehavior;
    }
    public void display(){
        System.out.println("I am a Yellow Duck !!!!");
    }
    
}

public class DuckRun{
    public static void main(String[] args){
        YellowDuck sg = new YellowDuck(new GuaGua(), new BiuBiu());
        sg.display();
        sg.fly(); 
        sg.sound();
        sg.setFlyBehavior(new FlyNoWay());
        sg.setSoundBehavior(new WangWang());
        sg.fly(); 
        sg.sound();

    }
};
