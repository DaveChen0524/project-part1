import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
    ArrayList<DataPoint> train=new ArrayList<DataPoint>();
    DataPoint traindata1=new DataPoint(0.5,0.8,"positive",false);
    DataPoint traindata2=new DataPoint(0.4,0.9,"positive",false);
    DataPoint traindata3=new DataPoint(0.3,0.4,"positive",false);
    DataPoint traindata4=new DataPoint(0.9,0.7,"negative",false);
    ArrayList<DataPoint> test=new ArrayList<DataPoint>();
    DataPoint testdata1=new DataPoint(0.5,0.8,"positive",true);
    DataPoint testdata2=new DataPoint(0.4,0.9,"positive",true);
    DataPoint testdata3=new DataPoint(0.3,0.4,"positive",true);
    DataPoint testdata4=new DataPoint(0.9,0.7,"negative",true);
    DataPoint testdata5=new DataPoint(1.3,0.4,"negative",true);
    DataPoint testdata6=new DataPoint(0.5,0.7,"positive",true);
    Driver(){
        train.add(traindata1);
        train.add(traindata2);
        train.add(traindata3);
        train.add(traindata4);
        test.add(testdata1);
        test.add(testdata2);
        test.add(testdata3);
        test.add(testdata4);
        test.add(testdata5);
        test.add(testdata6);

    }
    public static void main(String[] args) {
        Driver driver=new Driver();
        JFrame jFrame=new JFrame();
        jFrame.setSize(300,300);
        JPanel jPanel1=new JPanel();
        JLabel jLabel1=new JLabel(new DummyPredictor().getAccuracy(test).toString());
        jLabel1.setBounds(10,10,10,10);
        jPanel1.add(jLabel1);
        jFrame.setVisible(true);
    }
}
