import java.util.HashMap;
import java.util.Map;

public class TF_DFI {
    private static Map<String, Double> tf_ifd_map = new HashMap<>();
    public static void main(String[] args) {
        Map<String, Double> tfMap = IDF_Cal.getAllTermFreq();
        Map<String, Double> idfMap = IDF_Cal.getIdfMap();
        for(String str : tfMap.keySet()){
            double termFrequency = tfMap.get(str);
            double inverseDocumentFrequency = idfMap.get(str);
            tf_ifd_map.put(str , termFrequency*inverseDocumentFrequency);
            //System.out.println(str + " : " + tf_ifd_map.get(str));
        }
    }
    public static void writeTF_IDF_ToFile() {
        //todo need to complete this
    }
}
