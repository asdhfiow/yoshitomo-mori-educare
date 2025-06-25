class Wizard extends GameCharacter{
 private int mp;
public Wizard(String name, int hp,int mp){
    super(name, hp);
    this.mp = mp;
}
@Override
public void showStatus(){
    super.showStatus();
    System.out.println("MP：" + mp);
}

}
