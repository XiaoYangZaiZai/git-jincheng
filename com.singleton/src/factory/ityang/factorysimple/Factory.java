package factory.ityang.factorysimple;

public class Factory {

    public static Chart getInstance(String type){
        switch (type){
            case "Histogram"->{return  new HistogramChart();}
            case "Line"->{return new LineChart();}
            case "Pine"->{return new PieChart();}
            default -> {return null;}
        }
    }
}
