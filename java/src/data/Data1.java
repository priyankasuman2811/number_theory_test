package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data1 {
    private static String data1 = "To make autonomous driving cars safer and smarter, what we need is providing human-like reflexes to the car, and that could be achieved through 5G only”.\n" +
            "Who would have thought that the 5G wireless networks which are used for faster data speeds on phones and laptops could actually be used in making driverless cars more efficient and superior?\n" +
            "The concept of self-driving cars is not new; it has in fact grown exponentially since the past years. Many companies such as Uber, Tesla and Toyota have begun testing their autonomous vehicles on road in Phoenix, Pittsburgh and Boston. However, this growth had met with scepticism when an accident of an autonomous Uber vehicle surfaced. It made people doubt if the autonomous vehicles were even ready to be used on roads.\n" +
            "The installment of 5G wireless network connections will not only clear all the doubts about self-driving cars but also influence its growth. With 5G wireless networks, the cars will not just be faster but smarter and safer, too.\n" +
            "\n" +
            "How? The 5G network has the capability to give human-like reflexes to a car which might prevent accidents, unlike the current 4G network which can only be used to share status updates and request rides.\n" +
            "\n" +
            "In an interview with the BBC, Nokia’s Jane Rygaard said, “We need to look at how long it takes for the message to be transmitted between sensors and then get to the computer in each car, and then how long it takes for the computer to make a decision, and all of this has to be in less time than a human would take to make a decision — 2 milliseconds. We need a network supporting this, and 5G is that network.”\n" +
            "\n" +
            "However, the cars with 5G wireless networks would take a few more years to have widespread adoption, but it is still something which is worth the wait.\n" +
            "\n" +
            "Former Ford CEO Mark Fields has stated to CNBC that Ford plans to have a level 4 vehicle by the year 2021 with “no gas pedal, no steering wheel, and the passenger will never need to take control of the vehicle in a predefined area.”\n" +
            "\n" +
            "With 5G wireless network connections in the picture, many other astounding features like virtual reality, smart cities and artificial intelligence could be within our grasp.\n" +
            "\n" +
            "Evolution of the networks\n" +
            "\n" +
            "The first generation analog cellular system evolved in the early ’80s which enabled people to talk to each other.\n" +
            "The second generation and 2.5G mobile systems evolved in the early ’90s which allowed people to send texts.\n" +
            "The third generation system evolved in the new millennium enabled people to access broadband speed internet, multifaceted communication, entertainment, and even shopping was made possible.\n" +
            "4G enables people to share real-time information and location. This particular feature gave rise to companies like Uber which use the real-time location of the customer.\n" +
            "With the latest evolution of 5G technology, average download speeds of around 1GBps expected to soon be the norm. Recently South Korea launched the world’s first nationwide 5G mobile networks. And 5G networks are expected to launch across the world by 2020.\n" +
            "Why 5G over 4G LTE?\n" +
            "The biggest advantage of 5G over the 4G LTE is that 5G has more spectrum and uses more advanced radio technology, unlike 4G LTE. This means that 5G could download and upload data at a faster rate than other technologies.\n" +
            "The 4G LTE technology depends on large masts while 5G requires only lots of small cells which are close together. These 5G base stations could be easily placed on top of street lamps or side of the buildings with less hassle.\n" +
            "Another advantage of 5G over 4G LTE is the logical separation of network for various purposes. In the 4G network, a single 4G LTE network is used for all the applications. However, 5G has a network separation capability which would enable separating a logical network solely for autonomous driving.\n" +
            "\n" +
            "Vehicle-to-Vehicle (V2V) and Vehicle-to-Infrastructure (V2I) Communication \n" +
            "with Cloud Service Provider.\n" +
            "How does 5G contribute to autonomous driving cars?\n" +
            "When the 5G technology comes into play, it brings with it advanced technologies like artificial intelligence, virtual reality and most importantly Internet OF Things (IOT). With the 5G technology, it will be possible to connect everything around us to a network which has high speed and response.\n" +
            "\n" +
            "The autonomous cars use sensors to make vehicles faster. Huge amounts of data are generated by these sensors. The 4G networks are not fast enough to handle, process and analyze such data which is why we need a 5G network.\n" +
            "\n" +
            "With 5G wireless network installments, the autonomous driving car will be able to detect not only vehicles but other obstacles while driving. The driving experience would be similar to the manual one where the driver could see everything around him and make decisions accordingly, except there’s no driver here! Just the 5G wireless network. The autonomous driving car would be able to connect with all the objects around it. This is called Vehicle-to-X communication.\n" +
            "\n" +
            "\n" +
            "How V2X Technology is used. (Open image in a new tab to see enlarged view)\n" +
            "Using this Vehicle-to-X Communication and Vehicle-to-Vehicle communication, the concern of accidents could be erased.\n" +
            "\n" +
            "For example, let us assume that car A is travelling with a speed of 90kmph. When another car B pulls out in front of the car A all of a sudden, there is a high chance of an accident. In such a case, the sensors in both the cars communicate with each other and increase the speed of car B while reducing the speed of car A to avoid a collision.\n" +
            "\n" +
            "Similarly, if the road condition is not good, or if there is a cyclist approaching, the sensors will respond accordingly and enable a safe drive.\n" +
            "\n" +
            "Conclusion\n" +
            "Logistically, the implementation of 5G wireless network in self-driving cars and the implementation of sensors at all the necessary places like infrastructure and street lights is time consuming and expensive, to say the least. Such implementation would not only pave the way for autonomous driving cars but also many more breathtaking features like smart cities and virtual reality would be made possible. This implementation would be a revolution in itself. And, with the US and China being so sportive about implementing 5G network, that future might not be so far away, after all.\n";

    public static List<String> getDataList() {
        // Data clean up
        String cleanData = data1.replaceAll("\n" , "").replaceAll("," ," ").replaceAll(":[^a-zA-Z0-9]" , " ");
         return Arrays.asList(data1.split("\\s+"));
    }
    public static Map<String, Integer> getFreqMap() {
        Map<String, Integer> freq = new HashMap<>();
        List<String> stringList = getDataList();
        for(String str : stringList){
            int prev = 0;

            if(freq.get(str) != null){
                prev = freq.get(str);
            }

            freq.put(str , prev + 1);
        }
        return freq;
    }
    public static Map<String, Double> getTermFreq () {
        Map<String, Double> tfMap = new HashMap<>();
        Map<String , Integer> freqMap = getFreqMap();
        double wordcount = freqMap.keySet().size();
        for(String str : getFreqMap().keySet()){
            double tf = freqMap.get(str) / wordcount;
            tfMap.put(str , tf);
        }
        return tfMap;
    }

}
