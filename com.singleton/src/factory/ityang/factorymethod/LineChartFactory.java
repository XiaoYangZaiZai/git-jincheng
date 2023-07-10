package factory.ityang.factorymethod;

public class LineChartFactory extends Factory{
    @Override
    public Chart getInstance(){
        return  new LineChart();
    }
}
