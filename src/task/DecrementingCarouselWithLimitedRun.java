package task;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{

    public DecrementingCarouselWithLimitedRun(int capacity, int limit) {
        super(capacity, limit);
    }

    @Override
    public CarouselRun run() {

        if (!isRun) {
            isRun = true;
            return new GraduallyCarouselRunWithLimit();
        }
        return null;

    }

}
