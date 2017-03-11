package com.example.bunty.touristinfo;

import java.util.ArrayList;


public class CityNameData {


    public static String Delhi_Description="A symbol of the country’s rich past and thriving present, Delhi is a city where  ancient and modern blend seamlessly together. " +
        "It is a place that not only touches your pulse but even fastens it to a frenetic speed. Home to millions of dreams, the city takes on unprecedented responsibilities of realizing dreams bringing"+
        "people closer and inspiring their thoughts.With a history that goes back many centuries, Delhi showcases an ancient culture and a rapidly modernising country. " +
        "Dotted with monuments there is much to discover here. The seat of many powerful empires in the past, its long history can be traced in its many carefully-preserved monuments, ancient forts and tombs."+
        "New additions to the city, such as Akshardham Temple and also the Lotus Temple are also great places to visit and give an idea of its multi-faceted culture.";
    public static String Mumbai_Description="Mumbai is in all ways a mega-city driven by power, wealth,glamour and fame which attracts people to give shape to their dreams and aspirations." +
        " But it is also a city with strong historical links, wonderful British architecture, museums, beaches, places of worship, and above all, a true galaxy of stars where Bollywood reigns supreme." +
        "A city of diverse cultures and a melting pot of commerce, industry, entertainment, enterprise, and politics, Mumbai’s trysts with wealth and fame have.";
    public static String Ahmedabad_description="Founded in the 15th century, Ahmedabad is the largest city in the state of Gujrat. " +
            "The city is a vibrant business district and rising centre of education, information technology and scientific industries. " +
            "Divided in two - the old city and the new city; The city offers different moods right from the hustle-bustle of C.G. Road " +
            "in the heart of Ahmedabad to the quite retreat of of the Sabarmati Ashram. Ahmedabad enjoys a thriving cultural tradition," +
            " being the centre of Gujarati cultural activities and diverse traditions of different ethnic and religious communities. " +
            "Popular celebrations and observances include Uttarayan - an annual kite-flying day on 14 January and the nine nights of" +
            " Navratri - celebrated with people performing Garba - the folk dance of Gujarat - at venues across the city.";
    public static String Lucknow_description="Lucknow is the capital city of Uttar Pradesh and it has always been a multicultural city. Courtly manners, " +
            "beautiful gardens, poetry, music, and fine cuisine patronized by the Persian-loving Shia Nawabs of the city are well known " +
            "amongst Indians and students of South Asian culture and history. Lucknow is popularly known as the The City of Nawabs." +
            "It is also known as the Golden City of the East, Shiraz-i-Hind and The Constantinople of India.";
    public static String Hyderabad_description="Steeped in history, thronged with people and buzzing with commerce, the Old City of Hyderabad" +
            " is one of India's most evocative ancient quarters. Exploring the lanes of this district, with its chai shops and spice " +
            "merchants, you'll encounter a teeming urban masala of colour and commerce. Looming over the Old City is some of Islamic India's " +
            "most impressive architecture, in varying states of repair. Most visitors concentrate their time in this area, though the" +
            " magnificent Golconda Fort should not be missed either." +
            "Hyderabad's other pole is far younger and west of the centre – its Hi-Tech City, or 'Cyberabad', and other districts like Banjara Hills and" +
            "Jubilee Hills – are replete with glittery malls, multiplexes, clubs, pubs and sleek restaurants.";
    public static String Bangalore_description="Known as both the Garden City  and The Silicon Valley of India, bangalore (officially Bengaluru) " +
           "is a techie’s paradise, boasting the highest concentration of IT companies in the country. When you’re done geeking out, " +
            "there are plenty of gardens, museums, natural features, palaces and temples to fill your dance card. Visit Vidhana Soudha, Cubbon Park and the Ulsoor Lake of bangalore," +
           " well known for its beautiful locales and boating facilities. bangalore is also a major centre of Indian classical music and dance," +
            " and of vivid, cutting-edge nightlife.";
    public static String Chennai_description="If you have time to explore Chennai (formerly Madras), this 400-sq-km conglomerate of urban villages " +
            "and diverse neighbourhoods making up Tamil Nadu's capital will pleasantly surprise you. Its role is as keeper of South Indian " +
            "artistic, religious and culinary traditions,Among Chennai’s greatest assets are its people, infectiously enthusiastic about their hometown; they won’t hit you with a lot of " +
            "hustle and hassle. Recent years have thrown in a new layer of cosmopolitan glamour: luxe hotels, sparkling boutiques," +
            "quirky cafes, smart contemporary restaurants and a sprinkling of swanky bars and clubs." +
            "With its sweltering southern heat, roaring traffic and lack of outstanding sights, Chennai has often been seen as the" +
            " dowdier sibling among India’s four biggest cities. But even if you’re just caught here between connections" +
            " it’s well worth poking around the museums, exploring the temples, savouring deliciously authentic South Indian delicacies or" +
            " taking a sunset saunter along Marina Beach.";
    public static String Kolkata_description="India’s second-biggest city is a daily festival of human existence, simultaneously noble and " +
            "squalid, cultured and desperate, decidedly futuristic while splendid in decay. By its old spelling, Calcutta readily " +
            "conjures images of human suffering to most Westerners – although that's not a complete picture of this 350-year-old " +
            "metropolis. Locally, Kolkata is regarded as India’s intellectual, artistic and cultural capital. Although poverty is "+
            "certainly apparent, the self-made middle class drives the city's core machinery, a nascent hipster culture thrives among " +
            "its millennial residents and its dapper Bengali gentry frequent grand old colonial-era clubs." +
            "As the former capital of British India, Kolkata retains a feast of colonial-era architecture contrasting starkly with" +
            "urban slums and dynamic new-town suburbs with their air-conditioned shopping malls. Kolkata is the ideal place to experience" +
            " the mild yet complex tang of Bengali cuisine.";


    public static ArrayList<CityNames> getCityNameData(){

        ArrayList<CityNames> listCityNames=new ArrayList<>();
        listCityNames.add(new CityNames("DELHI"));
        listCityNames.add(new CityNames("MUMBAI"));
        listCityNames.add(new CityNames("AHMEDABAD"));
        listCityNames.add(new CityNames("LUCKNOW"));
        listCityNames.add(new CityNames("HYDERABAD"));
        listCityNames.add(new CityNames("BANGALORE"));
        listCityNames.add(new CityNames("CHENNAI"));
        listCityNames.add(new CityNames("KOLKATA"));
        return listCityNames ;

    }
    public static ArrayList<CityNames> getCityDescription(){
        ArrayList<CityNames> listcityDescription=new ArrayList<>();
        listcityDescription.add(new CityNames(Delhi_Description,R.drawable.delhi));
        listcityDescription.add(new CityNames(Mumbai_Description,R.drawable.mumbai));
        listcityDescription.add(new CityNames(Ahmedabad_description,R.drawable.ahmedabad));
        listcityDescription.add(new CityNames(Lucknow_description,R.drawable.lucknow));
        listcityDescription.add(new CityNames(Hyderabad_description,R.drawable.hyderabad));
        listcityDescription.add(new CityNames(Bangalore_description,R.drawable.bangalore));
        listcityDescription.add(new CityNames(Chennai_description,R.drawable.chennai));
        listcityDescription.add(new CityNames(Kolkata_description,R.drawable.kolkata));
      return listcityDescription;
    }

}

