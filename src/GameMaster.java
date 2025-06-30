public class GameMaster {
    public static void main(String[]args){
        Hero h = new Hero("アベル",10);
        h.weapon= "銅の剣";


        Slime s = new Slime("スライム",50);

        h.showStatus();
        s.showStatus();

        System.out.println("戦闘開始!");
        h.attack(s);
        s.showStatus();
        s.attack(h);
        h.showStatus();
        h.heal(h);
        h.showStatus();
        h.attack(s);
        h.attack(s);
        h.attack(s);
        s.showStatus();

        System.out.println("--- 戦闘終了 ---");
        h.isAlive();
        s.isAlive();



    }



}
