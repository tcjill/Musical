package android.example.musical;

public class Song {

    /**
     * Default translation for the word Musical artist
     */
    private String mDefaultArtist;
    private String mSongTranslation;

    public Song(String defaultArtist, String songTranslation) {
        mDefaultArtist = defaultArtist;
        mSongTranslation = songTranslation;
    }


    public String getDefaultArtist() {
        return mDefaultArtist;
    }

    public String getSongTranslation() {
        return mSongTranslation;
    }


}