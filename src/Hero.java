public class Hero extends Character{
    String weapon;
    public void attack(Character target){

        System.out.println(this.name + "は" +this.weapon + "で" + target.name +"に１０ダメージ与えた！");
        target.hp -= 10;
    }
    public void heal(Character target){
        System.out.println(this.name + "は回復呪文を唱えた! HPが２０回復した！");
        target .hp += 10;


    }

}
