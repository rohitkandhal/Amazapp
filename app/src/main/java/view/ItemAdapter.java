package view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.amazapp.R;

import java.util.List;

import DAL.Item;
import view.FragmentItems;

/**
 * Created by Rohit on 3/19/14.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    public class ItemData {
        ImageView image;
        TextView name;
    }

    FragmentItems itemFragment;
    int resourceId;
    List<Item> dataObjects = null;

    public ItemAdapter(FragmentItems fragment, int resource, List<Item> objects) {
        super(fragment.getActivity(), resource, objects);

        this.itemFragment = fragment;
        this.resourceId = resource;
        this.dataObjects = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        ItemData itemData = null;

        if (listItem == null) {
            LayoutInflater inflater = this.itemFragment.getActivity().getLayoutInflater();
            listItem = inflater.inflate(resourceId, parent, false);

            itemData = new ItemData();
            itemData.image = (ImageView) listItem.findViewById(R.id.itemImage);
            itemData.name = (TextView) listItem.findViewById(R.id.itemName);

            listItem.setTag(itemData);
        } else {
            itemData = (ItemData) listItem.getTag();
        }

        Item item = dataObjects.get(position);
        itemData.name.setText(item.getName());
        // itemData.image.setImageResource(););
        return  listItem;
    }
}
