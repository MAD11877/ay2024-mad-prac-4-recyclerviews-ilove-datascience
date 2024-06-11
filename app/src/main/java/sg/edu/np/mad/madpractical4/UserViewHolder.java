package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

//import sg.edu.np.mad.prac4.R;

public class UserViewHolder extends RecyclerView.ViewHolder{
    ImageView smallimage;
    ImageView bigimage;
    TextView name;
    TextView description;
    public UserViewHolder(View itemView){
        super(itemView);
        smallimage= itemView.findViewById(R.id.imageView3);
        bigimage =itemView.findViewById(R.id.imageView4);
        name = itemView.findViewById(R.id.textView3);
        description =itemView.findViewById(R.id.textView4);
    }
}
