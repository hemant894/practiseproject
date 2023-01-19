package PractiseProject;

public class RunGames {
    public static void main(String[] args) {
        System.out.println("$$$$$ Cricket $$$$$$");
        System.out.println("********************");
        Cricket c=new Cricket();
        c.Active();
        c.Diet();
        c.Fitness();
        c.players();
        c.Run();
        c.Bat();
        c.Bowling();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("===== FootBall======");
        System.out.println("====================");
        FootBall f= new FootBall();
        f.Active();
        f.Diet();
        f.Fitness();
        f.players();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("===== / Hockey /=======");
        System.out.println("=======================");
        Hockey h=new Hockey();
        h.Runs();
        h.Hockey();
        h.Active();
        h.Diet();
        h.players();
        h.Fitness();



    }
}
