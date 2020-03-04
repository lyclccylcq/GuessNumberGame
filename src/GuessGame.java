public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    //用三个实例变量来表示Player对象
    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();
        //创建三个玩家对象
        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isRight= false;
        boolean p2isRight= false;
        boolean p3isRight= false;

        //产生目标待猜测的数字
        int targetNumber =(int)(Math.random()*10);//产生10以内的随机数，mathrandom是产生0-1的一个小数，然后乘以10取整即可
        System.out.println("I'm thinking a number between 0 and 9....");

        while (true){
            System.out.println("Number to guess is"+targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            //调用玩家的猜测方法

            guessp1=p1.number;
            System.out.println("Player one guessed"+guessp1);
            guessp2=p2.number;
            System.out.println("Player one guessed"+guessp2);
            guessp3=p3.number;
            System.out.println("Player one guessed"+guessp3);
            //取出每个玩家的猜测

            if (guessp1==targetNumber){
                p1isRight=true;
            }
            if (guessp2==targetNumber){
                p2isRight=true;
            }
            if (guessp3==targetNumber){
                p3isRight=true;
            }
            //判断玩家们是否猜对了
            if (p1isRight||p2isRight||p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player one got it right?"+p1isRight);
                System.out.println("Player two got it right?"+p2isRight);
                System.out.println("Player three got it right?"+p3isRight);
                System.out.println("Game is over");
                break;//游戏结束，跳出去
            }else{
                System.out.println("The game will continue");
            }//都没猜到，游戏继续
        }
    }
}//游戏主体到此结束，但是玩家类还没有写
