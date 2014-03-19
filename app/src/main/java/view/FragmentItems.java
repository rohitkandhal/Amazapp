package view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.amazapp.R;

import java.util.ArrayList;

import DAL.Item;
import DAL.ItemsDataSource;

/**
 * Created by Rohit on 3/18/14.
 */
public class FragmentItems extends Fragment {


    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_items, container, false);

        String[] fromColumns = {"Rohit", "Sumit", "Sagar", "Asit"};
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.setupItemsList();
    }

    private void setupItemsList() {
        ArrayList<Item> itemsCollection = ItemsDataSource.getAllItems();
        ItemAdapter itemAdapter = new ItemAdapter(this,
                R.layout.listview_item_style, itemsCollection);

        ListView listView = (ListView) this.getView().findViewById(R.id.itemsListView);
        listView.setAdapter(itemAdapter);
    }

}
