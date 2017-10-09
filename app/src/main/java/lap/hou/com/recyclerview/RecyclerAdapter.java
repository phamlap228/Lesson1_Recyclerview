package lap.hou.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lap on 09/10/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    ArrayList<DataPerson> dataPersons;
    Context mContext;

    public RecyclerAdapter(ArrayList<DataPerson> dataPersons, Context context) {
        this.dataPersons = dataPersons;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.personName.setText(dataPersons.get(position).getPersonName());
        holder.personAge.setText(dataPersons.get(position).getPersonAge());
        holder.personPhoto.setImageResource(dataPersons.get(position).getPersonImage());

    }

    @Override
    public int getItemCount() {
        if (dataPersons == null)
            return 0;
        else
            return dataPersons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView personName;
        private TextView personAge;
        private ImageView personPhoto;

        public ViewHolder(View itemView) {
            super(itemView);
            personName = itemView.findViewById(R.id.text_view_pers_name);
            personAge = itemView.findViewById(R.id.text_view_pers_age);
            personPhoto = itemView.findViewById(R.id.image_view_pers);
        }
    }

}
