package lap.hou.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Lap on 09/10/2017.
 */

public class DataPerson {
    private String mPersonName;
    private String mPersonAge;
    private int mPersonImage;

    public DataPerson(String personName, String personAge, int personImage) {
        mPersonName = personName;
        mPersonAge = personAge;
        mPersonImage = personImage;
    }

    public String getPersonName() {
        return mPersonName;
    }

    public void setPersonName(String personName) {
        mPersonName = personName;
    }

    public String getPersonAge() {
        return mPersonAge;
    }

    public void setPersonAge(String personAge) {
        mPersonAge = personAge;
    }

    public int getPersonImage() {
        return mPersonImage;
    }

    public void setPersonImage(int personImage) {
        mPersonImage = personImage;
    }
}
