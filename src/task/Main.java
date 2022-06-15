package task;

public class Main {
    public static void main(String[] args) {

        {

            HalvingCarousel carousel = new HalvingCarousel(5);

            carousel.addElement(7);
            carousel.addElement(2);
            carousel.addElement(3);
            carousel.addElement(1);
            carousel.addElement(4);
            CarouselRun run = carousel.run();

            System.out.println(run.next());//7
            System.out.println(run.next());//2
            System.out.println(run.next());//3
            System.out.println(run.next());//1
            System.out.println(run.next());//4
            System.out.println("---------------------");
            System.out.println(run.next());//3
            System.out.println(run.next());//1
            System.out.println(run.next());//1
            System.out.println(run.next());//2
            System.out.println("---------------------");
            System.out.println(run.next());//1
            System.out.println(run.next());//1
            System.out.println("---------------------");
            System.out.println(run.next());//-1
            System.out.println(run.isFinished());//

        }


    }

}
