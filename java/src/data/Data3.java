package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data3 {
    private static String data3 = "I’m a person who likes to adopt new technology early: I was into MiniDisc players way back when; I had the first Android phone; I moved away from conventional home audio and adopted Sonos in 2012; I’m all about that home automation. I love products, services and companies that make me feel like I’m in the future.\n" +
            "\n" +
            "I first drove an electric car in August 2014. I was offered a test drive through the Tesla Australia mailing list, which I had been a of member since 2011. It immediately became a dream of mine to own a Tesla.\n" +
            "\n" +
            "I placed a refundable reservation for their small sedan, the Model 3, in April 2016 when it was first announced. That same year, I made an investment in a cryptocurrency called Ethereum because like many of us in the tech industry, I felt like I had completely missed the Bitcoin boat. In early 2018, following an extraordinary stroke of luck and capital gains of 7500%, I sold out and purchased a Tesla Model X.\n" +
            "\n" +
            "\n" +
            "It has been nearly 14 months since I took delivery and I am still completely obsessed with it.\n" +
            "\n" +
            "Being an EV owner has opened me up to many impromptu conversations with interested strangers (which is great — it’s a big part of why I bought the thing!) but most people ask the same two questions. First, they’ll ask “how long does it take to charge?”, and they’ll follow that up with, “how far can you drive?”. I give them a long winded answer that talks about home charging vs supercharging vs destination charging, but it’s a lot to digest.\n" +
            "\n" +
            "The short answer is:\n" +
            "\n" +
            "If my car battery was empty, it would take 20 hours to reach 100% state of charge (SOC) when plugged in at home.\n" +
            "I can drive somewhere between 400km and 430km with 100% SOC.\n" +
            "But this doesn’t really say much about my experiences, because I have never completely flattened the car’s battery and I very rarely charge to 100%. Let me explain.\n" +
            "\n" +
            "Home charging\n" +
            "An electric car is much like a phone: you plug it in at night and you wake up with a charged battery. This is the equivalent of having a petrol pump at your house. Trust me, this part is awesome. The need to visit petrol stations just evaporates.\n" +
            "\n" +
            "Don’t listen to people that say we’ll all need to upgrade our homes to three-phase power (a higher voltage connection to the grid). I thought that too but JET Charge, the group that installed my included wall charger, talked me out of it.\n" +
            "\n" +
            "\n" +
            "Day-to-day, fast charging just isn’t necessary. My commute is a 12km round trip which consumes about 4% battery. When charging at the end of a day, that energy returns to the battery in under an hour. Even if my commute were a 100km round trip, I’d only be looking at 6 or 7 hours of charging overnight.\n" +
            "\n" +
            "To help you understand charging speed, here’s the maths:\n" +
            "\n" +
            "Amps x Volts = Watts\n" +
            "\n" +
            "25 amps x 240 volts = 6000 watts or 6 kilowatts.\n" +
            "\n" +
            "Charging isn’t perfectly efficient, so I typically see a charge rate of about 5% per hour (or 5 kilowatt-hours of my car’s 100 kilowatt-hour capacity). I could even plug my car directly into a regular power point instead of paying to install the wall charger. An average wall outlet can supply 10 amps.\n" +
            "\n" +
            "10 amps x 240 volts = 2400 watts or 2.4 kilowatts.\n" +
            "\n" +
            "With power point charging I typically see 2% added per hour of charging. If charging were to occur between 7pm and 7am, this would still be enough to achieve my hypothetical 100km round trip commute.\n" +
            "\n" +
            "So, what does it cost me? Well, my energy supplier is Powershop, and to them I pay a premium to be 100% covered by renewable energy, so my energy rates are quite high at about 30c per kilowatt-hour. This equates to about $1.20 per commute or roughly 10c per km. A ‘full tank’ would cost me about $30 — but again, electric cars invoke a different mindset.\n" +
            "\n" +
            "Supercharging\n" +
            "This is where things really differ. Can you imagine someone stopping at a petrol station and only putting 7 litres of fuel in their car? That would seem strange, yes?\n" +
            "\n" +
            "With an electric car you almost never perform a full charge, so you ARE that weirdo that buys less than a full tank of fuel. \n";
    public static List<String> getDataList() {
        String cleanData = data3.replaceAll("\n" , "").replaceAll("," ," ").replaceAll(":[^a-zA-Z0-9]" , " ");
        return Arrays.asList(cleanData.split("\\s+"));
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
