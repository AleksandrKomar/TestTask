package task;

public class CarouselRun {

    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;

    int countOut = DecrementingCarousel.countOut;
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

   protected int count = 0;

    @Override
    public int next() {
        //override behaviour as needed
        if (isFinished()) {
            return -1;
        } else {
            while (array[position %= array.length] <= 0) {
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

        if (prohod++ < count) {
            return array[position++];
        }


        if ((array[position++] /= 2) == 0) {
            next();
        }
        return array[position - 1];
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

class GraduallyCarouselRun extends CarouselRun {

    int decrement = 1;

    @Override
    public int next() {

        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }


        return beforeDecreasing;


    }

    @Override
    public boolean isFinished() {
        //override behaviour as needed
        for (int el : array)
            if (el> 0){
                return false;
            }
        return true;

    }
}

class GraduallyCarouselRunWithLimit extends CarouselRun {

    int decrement = 1;

    int count;

    @Override
    public int next() {

            if (isFinished())
                return -1;
            else {
                while (array[position %= array.length] <= 0) {
                    position++;
                }
            }


        if (count == countOut) {
            return -1;
        }

        count ++;
        return array[position++]--;

    }

    @Override
    public boolean isFinished() {
        //override behaviour as needed
        for (int el : array)
            if (el> 0 && count < countOut){
                return false;
            }
        return true;
    }
}