package task;

public class Main {
    public static void main(String[] args) {

//        {
//            CarouselRun run1 = new GraduallyDecreasingCarousel(7).run();
//            System.out.println(run1.isFinished()); //true
//            System.out.println(run1.next()); //-1
//        }


        {
            GraduallyDecreasingCarousel carousel = new GraduallyDecreasingCarousel(7);

            carousel.addElement(3);
            carousel.addElement(7);
            carousel.addElement(4);
            CarouselRun run = carousel.run();

            System.out.println("----------------------------");

            System.out.println(run.next());//3
            System.out.println(run.next());//7
            System.out.println(run.next());//4

            System.out.println("----------------------------");

            System.out.println(run.next());//2
            System.out.println(run.next());//6
            System.out.println(run.next());//3

            System.out.println("----------------------------");

            System.out.println(run.next());//4
            System.out.println(run.next());//1


            System.out.println("----------------------------");

            System.out.println(run.next());//1

            System.out.println("----------------------------");

            System.out.println(run.next());//-1
            System.out.println(run.isFinished()); //true
        }

//        {
//
//            GraduallyDecreasingCarousel carousel = new GraduallyDecreasingCarousel(5);
//
//            carousel.addElement(7);
//            carousel.addElement(2);
//            carousel.addElement(3);
//            carousel.addElement(1);
//            carousel.addElement(4);
//            CarouselRun run = carousel.run();
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next());//7
//            System.out.println(run.next());//2
//            System.out.println(run.next());//3
//            System.out.println(run.next());//1
//            System.out.println(run.next());//4
//            System.out.println("----------------------------");
//            System.out.println(run.next());//6
//            System.out.println(run.next());//1
//            System.out.println(run.next());//2
//            System.out.println(run.next());//3
//            System.out.println("----------------------------");
//            System.out.println(run.next());//4
//            System.out.println(run.next());//1
//            System.out.println("----------------------------");
//            System.out.println(run.next());//1
//            System.out.println("----------------------------");
//            System.out.println(run.next());//-1
//            System.out.println(run.isFinished());
//
//        }

//        {
////
//            DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);
//
//            carousel.addElement(20);
//            carousel.addElement(30);
//            carousel.addElement(10);
//
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.isFinished()); //false
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //20
//            System.out.println(run.next()); //30
//            System.out.println(run.next()); //10
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //19
//            System.out.println(run.next()); //29
//            System.out.println(run.next()); //9
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //17
//            System.out.println(run.next()); //27
//            System.out.println(run.next()); //7
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //14
//            System.out.println(run.next()); //24
//            System.out.println(run.next()); //4
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //10
//            System.out.println(run.next()); //20
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //5
//            System.out.println(run.next()); //15
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //9
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.next()); //2
//
//            System.out.println("----------------------------");
//
//            System.out.println(run.isFinished()); //true
//            System.out.println(run.next()); //-1
//
//        }



//        {
//            CarouselRun run = new HalvingCarousel(7).run();
//            System.out.println(run.isFinished()); //true
//            System.out.println(run.next()); //-1
//        }

//        {
//
//            DecrementingCarousel carousel = new HalvingCarousel(15);
//
//            carousel.addElement(9);
//            carousel.addElement(8);
//            carousel.addElement(4);
//            carousel.addElement(5);
//            carousel.addElement(5);
//            carousel.addElement(5);
//            carousel.addElement(7);
//            carousel.addElement(9);
//            carousel.addElement(9);
//            carousel.addElement(10);
//            carousel.addElement(4);
//            carousel.addElement(8);
//            carousel.addElement(4);
//            carousel.addElement(3);
//            carousel.addElement(5);
//
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.isFinished()); //false
//
//            System.out.println(run.next()); //9
//            System.out.println(run.next()); //8
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //5
//            System.out.println(run.next()); //5
//            System.out.println(run.next()); //5
//            System.out.println(run.next()); //7
//            System.out.println(run.next()); //9
//            System.out.println(run.next()); //9
//            System.out.println(run.next()); //10
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //8
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //3
//            System.out.println(run.next()); //5
//
//            System.out.println("-------------------------");
//
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //3
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //5
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //4
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //2
//
//            System.out.println("-------------------------");
//
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println("-------------------------");
//
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //1
//
//            System.out.println(run.isFinished()); //true
//            System.out.println(run.next()); //-1
//
//        }
//
//
//        {
//
//
//            HalvingCarousel carousel = new HalvingCarousel(7);
//
//            carousel.addElement(3);
//            carousel.addElement(7);
//            carousel.addElement(4);
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.next());//3
//            System.out.println(run.next());//7
//            System.out.println(run.next());//4
//
//            System.out.println("---------------------");
//
//            System.out.println(run.next());//1
//            System.out.println(run.next());//3
//            System.out.println(run.next());//2
//
//            System.out.println("---------------------");
//            System.out.println(run.next());//1
//            System.out.println(run.next());//1
//            System.out.println("---------------------");
//            System.out.println(run.next());//-1
//            System.out.println(run.isFinished()); //
//
//
//        }
//
//
//        {
//
//            HalvingCarousel carousel = new HalvingCarousel(5);
//
//            carousel.addElement(7);
//            carousel.addElement(2);
//            carousel.addElement(3);
//            carousel.addElement(1);
//            carousel.addElement(4);
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.next());//7
//            System.out.println(run.next());//2
//            System.out.println(run.next());//3
//            System.out.println(run.next());//1
//            System.out.println(run.next());//4
//            System.out.println("---------------------");
//            System.out.println(run.next());//3
//            System.out.println(run.next());//1
//            System.out.println(run.next());//1
//            System.out.println(run.next());//2
//            System.out.println("---------------------");
//            System.out.println(run.next());//1
//            System.out.println(run.next());//1
//            System.out.println("---------------------");
//            System.out.println(run.next());//-1
//            System.out.println(run.isFinished());//
//
//        }
//
//        {
//
//            DecrementingCarousel carousel = new DecrementingCarousel(10);
//            System.out.println(carousel.run() == null); //false
//            System.out.println(carousel.run() == null); //true
//        }
//
//        {
//            DecrementingCarousel carousel = new DecrementingCarousel(7);
//
//            carousel.addElement(2);
//            carousel.addElement(3);
//            carousel.addElement(1);
//
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.isFinished()); //false
//
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //3
//            System.out.println(run.next()); //1
//
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //2
//
//            System.out.println(run.next()); //1
//
//            System.out.println(run.isFinished()); //true
//            System.out.println(run.next()); //-1
//
//        }
//
//        {
//            DecrementingCarousel carousel = new DecrementingCarousel(3);
//
//            System.out.println(carousel.addElement(-2)); //false
//            System.out.println(carousel.addElement(0)); //false
//
//            System.out.println(carousel.addElement(2)); //true
//            System.out.println(carousel.addElement(3)); //true
//            System.out.println(carousel.addElement(1)); //true
//
//            //carousel is full
//            System.out.println(carousel.addElement(2)); //false
//
//            CarouselRun run = carousel.run();
//
//            System.out.println(run.next()); //2
//            System.out.println(run.next()); //3
//            System.out.println(run.next()); //1
//
//            System.out.println(run.next()); //1
//            System.out.println(run.next()); //2
//
//            System.out.println(run.next()); //1
//
//            System.out.println(run.isFinished()); //true
//            System.out.println(run.next()); //-1
//        }
//
//        {
//
//            DecrementingCarousel carousel = new DecrementingCarousel(10);
//
//            System.out.println(carousel.addElement(2)); //true
//            System.out.println(carousel.addElement(3)); //true
//            System.out.println(carousel.addElement(1)); //true
//
//            carousel.run();
//
//            System.out.println(carousel.addElement(2)); //false
//            System.out.println(carousel.addElement(3)); //false
//            System.out.println(carousel.addElement(1)); //false
//
//        }
//
//        {
//            DecrementingCarousel carousel = new DecrementingCarousel(10);
//            System.out.println(carousel.run() == null); //false
//            System.out.println(carousel.run() == null); //true
//        }


    }

}
