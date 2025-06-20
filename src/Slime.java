public final class Slime extends Character{
    public void attack (Character target){
        System.out.println(this.name + "の体当たり攻撃!" +target.name + "に５ダメージを与えた!");
        target.hp -= 5;


    }
}
