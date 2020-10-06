package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data2 {
    private static String data2 = "Google and Apple are two of the most successful and admired technology companies, yet their approach to product development differs in some fundamental aspects. Google’s is based heavily on data and experimentation and might be called the engineering approach. Apple’s relies more on vision and intuition and might be called the liberal arts approach.\n" +
            "\n" +
            "In a recent article by Marty Cagan, product management expert and author of “Inspired — How to Create Tech Products Customers Love”, he observes the following about difference in leading tech companies’ product cultures:\n" +
            "\n" +
            "I talk a lot about product culture and how important it is, but one inconvenient fact has always bothered me, which is that my favorite product companies — for example, Google, Apple and Amazon — all have such different cultures.\n" +
            "The difference between Apple and Google in particular is illustrated in the following tweet by Ken Kocienda, author of the book “Creative Selection: Inside Apple’s Design Process During the Golden Age of Steve Jobs”.\n" +
            "\n" +
            "\n" +
            "Of course, this quote perfectly matches what one would expect Apple’s approach to product development to look like, and the way the author throws shade at Google’s “41 shades of blue” test demonstrates a lot of disdain for that example of data-driven product decisions taken to the extreme.\n" +
            "\n" +
            "These two companies, Apple and Google, epitomize the difference between quantitative and qualitative thinking in product development philosophies, cultures, and processes. Google’s approach might be called the engineering approach, and Apple’s the liberal arts approach. Obviously, both approaches can be successful: Apple and Google are two of the most successful, valuable, and admired companies in the world.\n" +
            "\n" +
            "\n" +
            "Google’s data-driven “engineering” approach\n" +
            "Google is first and foremost a data company. From its mission to “organize the world’s information and make it universally accessible and useful” over its original product, the search engine, to the technologies such as BigTable or map/reduce that it has perfected for handling massive amounts of data, Google’s focus and core competency is handling data (lots of it).\n" +
            "\n" +
            "With this focus on data comes a natural tendency to trust data for making product decisions. If you have such a treasure trove of data available at your fingertips, it makes sense to use it when developing or improving products: if you have enough users (and Google certainly does), you can A/B test almost anything, including shades of blue.\n" +
            "\n" +
            "It is also of course not a coincidence that with Google Analytics / Optimize, Google is offering the entry level A/B testing tool that a lot of companies use before moving on to more sophisticated ones.\n" +
            "\n" +
            "Beyond just being very data-driven and A/B test heavy, Google has also displayed a very low barrier to launching new products. Google might be the tech company that has launched and killed the highest number of products (some with fiercely loyal fans): Inbox, Google Reader, Google+,… The list goes on. Obviously, part of Google’s approach is to launch quickly and kill quickly (presumably, based on usage data).\n" +
            "\n" +
            "Google is also famous for its management framework “Objectives and Key Results” (OKRs), which was conceived at Intel but perfected at Google. Management through OKRs involves setting priorities in the form of “objectives” (for example, “Improve new user onboarding”), and defining measurable “key results” that determine whether progress toward the objective was made (for example, “increase completion rate of the signup flow from 80% to 85%”). Given the focus on measurable results, OKRs more naturally favor a data-driven or data-informed way of product development.\n" +
            "\n" +
            "More recently, one of Google’s biggest core competencies is machine learning (again, driven by Google’s massive amounts of data). Machine learning makes (qualitatively) reasoning through product decisions harder: you can’t think through and actively design all “rules” of the model, or even validate what outputs the model will produce in all possible circumstances. On the other hand, it makes building data-driven feedback loops even easier: they can feed back right into the model without any human intervention — the product improves itself.\n" +
            "\n" +
            "Google can’t possibly “design” the search results (including rich previews etc.) for every possible search query, but it can design a machine learning algorithm that gets better with every user interaction: the user behavior on the page, including which search result the user clicks, can inform what results future users will be shown for a similar query. This is data-driven product development driven to the extreme. Therefore, the application of machine learning fits extremely well with Google’s product development approach and even reinforces it.\n" +
            "\n" +
            "In summary, Google’s products, core competencies, and management techniques are all very much aligned around an extremely data-driven approach to product development.\n" +
            "\n" +
            "\n" +
            "Apple’s intuition-driven “liberal arts” approach\n" +
            "Apple is at its core a hardware company. Of course, Apple also makes a lot of software, but most of it is very tightly coupled to the hardware and/or intended to make the hardware more valuable. Hardware development by nature is less iterative and requires a greater amount of “perfection” once the product ships. Software can be patched after release, even more so in Google’s case where a lot of the software is run on Google’s servers, but a flaw in the design of the hardware can’t be ironed out after launch. Apple brings this scrutiny in the design process to its software development efforts too.\n" +
            "\n" +
            "Apple’s hardware products are also “luxury products”, or at least high-end products. If you want the most affordable or value-for-money phone, computer, media player, etc. you are not going to buy the Apple version of the product. This means that Apple can command a price premium, but it also means that customer expectations are that the products work flawlessly, or at least attain a higher level of perfection than competitor products.\n" +
            "\n" +
            "In “Creative Selection”, Ken Kocienda summarizes his view of the Apple way of software product development:\n" +
            "\n" +
            "A small group of passionate, talented, imaginative, ingenious, ever-curious people built a work culture based on applying their inspiration and collaboration with diligence, craft, decisiveness, taste, and empathy and, through a lengthy progression of demo-feedback sessions, repeatedly tuned and optimized heuristics and algorithms, persisted through doubts and setbacks, selected the most promising bits of progress at every step, all with the goal of creating the best products possible.\n" +
            "Interestingly, like Google, Apple also uses an iterative, evolutionary approach to product development. However, the evolution is not achieved by building small increments, releasing them as experiments, and gathering data about how successful they were in moving some KPI. Rather, the evolution is internal, through a process of demo sessions with leadership which provides both feedback and the vision for where the product should eventually end up.\n" +
            "\n" +
            "This internal evolution is not driven by data, nor even by direct feedback from users and customers. Instead, it is driven by empathy and taste, two very qualitative means of making decisions. In Ken Kocienda’s words:\n" +
            "\n" +
            "[Empathy means] trying to see the world from other people’s perspectives and creating work that fits into their lives and adapts to their needs. […] Taste is developing a refined sense of judgment and finding the balance that produces a pleasing and integrated whole.\n" +
            "Apple’s feedback loops, and therefore the entire way of product development, is hence more qualitative, and perhaps even more subjective.\n" +
            "\n" +
            "While you perhaps need a visionary leader like Steve Jobs to maximize the impact of this qualitatively driven liberal arts approach to product development, the evolutionary approach of developing demos and gathering feedback on them has worked well for Apple, and allowed them to consistently ship products that are of higher quality and more “tasteful” than their competitors.\n" +
            "\n" +
            "\n" +
            "One aspect of this difference in product cultures that I find particularly interesting is how this manifests itself in the development ecosystems of these two companies — after all, they own the vast majority of the mobile platform market. I witnessed one anecdote illustrating this in a workshop about in-app subscriptions, hosted by Apple. One participant brought up the question how pricing A/B tests should be run on iOS — and another (non-Apple) participant responded by saying that the best way of running pricing A/B tests was to run them on Android. Given the background of these two different product cultures, the reason becomes clearer: Apple does not really believe in A/B testing as a necessary product development tool, but Google does, so it’s not a surprise that Google’s developer tools more easily enable A/B testing than Apple’s.\n" +
            "\n" +
            "I hope you found this article interesting. If you did, feel free to follow me on Twitter where I share thoughts and articles on product management daily.";

    public static List<String> getDataList() {
        String cleanData = data2.replaceAll("\n" , "").replaceAll("," ," ").replaceAll(":[^a-zA-Z0-9]" , " ");
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
