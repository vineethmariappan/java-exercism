import java.util.ArrayList;

class TwelveDays {

    ArrayList<String> lyrics = new ArrayList<>();
    public TwelveDays(){
        lyrics.add("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.");
        lyrics.add("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.add("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
    }
    String verse(int verseNumber) {
        return lyrics.get(verseNumber-1)+"\n";
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder song = new StringBuilder();
        for(int index = startVerse-1;index<endVerse;index++){
            if(index==endVerse-1){
                song.append(lyrics.get(index)+"\n");
            }
            else
                song.append(lyrics.get(index)+"\n\n");
        }
        return song.toString();
    }
    
    String sing() {
        StringBuilder song = new StringBuilder();
        for(int index = 0;index<lyrics.size();index++){
            if(index==lyrics.size()-1){
                song.append(lyrics.get(index)+"\n");
            }
            else
                song.append(lyrics.get(index)+"\n\n");
        }
        return song.toString();
    }
}
