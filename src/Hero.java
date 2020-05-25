public class Hero {

    String name;//姓名
    Float hp;//血量
    Float armor;//护甲
    int moveSpeed;//移速

    //坑队友方法
    void keng(){
        System.out.println("坑队友");
    }

    //获取护甲值
    Float getArmor(){
        return armor;
    }

    //增加移速
    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    //超神
    void legendary(){
        System.out.println("超神");
    }

    //获取血量
    Float getHp(){
        return hp;
    }

    //回血
    void recovery(float blood){
        hp = hp + blood;
    }

    //给盖伦增加00移速
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        System.out.println("英雄名字    " + garen.name);
        garen.moveSpeed = 350;
        System.out.println("自身移速    " + garen.moveSpeed);
        garen.addSpeed(100);
        System.out.println("加移速      " + garen.moveSpeed);
        garen.armor = 10f;
        System.out.println("护甲值      " + garen.getArmor());
        garen.hp = 20f;
        System.out.println("当前血量    " + garen.getHp());
        garen.recovery(500);
        System.out.println("回血        " + garen.hp);


    }

}
