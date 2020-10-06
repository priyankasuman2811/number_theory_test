import data.Data1;
import data.Data2;
import data.Data3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDF_Cal {
    public static Map<String, Integer> getAllFreqMap() {
        Map<String, Integer> freq = new HashMap<>();
        List<String> stringList1 = Data1.getDataList();
        List<String> stringList2 = Data2.getDataList();
        List<String> stringList3 = Data3.getDataList();
        for(String str : stringList1){
            int prev = 0;

            if(freq.get(str) != null){
                prev = freq.get(str);
            }
            freq.put(str , prev + 1);
        }
        for(String str : stringList2){
            int prev = 0;

            if(freq.get(str) != null){
                prev = freq.get(str);
            }
            freq.put(str , prev + 1);
        }
        for(String str : stringList3){
            int prev = 0;

            if(freq.get(str) != null){
                prev = freq.get(str);
            }
            freq.put(str , prev + 1);
        }
        return freq;
    }
    public static Map<String, Double> getAllTermFreq () {
        Map<String, Double> tfMap = new HashMap<>();
        Map<String , Integer> freqMap = getAllFreqMap();
        double wordcount = freqMap.keySet().size();
        for(String str : getAllFreqMap().keySet()){
            double tf = freqMap.get(str) / wordcount;
            tfMap.put(str , tf);
        }
        return tfMap;
    }

    public static Map<String, Double> getIdfMap(){
        Map<String, Double> idfMap = new HashMap<>();
        List<String> dataList1 = Data1.getDataList();
        List<String> dataList2 = Data2.getDataList();
        List<String> dataList3 = Data3.getDataList();
        for(String str : getAllFreqMap().keySet()){
            int docCount = 0;
            if(dataList1.contains(str)){
                docCount++;
            }
            if(dataList2.contains(str)){
                docCount++;
            }
            if(dataList3.contains(str)){
                docCount++;
            }
            //System.out.println(str + " : " + Math.log(3.0 / docCount));
            idfMap.put(str , Math.log(3.0 / docCount));
        }
        return idfMap;
    }

}
