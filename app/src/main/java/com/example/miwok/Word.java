package com.example.miwok;

public class Word {

    //m is added because they are private member variables.

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation
    private String mMiwokTranslation;

    //image resource id
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //constant depicting if no image has been passed
    private static final int NO_IMAGE_PROVIDED = -1;
    //we use -1 as it is out of the scope of all the resource ids

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //image resource id is drawable image resource id
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    /*
    * Method returns true when image resource has been set
    * */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
