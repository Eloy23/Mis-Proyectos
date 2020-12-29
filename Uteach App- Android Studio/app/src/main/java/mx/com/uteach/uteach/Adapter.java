package mx.com.uteach.uteach;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.List;

/**
 * Created by eloy2311 on 27/02/2020.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ClaseViewHolder>{



    private Context mCtx;
    private List<Clases> clasesList;
    private OnClassListener onClassListener;
    public Adapter(Context mCtx, List<Clases> clasesList, OnClassListener onClassListener){
        this.mCtx = mCtx;
        this.clasesList = clasesList;
        this.onClassListener = onClassListener;

    }
    public  ClaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.listclass_layout,null);
        return new ClaseViewHolder(view,onClassListener);
    }

    public void onBindViewHolder(ClaseViewHolder holder, int position){
        Clases clases = clasesList.get(position);
        Uri path =Uri.fromFile(new File(clasesList.get(position).getImagen()));
        String path3 = clasesList.get(position).getImagen().toString();
        String path2 ="http://www.uteach.com.mYx/public/img/";
        Glide.with(mCtx)
                .load(path2+path3)
                .into(holder.imageView2);

        holder.textView5.setText(clases.getNombres());
        holder.textView4.setText (clases.getPrecios());


    }

    public int getItemCount(){return clasesList.size();}

    class ClaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView5, textView4;
        ImageView imageView2;
        OnClassListener onClassListener;

        public ClaseViewHolder(View itemView, OnClassListener onClassListener){
            super(itemView);

            textView5= itemView.findViewById(R.id.textView5);
            textView4= itemView.findViewById(R.id.textView4);
            imageView2 = itemView.findViewById(R.id.imageView2);
            this.onClassListener = onClassListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onClassListener.onClassClick(getAdapterPosition());
        }
    }

    public interface OnClassListener{
        void onClassClick(int position);

    }
}




