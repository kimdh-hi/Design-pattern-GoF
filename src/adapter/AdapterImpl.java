package adapter;

public class AdapterImpl implements Adapter{

    private ExistingFeatures ef = new ExistingFeatures();

    @Override
    public Float doubleNumber(Float number) {
        return (float) ef.doubleNumber(number.doubleValue());
    }

    @Override
    public Float halfNumber(Float number) {
        return (float) ef.halfNumber(number.doubleValue());
    }
}
