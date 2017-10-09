package lap.hou.com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataPerson> dataPersons = new ArrayList<>();
        dataPersons.add(new DataPerson("caitlyn", "18", R.drawable.caitlyn));
        dataPersons.add(new DataPerson("leblanc", "18", R.drawable.leblanc));
        dataPersons.add(new DataPerson("leesin", "18", R.drawable.leesin));
        dataPersons.add(new DataPerson("mundo", "18", R.drawable.mundo));
        dataPersons.add(new DataPerson("wukong", "18", R.drawable.wukong));
        dataPersons.add(new DataPerson("yasuo", "18", R.drawable.yasuo));
        dataPersons.add(new DataPerson("zed", "18", R.drawable.zed));
        dataPersons.add(new DataPerson("caitlyn", "18", R.drawable.caitlyn));
        dataPersons.add(new DataPerson("leblanc", "18", R.drawable.leblanc));
        dataPersons.add(new DataPerson("leesin", "18", R.drawable.leesin));
        dataPersons.add(new DataPerson("mundo", "18", R.drawable.mundo));
        dataPersons.add(new DataPerson("wukong", "18", R.drawable.wukong));
        dataPersons.add(new DataPerson("yasuo", "18", R.drawable.yasuo));
        dataPersons.add(new DataPerson("zed", "18", R.drawable.zed));
        RecyclerView.Adapter adapterPerson = new RecyclerAdapter(dataPersons, this);
        recyclerView.setAdapter(adapterPerson);

    }
}
