public abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public final void isAlive() {
        if (hp > 0) {
            final boolean i = true;
            System.out.println(this.name + "は生きている:" + i);
        }
    }

    public void showStatus() {
        System.out.println(this.name + "：HP " + this.hp);
    }
}
