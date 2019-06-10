public abstract class IngrediensOfYourComputer {

    private String model;
    private String producer;
    private String seriesNumber;

    public IngrediensOfYourComputer(String model, String producer, String seriesNumber) {
        this.model = model;
        this.producer = producer;
        this.seriesNumber = seriesNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    @Override
    public String toString() {
        return model +" " +producer +" " +seriesNumber +" ";
    }
}
