package com.example.bunty.touristinfo;

import java.util.ArrayList;



public class FamousplacesData {


    public static ArrayList<SingleFamousPlaces> getDelhiPlaces(){

        String Red_Fort="Red Fort symbolizes the era of Mughal rule in India. The Fort, built in 1638, is a magnificent monument that captivates your attention and exhibits the show of architectural splendor of Mughals. The 33m high walls of Red Fort were built with a view to prevent invaders. Sound and light show is conducted here in the evenings. The one-hour long show recreates historical events associated with Red Fort. The Fort is closed for visits on Mondays.";
        String Lotus_Temple="Bahai Temple is famously known as Lotus Temple owing to its resemblance to lotus flower. Lotus symbolizes four religions namely Hinduism, Islam, Buddhism and Jainism. Out of the seven major Bahai temples constructed around the world, the one in Delhi was constructed last. The structure was completed in the year 1986 and pure white marble was used in the construction. The place is serene and is open for prayers and meditation by people who follow any religion. The nine pools of water around the petals is a sight to watch at dusk.";
        String India_Gate="India Gate was constructed in the year 1931 as a war memorial for over 70,000 soldiers killed during First World War and Afghan War. The names of the soldiers are inscribed in the walls of India Gate. It was earlier known as “All India War Memorial”. Situated on Rajpath, India Gate looks stunning in the evening lights. The lawn throughout Rajpath’s stretch is frequented by people as the atmosphere is pleasant.";

        ArrayList<SingleFamousPlaces> listDelhiplaces=new ArrayList<>();

        listDelhiplaces.add(new SingleFamousPlaces(R.drawable.redfort_delhi,"Red Fort",Red_Fort));
        listDelhiplaces.add(new SingleFamousPlaces(R.drawable.lotustemple_delhi,"Bahai (Lotus) Temple",Lotus_Temple));
        listDelhiplaces.add(new SingleFamousPlaces(R.drawable.indiagate_delhi,"India Gate",India_Gate));

        return listDelhiplaces;


    }
    public static ArrayList<SingleFamousPlaces> getMumbaiPlaces(){
        String Gateway_of_India="The 85 feet tall structure was built to commemorate King George, the Fifth’s visit to Mumbai. Incidentally, the last of British soldiers that were to leave India after independence, departed through Gateway of India. The monument’s architecture is a prefect blend of three styles, namely Hindu, Islam and European Gothic styles. You could take ferry from here to visit Elephanta Caves.";
        String Chhatrapati_Shivaji_Terminus="This was earlier known as Victoria Terminus. The construction was completed in the year 1897. UNESCO has declared the terminus as World Heritage Site in the year 2004. The building is a representation of architecture of various cultures including traditional Indian, Victorian and Gothic. Though it is a terminus to board and get off trains, you cannot help marveling at the stunning architecture of the building. Whether you intend to take a train or not, this is a must visit site in Mumbai.";
        String Nehru_Planetarium ="Nehru Planetarium was constructed in the year 1977. There is an art gallery inside the planetarium along with a library, cultural center and restaurant. Nehru Auditorium inside the planetarium has a seating capacity of nearly 1000 people. The auditorium is the venue for various concerts, dance performances and plays. The planetarium attracts astronomers and the future astronomers alike. Children love this place as they can engage themselves in various science related activities. Arrangements for viewing solar system, meteoroids showers and eclipses are made here. A place worth the visit if you are keen to know more about the world you live in.";


        ArrayList<SingleFamousPlaces> listMumbaiplaces=new ArrayList<>();

        listMumbaiplaces.add(new SingleFamousPlaces(R.drawable.gatewayofindia_mum,"Gateway of India",Gateway_of_India));
        listMumbaiplaces.add(new SingleFamousPlaces(R.drawable.chhatrapati_shivaji_terminus_mum,"Chhatrapati Shivaji Terminus",Chhatrapati_Shivaji_Terminus));
        listMumbaiplaces.add(new SingleFamousPlaces(R.drawable.nehruplanetarium_mum,"Nehru Planetarium",Nehru_Planetarium));
        return listMumbaiplaces;

    }

    public static ArrayList<SingleFamousPlaces> getAhmedabadPlaces(){

        String Adalaj_Step_Well="Adalaj Step Well was built by a Muslim king for the Vaghela queen Rani Roopba in 1499. The structure is an intricately carved water reservoir and is 5 stories in depth. The structure was built in the Hindu Solanki architectural style and is octagonal from top. The well is one of the best examples of the Persian-Muslim influenced architecture mixed with the Hindu architecture with its carvings, sculptures and the inscriptions that depict the story of its origin.";
        String Jama_Masjid="Built in 1421 AD during the reign of Ahmad Shah, the Juma or the Jama Masjid is one of the largest mosques in India. The mosque is built in a decorative Indian Persian-Muslim architecture and contains the tombs of the Muslim emperor, his wife and his sons. The structure is built entirely in sandstone with intricate artistic carvings, sandstone meshes (jails) and pillars. According to the inscriptions, the mosque was intented to be used by the Sultans and their family.";
        String Kankaria_Lake="The largest lake in Ahmedabad, Kankaria Lake is a manmade lake built in the 15th century by the Muslim ruler Sultan Qutbuddin and served as a bathing place for the kings. The lake is spread in a circumference of 3 miles and is built in a 34-sided polygonal shape with steps that lead into the water. The best time to visit the lake would be during the Kankaria Carnival, which is a week-long cultural and social festival held during the last week of December.";

        ArrayList<SingleFamousPlaces> listAhmedabadplaces=new ArrayList<>();
        listAhmedabadplaces.add(new SingleFamousPlaces(R.drawable.adalaj_stepwell_ahmedabad,"Adlaj Step Well",Adalaj_Step_Well));
        listAhmedabadplaces.add(new SingleFamousPlaces(R.drawable.jama_masjid_ahmedabad,"Jama Masjid",Jama_Masjid));
        listAhmedabadplaces.add(new SingleFamousPlaces(R.drawable.kankaria_lake_ahm,"Kankaria Lake",Kankaria_Lake));
        return listAhmedabadplaces;
    }
    public static ArrayList<SingleFamousPlaces> getLucknowPlaces(){

        String Bara_Imambara="The name refers to a shrine built by the Nawab Asaf-ud-daula in 1784, and is one of the largest buildings in Lucknow. The name ‘Bara Imambara’ is an Urdu word, wherein the word ‘Bara’ means big and ‘Imambara’ means the shrine complex. The complex includes the Asfi mosque and the Bhulbhulaiya or the Labyrinth. The Asfi mosque contains the tomb of Asaf-ud-daula, and the labyrinth is the only maze in India and supports the massive structure of the whole complex from the underground.";
        String DrAmbedkar_Park="Spread across an area of 107 acres of land, the modern architectural monument is dedicated to Dr. B.R. Ambedkar. The entire monument is built in red sandstone which was brought from the areas of Rajasthan. The park is located in Gomti Nagar which is one of the most posh localities of Lucknow. The well maintained lawns, various columns and a canal that surrounds the vicinity make it a well frequented tourist attraction.";
        String Chattar_Manzil="The name Chattar Manzil literally means the Umbrella Palace and was the residence to the Nawabs of Awadh and their successors. The palace was constructed in the 1780’s and became one of the major strongholds of the revolutionaries during the 1857 uprising. The architectural style of the original building was a cross between Indo-European styles and was later restored by the British according to their preferences.";

        ArrayList<SingleFamousPlaces> listLucknowplaces=new ArrayList<>();
        listLucknowplaces.add(new SingleFamousPlaces(R.drawable.bara_mambara_luc,"Bara Imambara",Bara_Imambara));
        listLucknowplaces.add(new SingleFamousPlaces(R.drawable.drambedkarpark_luc,"Dr. Ambedkar Park",DrAmbedkar_Park));
        listLucknowplaces.add(new SingleFamousPlaces(R.drawable.chattar_manzil_luc,"Chattar Manzil",Chattar_Manzil));
        return listLucknowplaces;

    }
    public static ArrayList<SingleFamousPlaces> getHyderabadPlaces(){
        String Charminar="The first tourist attraction that comes to mind when you think of Hyderabad is Charminar, which is located in the heart of the city. Mohammed Quli Qutub Shah constructed this monument in the year 1591. The architecture of Charminar reflects Cazia style. The idea behind constructing the monument was to ward off deadly epidemic, which claimed many lives during that period. The four minarets are 48.7 meter tall. There is a mosque and 45 prayer spaces inside Charminar. Do not get discouraged by the crowd there if you want to have a feel of the old city and its culture.";
        String Falaknuma_Palace="The magnificent palace is located on top of a hill, which is the reason for its name Falaknuma Palace, meaning Mirror of the Sky. The palace was built for the Fifth Paigah Emir by an architect from Italy. Nizam, the Sixth, bought it later. Nizam’s interest in arts can be gauged by the collections of statues, paintings, manuscripts and furniture from all parts of the world. The Sound and Light Show held here narrate the history of Golconda Fort and its glory.";
        String Golconda_Fort="The name Golconda finds its root in “Golla Konda”, which means Shepherd’s Hill. The fort was originally constructed during the period of Yadava Dynasty and later it was under the control of many other dynasties namely Kakatiya Dynasty, Bahmani Dynasty from whom it went into the control of Qutb Shahis and later Mughal Dynasty. The Golconda fort dates back to 13th century.If you clap your hands at Fateh Darwaza, the sound can be clearly heard at Bala Hissar, which is located a kilometer away. The royal palaces and whispering walls are some of its main attractions.";

        ArrayList<SingleFamousPlaces> listHyderabadPlaces=new ArrayList<>();
        listHyderabadPlaces.add(new SingleFamousPlaces(R.drawable.charminar_hyd,"Charminar",Charminar));
        listHyderabadPlaces.add(new SingleFamousPlaces(R.drawable.falaknumapalace_hyd,"Falaknuma Palace",Falaknuma_Palace));
        listHyderabadPlaces.add(new SingleFamousPlaces(R.drawable.golcondafort_hyd,"Golconda Fort",Golconda_Fort));
        return listHyderabadPlaces;

    }
    public static ArrayList<SingleFamousPlaces> getBangalorePlaces() {
        String LalBagh_Botanical_Gardens="This botanical garden is one of the most beautiful botanical gardens you could find in India. Constructed by Haider Ali, it was later modified by Tipu Sultan. The Glass House in the gardens was inspired by the London Crystal Palace. Spread across a sprawling 240 acres of land, the garden has above 1800 species of plants, herbs and trees. The lawn clock in the garden is the first of its kind in India.";
        String Bangalore_Palace="Bangalore Palace was constructed by Chamaraja Wodeyar in the year 1884 and he had his inspiration from England’s Windsor Castle. Located at city’s center, the Tudor style construction has Gothic windows, woodcarvings and turrets, which stand proof of the stunning architecture during the period. The 430-acre land that holds the palace has beautiful gardens. The palace is now used to conduct exhibitions and concerts.";
        String The_Government_Museum="It was built in the year 1886. The museum houses rare collections, which represent various periods. The 18 galleries in the museum have antique jewellery, Neolithic finds of various civilizations and so on. You will find amazing sculptures and old paintings here.";

        ArrayList<SingleFamousPlaces> listBangaloreplaces = new ArrayList<>();
        listBangaloreplaces.add(new SingleFamousPlaces(R.drawable.lalbagh_bang,"Lal Bagh Botanical Gardens",LalBagh_Botanical_Gardens));
        listBangaloreplaces.add(new SingleFamousPlaces(R.drawable.bangalorepalace,"Bangalore Palace",Bangalore_Palace));
        listBangaloreplaces.add(new SingleFamousPlaces(R.drawable.the_government_museum_bang,"The Government Museum",The_Government_Museum));
        return  listBangaloreplaces;
    }

    public static ArrayList<SingleFamousPlaces> getChennaiPlaces(){

        String Arignar_Anna_Zoological_Park="Arignar Anna Zoological Park is the first ever zoo in India. The zoo was established in the year 1855. The zoo was initially in the Moor market from where it was shifted to Vandalur in 1976. The massive 510-hectare zoo houses over 170 species of wildlife. Some of the wildlife found here includes tiger, hyena, lion, panther, elephants and many more. Elephant rides and lion safaris are available. If you are up to it, you could walk the entire stretch of the park. If not, you can tour on the battery operated vehicle rides.";
        String Marina_beach="Marina Beach is naturally the instant choice for everyone that visits Chennai. This is the second longest beach in the world. The large expanse of silver sand allows for a great walk along the seashore. Sunrise and sun set views are picturesque in this perfect setting. Some of the sports activities possible in Marina Beach include fishing, wind surfing and beach volley ball.";
        String Kapaleesware_temple="Kapaleeswarar Temple is one of the oldest temples in the city. It is not clear as to who built the temple. Going by the songs by Nayanmars, it is believed that Kapaleeswarar Temple was built during the 7th century by Pallava Kings. The architecture is not as old as they seem to be around 400 years old. Hence, it is considered that Portuguese destroyed the original temple mentioned in the songs of Nayanmars and the present construction belongs to the 16th century. The temple stands a classic example of the Dravidian style of sculpture and architecture.";

        ArrayList<SingleFamousPlaces> listChennaiplaces=new ArrayList<>();
        listChennaiplaces.add(new SingleFamousPlaces(R.drawable.arignar_anna_zoologicalpark_che,"Arignar Anna Zoological Park",Arignar_Anna_Zoological_Park));
        listChennaiplaces.add(new SingleFamousPlaces(R.drawable.marinabeach_che,"Marina Beach",Marina_beach));
        listChennaiplaces.add(new SingleFamousPlaces(R.drawable.kapaleeswarar_temple_che,"Kapaleeswarar Temple",Kapaleesware_temple));

        return listChennaiplaces;

    }
    public static ArrayList<SingleFamousPlaces> getKolkataPlaces(){
        String Howraw_Bridge="The construction of the sixth longest cantilever bridge in the world, the Howrah Bridge is one of the most famous landmarks of Kolkata. The bridge was originally called the New Howrah Bridge as it was meant to replace an older pontoon bridge on the Hoogly River. The bridge is often considered to be one of the major National Landmarks in India and is also called the Rabindra Setu after the famous Bengali literary figure Rabindranath Tagore.";
        String Victoria_Memorial="Victoria Memorial is located on the plains at the banks of the River Hoogly and was completed in 1921. It is dedicated in the memory of Queen Victoria and is currently a museum. After the death of Queen Victoria in 1901, Lord Curzon commissioned the construction of this memorial and is built in a unique architectural blend of Mughal and British styles. The museum contains 25 galleries that house various antiquities and artifacts.";
        String Indian_Museum="The Indian Museum in Kolkata is the largest and the oldest museums in India and was established in 1814. The museum contains 6 sections which are further split in 35 galleries and contain a plethora of various antiquities, artifacts, paintings and mummies etc. The museum was established by a Dutch botanist under the British, Dr. Nathaniel Wallich and is one of the oldest museums in the world.";

        ArrayList<SingleFamousPlaces> listKolkataplaces=new ArrayList<>();
        listKolkataplaces.add(new SingleFamousPlaces(R.drawable.howrahbridge_kol,"",Howraw_Bridge));
        listKolkataplaces.add(new SingleFamousPlaces(R.drawable.victoriamemorial_kol,"Victoria Memorial",Victoria_Memorial));
        listKolkataplaces.add(new SingleFamousPlaces(R.drawable.indianmuseum_kol,"Indian Museum",Indian_Museum));
        return listKolkataplaces;

    }

}
