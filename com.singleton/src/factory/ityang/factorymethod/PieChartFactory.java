package factory.ityang.factorymethod;

public class PieChartFactory extends Factory{
    public Chart getInstance(){
        return  new PieChart();
    }
}
