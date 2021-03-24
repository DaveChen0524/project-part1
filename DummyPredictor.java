import java.io.*;
import java.util.ArrayList;

public class DummyPredictor extends Predictor{
    @Override
    ArrayList<DataPoint> readData(String filename) throws IOException {
        return null;
    }

    @Override
    String test(DataPoint data) {
        if(data.isTest==true){
            if(data.f1>data.f2)
                return "positive";
            else
                return "negative";
        }
        return "";
    }

    @Override
    Double getAccuracy(ArrayList<DataPoint> data) {
         double truecount=0;
         double falsecount=0;
         for(int i=0;i<data.size();i++){
             if(data.get(i).f1>data.get(i).f2&&data.get(i).label=="negative"){
                 truecount++;
             }
             else if(data.get(i).f1<data.get(i).f2&&data.get(i).label=="positive"){
                 truecount++;
             }
             else
                 falsecount++;
         }
         return truecount/data.size();
    }

    @Override
    Double getPrecision(ArrayList<DataPoint> data) {
        return null;
    }
}
