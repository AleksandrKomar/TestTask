package task;

public class CarouselRun {


    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;

    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    public boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }


}

class AnotherCarouselRun extends CarouselRun {

    protected int prohod = 0;

    int count = 0;
    @Override
    public int next() {
        //override behaviour as needed
        if (isFinished()) {
            return -1;
        } else {
            while (array[position %= array.length] <= 1) {
                position++;
            }
        }

        if (count == 0) {

            for (int i = 0; i < array.length; i++) {

                if (array[i] > 0) {
                    count++;
                }

            }
        }

        if (prohod++ < count){
            return array[position++];
        }

//        System.out.print(array[position] + " ");

        return ((array[position++] /= 2) == 0) ? array[position++] /= 2 : array[position - 1];

//      return array[position++] /= 2;
    }

    @Override
    public boolean isFinished() {
        //override behaviour as needed
        for (int el : array)
            if (el > 1)
                return false;
        return true;

    }
}