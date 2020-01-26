package id.ac.poliban.mi.auzan.listviewpahlawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class PahlawanAdapter extends BaseAdapter {
    //data merupakan object list dari kelas pojo Pahlawan
    private List<Pahlawan> data = new ArrayList<>();
    public PahlawanAdapter(List<Pahlawan> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_pahlawan;
        TextView tv_pahlawan_name;
        TextView tv_pahlawan_desc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_pahlawan, parent, false);

        //deklarasikan view
        img_pahlawan = convertView.findViewById(R.id.img_pahlawan);
        tv_pahlawan_name = convertView.findViewById(R.id.tv_pahlawan_name);
        tv_pahlawan_desc = convertView.findViewById(R.id.tv_pahlawan_desc);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getPahlawanFoto())
                .apply(new RequestOptions().override(60,60))
                .into(img_pahlawan);
        tv_pahlawan_name.setText(data.get(position).getPahlawanNama());
        tv_pahlawan_desc.setText(data.get(position).getPahlawanDesc());

        return convertView;
    }
}
