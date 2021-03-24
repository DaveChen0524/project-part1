public class DataPoint {
    Double f1;
    Double f2;
    String label;
    Boolean isTest;
    DataPoint(){

    }
    DataPoint(Double f1,Double f2,String label,Boolean isTest){
        this.f1=f1;
        this.f2=f2;
        this.label=label;
        this.isTest=isTest;
    }

    public Double getF1() {
        return f1;
    }

    public Double getF2() {
        return f2;
    }

    public Boolean getTest() {
        return isTest;
    }

    public String getLabel() {
        return label;
    }

    public void setF1(Double f1) {
        this.f1 = f1;
    }

    public void setF2(Double f2) {
        this.f2 = f2;
    }

    public void setLabel(String label) {
        if(!(label.equals("positive")||label.equals("negative")))
            return;
        this.label = label;
    }

    public void setTest(Boolean test) {
        isTest = test;
    }
}
