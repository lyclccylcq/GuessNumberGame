public class Player {
    int number=0;//先给要猜的数字初始化
    public void guess(){
        number=(int)(Math.random()*10);//还是用随机数的方法来表现猜测
        System.out.println("I'm guessing"+number);
    }
}
//玩家类到此为止，主要就是一个guess函数