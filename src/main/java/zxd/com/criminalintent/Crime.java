package zxd.com.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Date getDate() {

        return mDate;
    }

    public boolean isSolved() {//boolean类型的getter方法自动是is开头
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public String toString(){
        return mTitle;
    }


}
