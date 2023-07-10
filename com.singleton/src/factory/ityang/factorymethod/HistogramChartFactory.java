package factory.ityang.factorymethod;

public class HistogramChartFactory extends Factory{
    @Override
    public Chart getInstance(){
        return new HistogramChart();
    }
}
