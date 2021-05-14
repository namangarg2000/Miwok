package com.example.miwok;

public class Word {

    //m is added because they are private member variables.

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation
    private String mMiwokTranslation;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
