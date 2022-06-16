package task;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{

    public GraduallyDecreasingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {

        if (!isRun) {
            isRun = true;
            return new GraduallyCarouselRun();
        }
        return null;

    }

}
