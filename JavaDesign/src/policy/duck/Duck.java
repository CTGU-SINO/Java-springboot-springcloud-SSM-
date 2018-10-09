package policy.duck;

public abstract class Duck {

    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck(){

    }

    public void fly(){
        mFlyBehavior.fly();
    }

    public void quack(){
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void SetFlyBehavior(FlyBehavior fb){
        mFlyBehavior = fb;
    }

    public void SetQuackBehavior(QuackBehavior qb){
        mQuackBehavior = qb;
    }

    public void swim(){
        System.out.println("--im swim--");
    }

}
